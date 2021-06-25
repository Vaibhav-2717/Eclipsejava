import java.util.Scanner;

public class Xor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v = new Scanner(System.in);
System.out.println("enter sequence size");
int n =v.nextInt();
System.out.println("enter sequence");
int a[] = new int[n];
for(int i=0;i<n;i++) {
	a[i]=v.nextInt();
}
System.out.println("enter l");
int l=v.nextInt();
System.out.println("enter r");
int r=v.nextInt();
int p=1;
		for(int i=0;i<=l;i++) {
			for(int j=i+1;j<r;j++) {
				p=p*(a[i]^a[j]);
				}
			
		}
		System.out.println("result="+p);
	}

}
