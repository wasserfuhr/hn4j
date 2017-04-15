import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.server.nio.*;
import org.eclipse.jetty.server.ssl.*;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import clojure.lang.*;
public class Jet extends AbstractHandler{
 public void handle(String t,Request br,HttpServletRequest rq,HttpServletResponse rs)throws IOException,ServletException{
  try{
   RT.loadResourceScript("clojure/data/json.clj");
   RT.loadResourceScript("hiccup/core.clj");
   String c="(fn[rq rs]((eval(read-string(slurp\"/root/git/hn4j/boot.clj\")))rq rs))";
   PushbackReader pr=new PushbackReader(new StringReader(c));
   Object r=LispReader.read(pr,true,null,false);
   IFn rf=(IFn)clojure.lang.Compiler.eval(r);
   //rs.setCharacterEncoding("UTF-8");
   rs.getWriter().print(rf.invoke(rq,rs));
  }finally{}
  br.setHandled(true);}
 public static void main(String[] a)throws Exception{
  new Ur().start();
  Server s=new Server();
  SelectChannelConnector connector=new SelectChannelConnector();
  connector.setPort(80);
  SslContextFactory sslContextFactory = new SslContextFactory();
  sslContextFactory.setKeyStorePath("/root/keystore.jks");
  String pw=System.getProperty ("pw");
  sslContextFactory.setKeyStorePassword(pw);
  sslContextFactory.setKeyManagerPassword(pw);
  SslSocketConnector sslConnector = new SslSocketConnector(sslContextFactory);
  sslConnector.setPort(443);
  s.setConnectors(new Connector[]{connector,sslConnector});
  s.setHandler(new Jet());
  s.start();
  s.join();}}
