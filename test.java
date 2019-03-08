import java.util.Scanner;
class test{
	
	int sum(int a,int b){
		return a+b;
	}
	
	void display(String msg){
		System.out.println(msg);
	}
}
class test1{
	
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		test ob=new test();
		ob.display("This is a calculator:-\n\n\n");
		//user input
		ob.display("Enter first number:-");
		int a=sc.nextInt();
		ob.display("Enter second number:-");
		int b=sc.nextInt();
		//user input
		
		//function calling
		
		ob.display("Sum="+ob.sum(a,b));
		//function calling
		
	}
}