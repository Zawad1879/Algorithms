
public class efficient_exponentiation {
	public static void main(String [] args){
		long startTime = System.nanoTime();
		System.out.println(expo(2,10));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		

//		long startTime = System.nanoTime();
//		System.out.println(trad_expo(2,10));
//		long endTime = System.nanoTime();
//		System.out.println("Took "+(endTime - startTime) + " ns"); 
	}
	
	static int expo(int a, int b){
	    int result = 1;

	    while (b!=0){
	    	if(b%2 == 1){
	    		result*= a;
	    		
	    	}
	    	b/= 2;
	    	a*= a;
	    }

	    return result;
	}
	
	static int trad_expo(int a, int b){
	    int result = 1;

	    while (b>0){
	        result *= a;
	        b--;
	    }

	    return result;
	}

}
