
package DoWhileLoop;


public class DoWhileLoop {

    
    public static void main(String[] args) {
       // do while minimal melakukan sekali walaupun while false
    int a= 0;
    boolean kondisi= true;
    System.out.println("===== START =====");
    do {
    a+= 2;
    System.out.println(a );
    if (a == 50){
    kondisi = false;
    System.out.println("===== FINISH =====");   
      }
    }while(kondisi);
      
         
      
          
    }
    
}
