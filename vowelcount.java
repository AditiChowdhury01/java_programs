import java.io.FileInputStream;
public class vowelcount{
public static void main(String[] args){
try{
FileInputStream fin = new FileInputStream("myfile.txt");
int i =0;
int count = 0; 
//chr ch = char.toLowerCase(i);
while((i=fin.read())!=-1){
if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u'){
System.out.println((char)i);

count = count+1;
}
}
System.out.println(count);

fin.close();

}
catch(Exception e){
System.out.println(e);

}
}
}