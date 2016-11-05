import java.io.PushbackReader;
import java.io.StringReader;
import java.net.DatagramPacket;
import clojure.lang.Compiler;
import clojure.lang.IFn;
import clojure.lang.LispReader;
import clojure.lang.RT;
public class Clj{
public static void exec(DatagramPacket p)throws Exception{
String c=new String(p.getData());
PushbackReader pr = new PushbackReader(new StringReader(c));
Object expr=LispReader.read(pr,true,null,false);
IFn fn=(IFn) Compiler.eval(expr);
  fn.invoke(p);}}
