import java.util.*;
   
public class PrimeUptoN{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int factCounter = 0;
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i = low; i <= high ; i++){
            factCounter = 0;
            for(int j = 2; j <= Math.sqrt(i); j++){
                if ( i%j == 0 ){
                    factCounter += 1;
                    break;
                }
            }
            if(factCounter == 0)
                System.out.println(i);
        }
        sc.close();
    }
}