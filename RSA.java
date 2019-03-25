import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RSA {
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p and q:");
		int p=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("Enter message:");
		int m=sc.nextInt();
		int n=p*q;
		int f=(p-1)*(q-1);
		int e,k = 1,c=0;
		Random r=new Random();
		while(true){
			e=r.nextInt(100)+2;
			//System.out.println(e);
			for(int i=2;i<=e;i++){
				if(i!=e && e%i==0){
					c=1;
					break;
				}
			}
			if(c!=1){
				if(f%e==1){
				break;
				}
				
			}
			c=0;
		}

		for(int i=1;;i++){
			if((i*f+1)%e==0){
				k=i;
				break;
			}
		}
		System.out.println(k);
		int d=(k*f+1)/e;
		System.out.println("Public Key: {"+e+","+n+"}");
		System.out.println("Private Key: {"+d+","+n+"}");
		sc.close();
		int C=(int) (Math.pow(m,e)%n);
		System.out.println("Cipher text is: "+C);
	}

}
