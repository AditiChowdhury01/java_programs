import java.util.*;
interface sortable{
public void sort(int[] arr);
}
class BubbleSort implements sortable{
public void sort(int[] arr){
int n = arr.length;
for(int i = 0;i<n;i++){
//boolean s = false;
for(int j = 0;j<n-i-1;j++){
if (arr[j] > arr[j+1]){
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
//s = true;
}
}
}
//if (s==true){
//break;
//}

}
}

class SelectionSort implements sortable{
public void sort(int[] arr){
int n = arr.length;
for(int i = 0;i<n-1;i++){

int min = i;
for(int j = i+1;j<n;j++){
if (arr[j]<arr[min]){
min = j;
}
}
int temp = arr[i];
arr[i] = arr[min];
arr[min] = temp;
}
}
}


public class sorting{
public static void main(String[] args){
int[] arr = {30,12,34,10,5,78};
//int[] arr = {34,20,10,5,40,80};
BubbleSort bs = new BubbleSort();
bs.sort(arr);
System.out.println("the sorted arr is : ");
prarr(arr);
SelectionSort ss = new SelectionSort();
ss.sort(arr);
System.out.println("the sorted arr is : ");
prarr(arr);

}
private static void prarr(int[] arr){
for (int num:arr){
System.out.print(num +" ");
}
System.out.println();
}


}