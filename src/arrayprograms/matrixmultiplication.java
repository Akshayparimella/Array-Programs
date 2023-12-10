package arrayprograms; //package name array
import java.util.Scanner; //scanner class header file
public class matrixmultiplication { //class name multiplication matrix
public static void main(String[] args)// main function
{
int[][] x= new int[100][100]; //initializing x variable array size[100][100]
int[][] y= new int[100][100]; //initializing y variable array size[100][100]
int[][] z= new int[100][100]; //initializing z variable array size[100][100]
int i,j,k,n;           //integer variables i,j,k,n
Scanner sc=new Scanner(System.in); //scanner object
System.out.println("enter your matrix multiplication"); //enter matrix multiplication matrix
n=sc.nextInt();
System.out.println("your matrix order is" +n+ "x" + n);  // enter matrix order
System.out.println("enter x matrix"); // enter x matrix
for(i=0;i<n;i++)//for loop syntax and declaration i
{
	for(j=0;j<n;j++)//for loop syntax and declaration j
	{
		x[i][j]= sc.nextInt(); //x[i][j] 
		}
}
System.out.println("enter y matrix"); //enter y matrix
for(i=0;i<n;i++)//for loop syntax and declaration i 
{
	for(j=0;j<n;j++)// for loop syntax and declaration j
	{
		y[i][j]=sc.nextInt(); //y[i][j]
	}
}
System.out.println("your x matrix"); //your x matrix
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.println(x[i][j]+"\t"); //print x[i][j]
	}
System.out.println("your y matrix"); //your y matrix
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		System.out.println(y[i][j]+"\t"); //print y[i][j]
	}
	System.out.println(); //statements
}
System.out.println("result"); //result
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		z[i][j]=0; //statements
		for(k=0;k<n;k++)//for loop syntax and declaration k
		{
			z[i][j]+=x[i][k]*y[k][j]; // instruction is i row and j column z[i][j]=x[i][k]*y[k][j]
		}
	}
}
for(i=0;i<n;i++)//for loop  i
{
	for(j=0;j<n;j++) //for loop j
	{
		System.out.println(z[i][j]+"\t"); //print z[i][j]
	}
	System.out.println();
}
}
}
}
