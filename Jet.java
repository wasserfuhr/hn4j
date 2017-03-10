0;256;0c
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.server.ssl.*;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import clojure.lang.*;
// java -cp jetty-all-8.1.9.v20130131.jar:clojure-1.8.0.jar:hiccup-2.0.0-alpha1.jar:javax.servlet-api-3.1.0.jar:. Jet &
//http://www.eclipse.org/jetty/documentation/current/advanced-embedding.html :
public class Jet extends AbstractHandler{
 public void handle(String t,Request br,HttpServletRequest rq,HttpServletResponse rs)throws IOException,ServletException{
  try{
   RT.loadResourceScript("hiccup/core.clj");
   //RT.loadResourceScript("clojure/data/json.clj");
   String c=//"(fn[rq rs](hiccup.core/html\"<!DOCTYPE html>\"[:html[:head[:title\"α\"]][:body\"α\"]]))";
   //"(fn[rq rs]((eval(read-string(slurp\"https://knot-net.appspot.com/jboot\")))rq rs))";
    "(fn[rq rs]((eval(read-string(slurp\"/root/git/hn4j/boot.clj\")))rq rs))";
   PushbackReader pr=new PushbackReader(new StringReader(c));
   Object r=LispReader.read(pr,true,null,false);
   IFn rf=(IFn)clojure.lang.Compiler.eval(r);
   rs.setCharacterEncoding("UTF-8");
   rs.getWriter().print(rf.invoke(rq,rs));
  }finally{}
  br.setHandled(true);}
 public static void main(String[] a)throws Exception{
  //new Ur().start();
  Server s = new Server();
  //https://dzone.com/articles/adding-ssl-support-embedded
  SocketConnector connector = new SocketConnector(s);
  connector.setPort(9999);
  SslContextFactory sslContextFactory = new SslContextFactory();
  sslContextFactory.setKeyStorePath(EmbeddedServer.class.getResource(
   "/keystore.jks").toExternalForm());
  sslContextFactory.setKeyStorePassword("123456");
  sslContextFactory.setKeyManagerPassword("123456");
  SslSocketConnector sslConnector = new SslSocketConnector(sslContextFactory);
  sslConnector.setPort(443);
  s.setConnectors(new Connector[]{connector,sslConnector});
  s.setHandler(new Jet());
  s.start();
  s.join();}}
