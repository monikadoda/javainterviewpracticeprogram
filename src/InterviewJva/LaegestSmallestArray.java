package InterviewJva;

public class LaegestSmallestArray {

	public static void main(String[] args) {
		int num[]={56,78,90,-34,100,-89};
		int large=num[0];
		int small=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>large)
			
				large=num[i];
				
			
			else if(num[i]<small)
			
				small=num[i];
			
		}
		System.out.println("largest no is:-" +large);
		System.out.println("Smallest no is:-" +small);
		

	}

	
		
	}


