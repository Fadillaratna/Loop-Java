
package LoopingBersarang;


public class LoopingBersarang {

    
    public static void main(String[] args) {
        System.out.println("=====KOTAK=====");
        for(int a=0; a<5 ; a++){
           // System.out.print("ini adalah loop ke- " + a);
            for(int b=0; b<5; b++){
            System.out.print(" *");
          }
            System.out.println("\n");
            
            
        }
        System.out.println("\n");
        for(int a=0; a<5 ; a++){
            //System.out.print("ini adalah loop ke- " + a);
            for(int b=0; b<5; b++){
            System.out.print(" *"); 
            if(a==b){
                break;
            }
          }
            System.out.println("\n");
        }
        System.out.println("\n");
        for(int a=0; a<5 ; a++){
            //System.out.print("ini adalah loop ke- " + a);
            for(int b=0; b<5; b++){
            System.out.print(" *"); 
            if((a+b)==4){
               break; 
            }
          }
            System.out.println("\n");
        }
        System.out.println("\n");
        for(int a=0; a<9 ; a++){
            //System.out.print("ini adalah loop ke- " + a);
            for(int b=0; b<9; b++){
            System.out.print(" *"); 
            if (a==b){
                break;
            }else if ((a+b)== 8){
                break;
            }
          }
            System.out.println("\n");
        }
    }
    
}
