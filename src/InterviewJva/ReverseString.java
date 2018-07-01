package InterviewJva;

public class ReverseString {

	public static void main(String[] args) {
		
			String a="Selenium";
			String s ="@#$%^ selinium 1234";
			int len=a.length();
			String rev="";
			for(int i=len-1;i>=0;i--)
			{
			rev=rev + a.charAt(i);
				
				System.out.print(a.charAt(i));
			
			}
			
			s=s.replaceAll("[^a-zA-Z0-9]", "");
			System.out.println();
			System.out.println(s);
			
			
			//System.out.println("Reverse String Is:-" +rev);
			


	}

}
