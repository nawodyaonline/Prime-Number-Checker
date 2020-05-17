import java.util.Scanner; 

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int value = sc.nextInt();
        boolean isPrime = true;

        for(int i=2 ;  i < value; i++){
            if(value%i == 0){
                isPrime = false;
                break;
            }        
        }

        if(isPrime)
            System.out.println(value + " is a Prime Number");
        
        else    
            System.out.println(value + " is not a prime Number");
    }
}