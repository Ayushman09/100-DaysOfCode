import java.util.Scanner;

public class FactorsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int div=1; div<=Math.sqrt(num); div++){
            if(num%div==0){
                if(num/div==1){
                    System.out.println(div);
                }
                else{
                    System.out.println(div + " " + num/div);
                }
            }
        }
    }
}