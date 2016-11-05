import java.io.PushbackReader;
import java.io.StringReader;
import clojure.lang.Compiler;
import clojure.lang.IFn;
import clojure.lang.LispReader;
import clojure.lang.RT;
public class Clj{
 public static void exec(byte b[])throws Exception{
  RT.loadResourceScript("hiccup/core.clj");
  RT.loadResourceScript("clojure/data/json.clj");
  String c="(fn [rq rs] ((eval (read-string (slurp \"https://dresdenlabs.appspot.com/boot\"))) rq rs))";
  PushbackReader pr = new PushbackReader(new StringReader(c));
  Object rootHandlerExpr=LispReader.read( pr, true, null, false);
  IFn rootHandlerFn=(IFn) Compiler.eval( rootHandlerExpr);
  rootHandlerFn.invoke(request,response);}}
