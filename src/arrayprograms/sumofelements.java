package arrayprograms;
import java.util.Scanner;
public class sumofelements {
public static void main(String[] args) {
int a[]=new int[100];
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n values");
n=sc.nextInt();
System.out.println("enter "+n+" elements");
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
	sum = sum+a[i];
}
System.out.println("sum of array elements" +sum);
	}
}
