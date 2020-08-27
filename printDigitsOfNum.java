import java.util.Scanner;

public class printDigitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=0;
        int temp = num;

        while(temp>0){
            count+=1;
            temp/=10;
        }

        while(count!=0){
            System.out.println(num/(int)Math.pow(10, count-1));
            num %= Math.pow(10,count-1);
            count-=1;
        }
        sc.close();
    }
}