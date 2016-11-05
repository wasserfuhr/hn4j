import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
//https://systembash.com/a-simple-java-udp-server-and-udp-client/
//http://www.quickprogrammingtips.com/java/how-to-generate-sha256-hash-in-java.html
public class Net{
 public static void main(String[]a)throws Exception{
  DatagramSocket s=new DatagramSocket(1337);
  byte[] rd=new byte[0x100];
  byte[] sd=new byte[1024];
  int ct=0;
  while(true){
   DatagramPacket rp=new DatagramPacket(rd,rd.length);
   s.receive(rp);
   byte n[]=Arrays.copyOf(rp.getData(),rp.getLength());
   System.out.print(String.format("7%x",System.currentTimeMillis()/1000-0x5608aa2b));
   System.out.print(String.format("%x",ct));
   System.out.print(rp.getAddress().getHostAddress());
   String i[]=rp.getAddress().getHostAddress().substring(1).split("\\.");
   System.out.print(String.format("%02x",i[0]));
   System.out.print(String.format("%02x",i[1]));
   System.out.print(String.format("%02x",i[2]));
   System.out.print(String.format("%02x",i[3]));
   for(byte b:n)System.out.print(String.format("%02x",b&0xff));
   MessageDigest digest = MessageDigest.getInstance("SHA-256");
   byte[] hash = digest.digest(n);
   String hh=DatatypeConverter.printHexBinary(hash).toLowerCase();
   System.out.println(hh);
   String sen=new String(rp.getData());
   sd=(ct+sen).getBytes();
   DatagramPacket sp=new DatagramPacket(sd,sd.length,rp.getAddress(),rp.getPort());
   s.send(sp);
   ct++;}}}
