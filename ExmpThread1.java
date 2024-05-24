class MyThread1 extends Thread{
int val;
MyThread1(int val){

this.val =  val;
}

public void run(){
for(int i = 1; i <= 5;i++){
System.out.println(val*i);

try{
Thread.sleep(500);
}
catch(Exception e){
System.out.println(e);
}
}
}
}

class MyThread2 extends Thread{
int val;
MyThread2(int val){

this.val =  val;
}

public void run(){
for(int i = 1; i <= 5;i++){
System.out.println(val*i);

try{
Thread.sleep(1000);
}
catch(Exception e){
System.out.println(e);
}
}
}
}

public class ExmpThread1{
public static void main(String[] args){
MyThread1 obj1 = new MyThread1(69);
MyThread2 obj2 = new MyThread2(96);
System.out.println(obj1.getId()+":"+obj1.getName());
System.out.println(obj2.getId()+":"+obj2.getName());
obj1.start();
obj2.start();

}
}