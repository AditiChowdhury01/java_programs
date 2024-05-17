import java.util.*;

public class rev{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a string line :");
String s = sc.nextLine();

StringTokenizer st = new StringTokenizer(s);
while (st.hasMoreTokens()){
String word = st.nextToken();
System.out.print(new StringBuilder(word).reverse().toString() + " ");
}

}
}