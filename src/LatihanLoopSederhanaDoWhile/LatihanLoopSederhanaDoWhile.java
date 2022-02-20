
package LatihanLoopSederhanaDoWhile;
import java.util.*;

public class LatihanLoopSederhanaDoWhile {

   
    public static void main(String[] args) {
         int nilai_awal, nilai_akhir, total;
      Scanner inputUser= new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = inputUser.next();
        System.out.print("Masukkan kelas: ");
        String kelas = inputUser.next();
        System.out.print("Masukkan umur: ");
       int umur = inputUser.nextInt();
       System.out.print("Masukkan nomor absen");
     int absen = inputUser.nextInt();
      System.out.print("Masukkan nilai awal: ");
      nilai_awal= inputUser.nextInt();
      System.out.print("Masukkan nilai akhir: ");
      nilai_akhir= inputUser.nextInt();
      total=0;
      do {
   total = total + nilai_awal;
   System.out.println("ditambah " + nilai_awal + " menjadi " + total);
   nilai_awal++;

  }while(nilai_awal <= nilai_akhir);
        
    }
}
    
    

