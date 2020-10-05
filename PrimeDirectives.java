import java.util.ArrayList;
public class PrimeDirective {

	// Add your methods here:
	  public static boolean isPrime(int number){
	    if(number == 2){
	      return true;
	    }
	    else if(number < 2){
	      return false;
	    }
	    else{
	    for(int i=2; i<number;i++){
	      if(number % i == 0){
	        return false;
	      }
	      else
	      return true;
	    }
	    }
	    return false;
	  }

	  public static ArrayList<Integer> onlyPrimes(int[] number){
	    ArrayList<Integer> primes = new ArrayList<Integer>();
	    for(int i=0; i< number.length; i++) {
	    	if(isPrime(number[i])== true) {
	    		primes.add(number[i]);
	    	}
	    }
	    return primes;
	  }
	    
	  public static void main(String[] args) {

	    PrimeDirective pd = new PrimeDirective();
	    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
	    System.out.println("The Prime Numbers in this array are: "+pd.onlyPrimes(numbers));
	  }  
	 
	}
