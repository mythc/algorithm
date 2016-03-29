import java.util.*;

public class Test3Equal{
	public static void main(String[] args){
		int a,b,c;
		Scanner cin=new Scanner(System.in);
		System.out.println('b');
		System.out.println('a'+0);
		System.out.println('A'+0);
		System.out.println('b'+'c');
		System.out.println('a'+4);
		System.out.println((char)('a'+4));
		System.out.println("4"+"5");
		System.out.print("请输入三个整数: ");
		a=cin.nextInt();
		b=cin.nextInt();
		c=cin.nextInt();
		
		if(equals(a,b,c)==1)
			System.out.println("equal");
		else
			System.out.println("Notequal");
		
	}
	
	public static int equals(int a,int b,int c){
		if(a==b&&a==c)
			return 1;
		else
			return -1;
	}
}