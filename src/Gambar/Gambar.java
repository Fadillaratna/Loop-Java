
package Gambar;

public class Gambar {

    public static void main(String[] args) {
     for(int a=1; a<5 ; a++){//Kebawah
            for(int b=4; b>0 ; b--){//Menyamping
            System.out.print(" * ");
            if(a == b){
                break;
            }
          }
            System.out.println("\n");
     //Program diloop dari atas. Jika yang menyamping itu == yang dibawah maka akan break atau berhenti
            
        }
     
     
    }
    
}
