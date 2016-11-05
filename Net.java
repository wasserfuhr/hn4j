import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.xml.bind.DatatypeConverter;
//https://systembash.com/a-simple-java-udp-server-and-udp-client/
//http://www.quickprogrammingtips.com/java/how-to-generate-sha256-hash-in-java.html
public class Net{
 public static void main(String[]a)throws Exception{
  DatagramSocket s=new DatagramSocket(1337);
  byte[] rd=new byte[0x100];
  byte[] sd=new byte[1024];
  long ct=0;
  if(a.length>0)ct=Long.parseLong(a[0],16);
  while(true){
   System.out.print(String.format("%x ",ct));
   DatagramPacket rp=new DatagramPacket(rd,rd.length);
   s.receive(rp);
   int p=rp.getPort();
   byte n[]=Arrays.copyOf(rp.getData(),rp.getLength());
   System.out.print(String.format("%x ",System.currentTimeMillis()/1000-0x5608aa2b));
   String i[]=rp.getAddress().getHostAddress().substring(1).split("\\.");
   for(int j=0;j<4;j++)
    System.out.print(String.format("%2x",new Integer(i[j])));
   System.out.print(String.format(" %x ",p));
   MessageDigest digest = MessageDigest.getInstance("SHA-256");
   byte[] hash = digest.digest(n);
   String hh=DatatypeConverter.printHexBinary(hash).toLowerCase();
   System.out.print(hh+" ");
   for(byte b:n)System.out.print(String.format("%02x",b&0xff));
   System.out.println();
   String sen=new String(rp.getData());
   sd=(ct+sen).getBytes();
   DatagramPacket sp=new DatagramPacket(sd,sd.length,rp.getAddress(),p==0?1337:p);
   s.send(sp);
   ct++;}}}
