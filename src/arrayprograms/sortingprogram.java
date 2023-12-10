package arrayprograms;  //package name
import java.util.Arrays; //java scanner package header file
public class sortingprogram { //class name
public static void main(String[] args) { //main function 
int a[]= {77,98,12,457,654,57,75};   //initialize an integer array a with given values 
int n=a.length;                      //get the length of the array a
System.out.println("array length is"+ n);// print the length of the array
System.out.println("before sorting");
for(int i=0;i<n;i++)   //for loop syntax and declaring 
{
	System.out.print(a[i]+"\n"); //print the elem3ents of array a before sorting
	}
System.out.println(); 
Arrays.sort(a); //sort the array a in ascending order 
System.out.print("ascending order");
for(int i=0;i<n;i++) //for loop for ascending order
{
	System.out.print(a[i]+"\n");
}
System.out.println("descending order");
for(int i=n-1;i>=0;i--) // for loop for descending order
{
System.out.println(a[i]+"\t"); //print the elements of the array a in descending order
}
}
}




