import java.util.*;
public class stri{
public static void main(String[] args){
char ch;
char space = " ";
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for(int i = 0;i<n;i++){
System.out.println("enter a string");
ch = sc.next();
}
for(int i = 0;i<str.length();i++){
ch = charAt(i);
space = ch + space;
}
System.out.println(space);
}
}