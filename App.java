import java.io.*;
import java.net.*;
import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.Response;
import org.takes.rs.RsHtml;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.RqRegex;
import org.takes.facets.fork.TkRegex;
import org.takes.facets.fork.TkFork;
public final class App{
 public static void main(final String... a) throws Exception{
  new FtBasic(new TkFork(new FkRegex("/",
   new TkRegex(){@Override public Response act(final RqRegex rq) throws IOException{
    return new RsHtml("<html>Hello, world!</html>");}})),2805).start(Exit.NEVER);}
  //     https://systembash.com/a-simple-java-udp-server-and-udp-client/
}