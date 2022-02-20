
package BreakContinueReturn;


public class BreakContinueReturn {

    
    public static void main(String[] args){
        int a= 0;
        
        System.out.println("=====START=====");
        
        System.out.println("---BREAK---");
        //Break
        while(true){
            a++;
            if(a==10){
                break;//keyword ini memaksa program untuk keluar dari loop
        }else if (a==5){
            continue;//keyword ini memaksa program untuk memulai aksi dari awal
        }else if (a==7){
            return;
        }
        
        System.out.println("Looping ke- " + a);  
      }
         System.out.println("=====FINISH=====");
    }
    
}
//Ketika loop bertemu break maka akan keluar dari looping