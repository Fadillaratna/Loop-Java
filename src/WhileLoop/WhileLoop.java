
package WhileLoop;

public class WhileLoop {

    public static void main(String[] args) {
      int a= 0;
      boolean kondisi= true;
    
        System.out.println("=== START ===");
      while (kondisi){
          System.out.println("while loop ke- " + a);
          a++;
          
          //Merubah program ditengah-tengah
          if ( a== 10){
              
              kondisi = false;
          }
         //jika a++ diletakkan disini maka while loop terakhir akan ke-1000
      }
      System.out.println("=== END ===");   
    }
    
}
