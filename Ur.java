import java.io.*;
public class Ur extends Thread{
 public void run(){try{
  long lastSec=0;
  while(true){
   long c=System.currentTimeMillis();
   long t=(lastSec+1)*1000-c;
   if(t<=0){
    //http://stackoverflow.com/questions/1625234/how-to-append-text-to-an-existing-file-in-java
       PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("myfile.txt", true)));
       out.println("the text");
       out.close();

    System.out.println(c);
    Runtime.getRuntime().exec("/root/git/hn4j/job.sh");
    lastSec=c/1000;
   }else{
    sleep(t/2);}}
  }catch(Exception e){System.err.println(e.getMessage());}}
 public static void main(String[] a)throws Exception{
  new Ur().start();}}
