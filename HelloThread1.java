public class HelloThread1{
public void run(){
System.out.println("hello from a thread");
}
public static void main(String[] args){
(new HelloThread1()).run();
}
}