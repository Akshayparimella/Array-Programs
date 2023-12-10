package arrayprograms;    
import java.util.Scanner; //header file java Scanner package 
public class maxandmin {   // class name
	public static void main(String[] args) {
int a[]= new int[100];     //declaring values
int i,n,max,min;                   
Scanner sc=new Scanner(System.in);  //Scanner class
System.out.println("enter n elements"); //enter n elements
n=sc.nextInt();       
System.out.println("enter"+n+"elements");
for(i=0;i<n;i++)   //outer loop
{
	a[i]=sc.nextInt(); //statements
}
min=a[0]; //minimum
max=a[0];//maximum
for(i=0;i<n;i++)//inner loop
{
	if(a[i]<min)//if statement if block
	{
		min=a[i];//statements
	}
	else if(a[i]>max)//else block
	{
		max=a[i]; //statements	
	}
    }
System.out.println("minimum elements in the array list"+ min);//print statements
System.out.println("maximum elements in the array list"+ max);
	}
    }
