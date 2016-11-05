import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.security.MessageDigest;

    import java.util.Scanner;

    import javax.xml.bind.DatatypeConverter;

    
//https://systembash.com/a-simple-java-udp-server-and-udp-client/
public class Net{
 public static void main(String[]a)throws Exception{
  DatagramSocket s=new DatagramSocket(1337);
  byte[] rd=new byte[0x10000];
  byte[] sd=new byte[1024];
  int ct=0;
  while(true){
   DatagramPacket rp=new DatagramPacket(rd,rd.length);
   s.receive(rp);
   System.out.print(
    String.format("%x",
     System.currentTimeMillis()/1000-0x5608aa2b));
   for(byte b:rp.getData())
    System.out.print(String.format("%02x", b & 0xff));

   MessageDigest digest = MessageDigest.getInstance("SHA-256");
   
   byte[] hash = digest.digest(data.getBytes("UTF-8"));
   31
       DatatypeConverter.printHexBinary(hash)
       return bytesToHex(hash); // make it printable
   32

       
   String sen=new String(rp.getData());
   System.out.println("IN: "+sen);
   System.out.println(" "+rp.getLength());
   sd=sen.toUpperCase().getBytes();
   DatagramPacket sp=new DatagramPacket(sd,sd.length,rp.getAddress(),rp.getPort());
   s.send(sp);
   ct++;}}}
