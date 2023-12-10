package arrayprograms;//package name
public class exampleequal {//class name
public static void main(String[] args)//main function 
{
String data1= "laptop";
String data2= "windows";
if(data1==data2) // ==operator used to compare objects
{
	System.out.println("Strings are same");
}
else
{
	System.out.println("Strings are not same");
}
if(data1.equals(data2)) //equals() is used to compare object values
{
	System.out.println("strings are same");
}
else  // else block print if statement not true 
{
	System.out.println("String are not same");
}
}
}
