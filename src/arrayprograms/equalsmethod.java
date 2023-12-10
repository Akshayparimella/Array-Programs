package arrayprograms;// package name
import java.util.Scanner; //header file scanner class
public class equalsmethod { //class name equals() method equalsignorecase ==operator
public static void main(String[] args)// main function 
{
String s1="laptoP"; //string s1
String s2="laptop"; //string s2
if(s1.equals(s2))//it used to compare values in the object
{
	System.out.println("true"); // print true
}
else//else block
{
	System.out.println("false"); // print false when the given condition is false
}
if(s1.equalsIgnoreCase(s2))//this method ignore case-sensitive
{
	System.out.println("true");//print true when the given condition is true
}
else//else block
{
	System.out.println("false"); //print false 
}
if(s1==s2)//== operator is used to compare object address reference
{
System.out.println("true");	// print true if given condition is true
}
else //else block
{
System.out.println("false");// print false if the given condition is not true
}
}
}
