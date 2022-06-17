package week1day1;

public class Fibonacciseries {
	  public static void main (String[] args ) {

		int range,firstnum,secnum,sum;
		range=8;
		firstnum=0;
		secnum=1;
		System.out.println("fibonacci series for the given range are");
		System.out.print(firstnum+" " +secnum+" ");
		for(int i=0;i<range-2;i++)
		{
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.print(sum+" ");		
			
	}

}

}
