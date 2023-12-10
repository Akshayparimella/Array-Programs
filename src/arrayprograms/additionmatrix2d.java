package arrayprograms; //package array programs
import java.util.Scanner;  //scanner package header file
public class additionmatrix2d { //class name addition 2d matrix
public static void main(String[] args) //main function public specifier 
{ 
int[][] a= new int[100][100]; //initializing a array[][] size[100][100]
int[][] b= new int[100][100]; //initializing b array[][] size[100][100]
int n,i,j;                    //integer variables n,i,j
Scanner sc= new Scanner(System.in); //scanner object
System.out.println("enter your addition matrix size"); //enter addition matrix
n=sc.nextInt();
System.out.println("your matrix size is" +n+ "x" +n); // enter matrix size
System.out.println("enter a matrix");  //enter a matrix
for(i=0;i<n;i++) //for loop syntax and declaration i
{
	for(j=0;j<n;j++)//for loop syntax and declaration j
	{
		a[i][j]=sc.nextInt(); // a matrix
	}
}
System.out.println("enter b matrix"); //enter b matrix
for(i=0;i<n;i++) //for loop syntax and declaration i
{
	for(j=0;j<n;j++)
	{
		b[i][j]=sc.nextInt(); //b matrix
	}
}
System.out.println("your a matrix");  //your a matrix 
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.println(a[i][j]+"\t"); //print a matrix
		}
	System.out.println();
	}
	System.out.println("your b matrix"); //your b matrix
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.println(a[i][j]+b[i][j]+"\t");  //print a,b matrix
		}
	}
}
}
}
