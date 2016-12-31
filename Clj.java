import java.io.PushbackReader;
import java.io.StringReader;
import java.net.DatagramPacket;
import clojure.lang.Compiler;
import clojure.lang.IFn;
import clojure.lang.LispReader;
public class Clj{public static void exec(DatagramPacket p)throws Exception{
Object e=LispReader.read(new PushbackReader(new StringReader(new String(p.getData()))),true,null,false);
((IFn)Compiler.eval(e)).invoke(p);}}
