import java.util.*;
class fact{

public static double factorial(int n){
int fact = 1;
for(int i = 2;i<=n;i++){
fact = fact*i;
}
long [] arr = {fact};
for(long i : arr){
System.out.println(arr[i]);}
return fact;

}

/*public static long[] arr(){
long [] arr = {fact};
return arr;
}*/

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter a number:");
int n = sc.nextInt();
System.out.println(factorial(n));
//long [] arr1 = {};


}
}
