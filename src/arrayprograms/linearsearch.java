package arrayprograms;
import java.util.Scanner; //header file java Scanner package 
public class linearsearch {// class name
public static void main(String[] args) {//main function
int x[]=new int[100]; //x[0],x[1],x[2]...........x[99]//declaring values
int i,n,search,status=0;
Scanner sc=new Scanner(System.in);//Scanner object
System.out.println("how many numbers do you want enter");//enter n elements
n=sc.nextInt(); //method calling
for(i=0;i<n;i++)//outer loop
{
	x[i]=sc.nextInt();
}
	System.out.println("enter your search element");
	search=sc.nextInt();
	for(i=0;i<n;i++)  //inner loop
	{
		if(x[i]==search)//if block
		{
			status=1;   //statements
			break;       //break statement
		}
		}                //exit for loop
	if(status==1) //if block
	{
		System.out.println("element is found"); //print statement
	}
	else //else block
	{
		System.out.println("element is not found"); //print statement
	}
}
}
