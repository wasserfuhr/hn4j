import org.takes.http.Exit;
import org.takes.http.FtBasic;
import org.takes.facets.fork.FkRegex;
import org.takes.facets.fork.TkFork;
public final class App{
 public static void main(final String... a) throws Exception{
     new FtBasic(new TkFork(new FkRegex("/","HelloWorld!")),2805).start(Exit.NEVER);}}