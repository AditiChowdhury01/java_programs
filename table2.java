class Table{

void printTable(int n){
System.out.println("new thread occured:"+n);

synchronized(this){
for(int i = 1;i<=5;i++){
System.out.println(n*i);

try{
Thread.sleep(500);
}
catch(Exception e){
System.out.println(e);
}
}
}
}
}

class MyThread1 extends Thread{
Table t;
MyThread1(Table t){
this.t =  t;
}
public void run(){
t.printTable(5);
} 
}

class MyThread2 extends Thread{
Table t;
MyThread2(Table t){
this.t =  t;
}
public void run(){
t.printTable(11);
} 
}

class MyThread3 extends Thread{
Table t;
MyThread3(Table t){
this.t =  t;
}
public void run(){
t.printTable(14);
} 
}


public class table2{
public static void main(String[] args){
Table obj = new Table();
MyThread1 t1 = new MyThread1(obj);
MyThread2 t2 = new MyThread2(obj);
MyThread3 t3 = new MyThread3(obj);

//System.out.println(obj1.getId()+":"+obj1.getName());
//System.out.println(obj2.getId()+":"+obj2.getName());
t1.start();
t2.start();
t3.start();


}
}
