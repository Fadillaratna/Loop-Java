/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModulDanStudiKasusPerulangan;

/**
 *
 * @author FADILLA_rd
 */
public class Evaluasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 0;
        boolean kondisi =  true;
       do{
            a++;
           System.out.println(a + " Apakah anda ingin keluar dari aplikasi ini?"); 
           System.out.println("Yes");
           System.out.println("No");
          
           if(a==10){
               kondisi = false;
           }
       }while(kondisi);
        

    }
    
}
