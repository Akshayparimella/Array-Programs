package arrayprograms;// package name
import java.util.Scanner;//header file Scanner class 
public class charAtlength // class name uppercase(),lowercase(),charat() 
{
public static void main(String[] args)//main function
{
String str= "welcome to windows 11"; // string characters are str
System.out.println( str+= "  ");
for(int i=0;i<str.length();i++)// for loop syntax and declaration for a string length 
{
	System.out.println(str.charAt(i));// charAt() it index starts from 0  
}
System.out.println(); //print statement
System.out.println(str.toUpperCase());// it converts lower case to upper case
System.out.println(str.toLowerCase());//it converts upper case to lower  case 
System.out.println(str.indexOf('1'));// it returns the character position or index value
	}
}
