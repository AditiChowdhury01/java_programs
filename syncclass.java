class Table{
synchronized static void printTable(int n){

//System.out.println("new thread occured:"+n);

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


class MyThread1 extends Thread{

public void run(){
Table.printTable(1);
} 
}

class MyThread2 extends Thread{

public void run(){
Table.printTable(5);
} 
}

class MyThread3 extends Thread{

public void run(){
Table.printTable(10);
} 
}


public class syncclass{
public static void main(String[] args){
MyThread1 t1 = new MyThread1();
MyThread2 t2 = new MyThread2();
MyThread3 t3 = new MyThread3();

t1.start();
t2.start();
t3.start();


}
}
