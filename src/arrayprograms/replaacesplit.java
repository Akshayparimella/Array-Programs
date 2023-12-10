package arrayprograms; //package name
import java.util.Scanner;// scanner class header file
public class replaacesplit // class name replace(), split() method
{
public static void main(String[] args)//main function
{
String mystr="windows10-to-windows12"; // string mystr
System.out.println(mystr.replace("12","11"));// is used to replace old characters with new initialize characters
String[] s=mystr.split("-",-1); // is used to split the strings into sub strings
for(String check:s) // for loop syntax and declaration to check:s
	{
		System.out.println(check); // check the  given strings
	}
}
}


