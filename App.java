import java.io.*;
import java.net.*;
import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkRegex;
import org.takes.facets.fork.TkFork;
public final class App{
 public static void main(final String... a) throws Exception{
     new FtBasic(new TkFork(new FkRegex("/"),
			    new TkRegex(){
      @Override
	  public Response act(final RqRegex request) throws IOException {
      
),2805).start(Exit.NEVER);
  //     https://systembash.com/a-simple-java-udp-server-and-udp-client/
*  public Response act(final RqRegex request) throws IOException {
      final File file = new File(
				 request.matcher().group("path")
				 );
      return new RsHTML(
			FileUtils.readFileToString(file, Charsets.UTF_8)
			);
			}

}}