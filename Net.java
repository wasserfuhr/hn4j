import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;
//https://systembash.com/a-simple-java-udp-server-and-udp-client/
public class Net{
 public static void main(String[]a)throws Exception{
  DatagramSocket s=new DatagramSocket(1337);
  byte[] rd=new byte[1024];
  byte[] sd=new byte[1024];
  while(true){
   DatagramPacket rp=new DatagramPacket(rd,rd.length);
   s.receive(rp);
   System.out.print(System.currentTimeMillis()-0x5608aa2b*1000);
   String sen=new String(rp.getData());
   System.out.println("IN: "+sen);
   System.out.println(" "+rp.getLength());
   sd=sen.toUpperCase().getBytes();
   System.out.println(" "+new Date().getTime());
   DatagramPacket sp=new DatagramPacket(sd,sd.length,rp.getAddress(),rp.getPort());
   s.send(sp);}}}
