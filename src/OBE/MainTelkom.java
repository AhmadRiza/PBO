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
public class MainTelkom {
    public static void main(String[] args) {
        int[][] data = {
                        {1,1,1,10},
                        {1,0,1,5},
                        {2,1,3,5},
                        {3,1,4,10}
                        };
        
        OBE obe = new OBE(data);
        System.out.println("data original");
        obe.printData();
        
        System.out.println("R2 = R2-R1");
        obe.pengurangan(2, 2, 1, 1, 1);
        obe.printData();
        
        System.out.println("R3 = R3 - 2R1");
        obe.pengurangan(3, 3, 1, 1, 2);
        obe.printData();
        
        System.out.println("R4 = R4 - 3R1");
        obe.pengurangan(4, 4, 1, 1, 3);
        obe.printData();
        
        
        

//        System.out.println("R1= 2R1");
//        obe.kaliRow(1, 1, 2);
//        obe.printData();
        
//        System.out.println("R2 = 3R1 + R2");
//        obe.penjumlahan(2, 1, 2, 3, 1);
//        obe.printData();
//        
        
        
    }
   
}
