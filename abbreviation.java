import java.util.*;
public class abbreviation{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
System.out.println("enter your name: ");
String s = sc.nextLine();
String[] word = s.split(" ");
if (s.length()>2){
System.out.print(word[0].charAt(0));
System.out.print("."+word[1].charAt(0));
System.out.print("."+word[2]);
}
if (s.length()<2){
System.out.print(word[0].charAt(0));
System.out.print("."+word[1].charAt(0));
}

}
}