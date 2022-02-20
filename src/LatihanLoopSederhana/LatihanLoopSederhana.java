
package LatihanLoopSederhana;

import java.util.*;
public class LatihanLoopSederhana {

    
    public static void main(String[] args) {
      //Program Untuk Menjalankan Angka Dengan Rentang
      Scanner inputUser= new Scanner(System.in);
      int nilai_awal, nilai_akhir, total;
      
      System.out.print("Masukkan nilai awal: ");
      nilai_awal= inputUser.nextInt();
      System.out.print("Masukkan nilai akhir: ");
      nilai_akhir= inputUser.nextInt();
       
      total = 0;
      while(nilai_awal <= nilai_akhir){
         total = total + nilai_awal;
         System.out.println("ditambah " + nilai_awal + " menjadi " + total);
         nilai_awal++;
         
        
      }
    }
    
}
