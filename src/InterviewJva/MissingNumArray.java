package InterviewJva;

public class MissingNumArray {

	public static void main(String[] args) {
		int a[]={1,2,3,5};
		int sum=0;
		int sum1=0;
		int diff=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
        
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		
		diff=sum1-sum;
		System.out.println(diff);
		
		
	}

}
