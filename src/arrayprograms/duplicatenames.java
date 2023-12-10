package arrayprograms; //package names
import java.util.Scanner; // header file scanner class
public class duplicatenames //class name
{
public static void main(String[] args) //main function
{
int i,j; //initializing integer variables
String[] names={"aa","kk","hh","aa","kk","aa","hh"};// array declaration string names
int n=names.length; //object creation
for(i=0;i<n;i++) //for loop declaration and syntax
{
	System.out.println(names[i]+"\t"); //print names[i]
}
System.out.println(); 
for(i=0;i<n;i++)  // declaration for loop of i variable
{
	for(j=i+1;j<n;j++) //declaration for loop of j variable
	{
		if(names[i]==names[j]) //if condition names[i]==names[j]
		{
			System.out.println(names[j]); //print names[j]
		}
	}
}
}
}

