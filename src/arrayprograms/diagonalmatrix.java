package arrayprograms; //package name
import java.util.Scanner;//  header file scanner class 
public class diagonalmatrix //class name
{
public static void main(String args[])//main function
{
int a[][]= new int[100][100]; // initialization of an array and size of an
int i,n,j,sum=0; // integer values i,n,j,sum=0
Scanner sc=new Scanner(System.in); //scanner object
System.out.println("enter your diagonal matrix"); // enter your diagonal matrix
n=sc.nextInt(); // read the number lines from the user input
System.out.println("your diagonal matrix order is" +n+ "x" +n); //your diagonal matrix
System.out.println("enter your A matrix"); //enter A matrix
for(i=0;i<n;i++) //for loop declaration for i variable
{
	for(j=0;j<n;j++) //for loop declaration for j variable
	{
	 a[i][j]=sc.nextInt(); //object of a[i][j]
	}
}
System.out.println("your entered A matrix"); // entered A matrix
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
System.out.print(a[i][j]+"\t"); //print a[i][j] 
	}
System.out.println();
}
System.out.println("sum of one side diagonal"); //sum of one side diagonal
for(i=0;i<n;i++)
{
	sum =sum+a[i][i]; //sum+a[i][i]
}
System.out.println(sum);
sum=0;//sum=0
{
System.out.println("sum of other side of the diagonal"); //other side of a diagonal
for(i=0,j=n-1;i<n;i++,j--) //for loop declaration for i and j variables
{
	sum=sum+a[i][j]; //sum+a[i][j]
}
System.out.println(sum); //print sum of other side of the diagonal
}
}
}
