package arrayprograms;
import java.util.Scanner; //scanner package header file
public class multilinearsearch { //class name
public static void main(String[] args) { //main function
int a[]= new int[100];   // declare an integer array with maximum elements of 100
int i,n,search,status=0,count=0; // initialize integer variables i,n,search,status=0,count=0
Scanner sc=new Scanner(System.in); //scanner object 
System.out.println("how many elements do you want to enter"); //enter the elements you want
n=sc.nextInt(); //read the elements from the user
for(i=0;i<n;i++) //for loop syntax and declaration
{
	a[i]=sc.nextInt(); 
}
	System.out.println("enter your search element"); //enter the search element
	search=sc.nextInt();//read the search element from the user
	for(i=0;i<n;i++) //for loop syntax and declaration
	{
		if(a[i]==search)//if block creating a object a[i] and assigning to search a[i]==search
		{
		status=1; //set status to 1 if the element is found
		count++; //increment count to track how many times element is repeated
		System.out.println("element is present at" +(i+1)); //print element is present
		}
	}
if(status==1) //if block status==1
    {
	System.out.println("element is found"); //print element is found
    System.out.println("element is repeated as many times -" + count); // print the element id repeated many timed
	}
else
{
	System.out.println("element is not found"); //print the element is not found
}
}
}
