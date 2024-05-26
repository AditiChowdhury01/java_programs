import java.util.*;
public class freq{
static final int chars = 256;

static char frequency(String str){
int[] ar = new int[chars];
int i;

for (i = 0; i<str.length(); i++){
(ar[str.charAt(i)])++;
}

int first = 0,second = 0;
for (i = 0;i<chars;i++){
if (ar[i] > ar[first]){
second = first;
first = i;
}
else if (ar[i] >ar[second] && ar[i] != ar[first]){
second = i;
}
}
return (char) second;
}
public static void main(String[] args){
String str;
Scanner sc = new Scanner(System.in);
System.out.println("enter a string :");
str = sc.next();

char res = frequency(str);
if (res != '\0'){
System.out.println(res);
}
else{
System.out.println("no second most character in the string");
}
}
}