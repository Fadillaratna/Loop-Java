
package LatihanLoopFibonacciDoWhile;
import java.util.*;

public class LatihanLoopFibonacciDoWhile {

  
    public static void main(String[] args) {
       Scanner inputUser = new Scanner(System.in);
       int f_n, f_n_1, f_n_2, n;
       
        System.out.print("Input nilai fibonacci ke- " );
        n= inputUser.nextInt();
        
        f_n_2= 0;
        f_n_1=1;
        f_n=1;
        int i= 1;
        do{
            System.out.println("Nilai fibonacci ke- " + i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2= f_n_1;
            f_n_1= f_n;
            i++;
        }while(i<=n);
    }
    
}
