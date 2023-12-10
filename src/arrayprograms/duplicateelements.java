package arrayprograms;  //package name 
import java.util.Scanner; // header file scanner class
public class duplicateelements { //class name
public static void main(String[] args) //main function 
{ 
int a[]=new int [] {2,5,11,2,5,10,11,8}; // array declaration 
int i,j;  //initializing integer variables
int n=a.length; //creating an object
for(i=0;i<n;i++) // for loop syntax and declaration
{
	System.out.println(a[i]+"\t");  // print a[i] values
	}
System.out.println();
for(i=0;i<n;i++) // declaration for loop of i variable
{
	for(j=i+1;j<n;j++) //declaration for loop of j variable
	{
		if(a[i]==a[j]) //if condition a[i]==a[j]
		{
System.out.print(a[j]); //print a[j] values
}
}
}
}
}
