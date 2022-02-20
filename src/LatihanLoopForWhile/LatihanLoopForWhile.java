
package LatihanLoopForWhile;
import java.util.*;
public class LatihanLoopForWhile {

   
    public static void main(String[] args) {
    Scanner inputUser= new Scanner(System.in);
    int nilai_awal, nilai_akhir, total;
        System.out.print("Masukkan Nilai Awal: ");
        nilai_awal = inputUser.nextInt();
        System.out.print("Masukkan Nilai Awal: ");
        nilai_akhir = inputUser.nextInt();
        total= 0;
        
       for (;nilai_awal <= nilai_akhir ; nilai_awal++){ 
        total = total + nilai_awal;
            System.out.println("ditambah " + nilai_awal + " menjadi "+ total);
            
        }
    }
    
}
