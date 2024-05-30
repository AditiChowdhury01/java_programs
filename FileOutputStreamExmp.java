import java.io.FileOutputStream;
public class FileOutputStreamExmp{
public static void main(String[] args){
try{
FileOutputStream fout = new FileOutputStream("myfile.txt");

String s = "hello everyone";
byte b[] = s.getBytes();
fout.write(b);
fout.close();
System.out.println("success");

}
catch(Exception e){
System.out.println("success");

}
}
}