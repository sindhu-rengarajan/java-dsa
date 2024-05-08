package LeetCodeMustToSolve;

public class PrintNumbersInString {
	
	public static void printNumb(String s) {
		
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]/1>=48 && ch[i]/1<=57) {
				System.out.println(ch[i]);
			}
		}

	
	}
	public static void fib()
	{
	    int i=0;
	    int sum=0;
	    while(i<100) {
	    	sum=sum+i;
	    	sum=i+sum;
	    	i+=1;
	    }
	    System.out.println(sum);
	}
	 
	

	public static void main(String[] args) {
		printNumb("fgsdf234302434dsfdf88");
		int n = 6;
		 
	   fib();
	 
	    //return 0;

	}

}
