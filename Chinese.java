import java.util.*;
public class Chinese {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int[] m=new int[3];
	int[] a=new int[3];
	int[] M=new int[3];
	int[] y=new int[3];
	int M0,x1,z=0,j,x;
	System.out.println("enter m values : ");
	for(int i=0;i<3;i++)
	{
		m[i]=sc.nextInt();
	}
	System.out.println("enter a values:");
	for(int i=0;i<3;i++)
	{
		a[i]=sc.nextInt();
	}
	M0=m[0]*m[1]*m[2];
	for(int i=0;i<3;i++)
	{
		M[i]=(M0)/(m[i]);
	}
	for(int i=0;i<3;i++)
	{
		x1=M[i]%m[i];
		if(x1!=1 && x1<=m[i]-1)
		{
			for(j=2;j<100;j++)
			{
				if((x1*j)%m[i] == 1)
				{
					z=j;
					break;
				}
			}
		}
		else if(x1==1)
			z=x1;
			
		y[i]=z;
	}
	int sum=0;
	for(int i=0;i<3;i++)
	{
		sum+=a[i]*M[i]*y[i];
	}
	x=sum%M0;
	System.out.println("x is equivalent to "+x+"mod"+M0);
}
}
