class MyThread extends Thread{
int val;
MyThread(String Sname,int val){
super(Sname);
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

public class ExmpThread{
public static void main(String[] args){
MyThread obj1 = new MyThread("one",69);
MyThread obj2 = new MyThread("two",96);
System.out.println(obj1.getId()+":"+obj1.getName());
System.out.println(obj2.getId()+":"+obj2.getName());
obj1.start();
obj2.start();

}
}