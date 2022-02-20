
package LatihanLoopFibonacciWhile;
import java.util.*;

public class LatihanLoopFibonacciWhile {

    
    public static void main(String[] args) {
       //menghitung nilai deret fibonacci ke-n
        Scanner inputUser= new Scanner(System.in);
        int f_n, f_n_1, f_n_2, n;
        System.out.print("Mengambil nilai fibonacci ke- ");
        n= inputUser.nextInt();
        f_n_2= 0;
        f_n_1=1;
        f_n=1;
       int i= 1;
        while(i<=n){
            System.out.println("Nilai fibonacci ke- " + i + "adalah" + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2= f_n_1;
            f_n_1= f_n;
            i++;
        }
    }
    
}
