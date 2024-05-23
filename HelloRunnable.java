public class HelloRunnable implements Runnable{
public void run(){
System.out.println("hello from a thread");
}
public static void main(String[] args){
(new Thread(new HelloRunnable())).start();
}
}