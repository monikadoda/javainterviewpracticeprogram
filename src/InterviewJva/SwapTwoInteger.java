package InterviewJva;

public class SwapTwoInteger {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("with using third variable");
		System.out.println("New value of a:" +a);
		System.out.println("New value of b:" +b);
		
		//without using third variable
		int x=10;
		int y=20;
				
		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
		System.out.println("without using third variable");
		System.out.println("New value of a:" +a);
		System.out.println("New value of b:" +b);
		

	}

}
