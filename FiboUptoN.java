import java.util.*;
  
public class FiboUptoN{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fir = 0, sec = 1,temp=0;
        for(int i=1; i<=n; i++){
            System.out.println(fir);
            temp = sec;
            sec = fir+sec;
            fir = temp;
        }
        sc.close();
    }
}