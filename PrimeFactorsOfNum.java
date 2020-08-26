import java.util.Scanner;

public class PrimeFactorsOfNum{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int counter = n;
    
    for(int factor=2; factor*factor <= counter ;){
        while( n%factor == 0 ){
          System.out.print(factor+" ");
          n /= factor;
        }
        factor += 1;
    }
    
    if(n != 1)
      System.out.print(n);
   }
}