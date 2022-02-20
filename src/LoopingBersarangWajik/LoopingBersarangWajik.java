
package LoopingBersarangWajik;


public class LoopingBersarangWajik {

    public static void main(String[] args) {
         for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if((x+y) <= 3||(x-y) >= 5){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                if ((y-x) == 4){
                    break;
                }
                if ((x+y) == 12){
                    break;
                }
            }
            System.out.print("\n");
        }

    }
}