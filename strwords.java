import java.util.*;
class NoVowelException extends Exception{
NoVowelException(String str){
super(str);
}
}

public class strwords{
public static void word(String w) throws NoVowelException{
boolean conVowel = false;
String Vowel = "aeiouAEIOU";
for(int i = 0;i<w.length();i++){
char ch = w.charAt(i);

if(Vowel.contains(String.valueOf(ch))){
conVowel = true;
break;
}
}
if(!conVowel){
throw new NoVowelException("string does not contain vowels");
}
}
public static void main(String[] args){
try{
Scanner sc = new Scanner(System.in);
System.out.println("enter a string:");
String w = sc.nextLine();
word(w);
System.out.println("string contains vowels");

}
catch(Exception e){
System.out.println(e);

}
}

}

