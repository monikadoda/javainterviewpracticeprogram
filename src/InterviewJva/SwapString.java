package InterviewJva;

public class SwapString {

	public static void main(String[] args) {
		String a="Hello";
		String b="world";
		 a=a+b;
		 b=a.substring(0,a.length()-b.length());
		 a=a.substring(b.length());
		 System.out.println("New value of a:-" +a);
		 System.out.println("New value of b:-" +b);
		 
		

	}

}
