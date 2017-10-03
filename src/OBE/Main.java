/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OBE;

/**
 *
 * @author riza
 */
public class Main {
    public static void main(String[] args) {
        int[][] data = {
                        {2,6,5},
                        {7,4,8},
                        {3,1,9},
                        };
        
        OBE obe = new OBE(data);
        System.out.println("data original");
        obe.printData();
        
//        System.out.println("R1 <-> R2");
//        obe.swapRow(1, 2);
//        obe.printData();
        
//        System.out.println("R2 = R1 + R2");
//        obe.penjumlahan(2, 1, 2, 1, 1);
//        obe.printData();
//        

//        System.out.println("R1= 2R1");
//        obe.kaliRow(1, 1, 2);
//        obe.printData();
        
//        System.out.println("R2 = 3R1 + R2");
//        obe.penjumlahan(2, 1, 2, 3, 1);
//        obe.printData();
//        
        
        
    }
   
}
