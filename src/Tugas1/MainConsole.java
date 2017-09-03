/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Ahmad Riza
 */
public class MainConsole {    
    
    public static void main(String[] args) {
        RangeConverter converter = new RangeConverter();
        int n = 5;
        
        //soal 1
        System.out.println("<Soal 1> "+ n +" = "+
                converter.rangeSoal1(n));
        
        //soal 2
        System.out.println("<Soal 2> "+ n +" = "+
                converter.rangeSoal2(n));
        
        //soal 3
        System.out.println("<Soal 3> "+ n +" = "+
                converter.rangeSoal3(0, 100, 0, 1, n));
        
        //soal 4
        //@param = (awal lama, akhir lama, awal baru, akhir baru, nilai yg akan dikonversikan)
        
        System.out.println("<Soal 4 int> "+ n +" = "+
                converter.convertRange(0, 100, 0, 1, n));
        System.out.println("<Soal 4 String> "+ n +" = "+
                converter.convertRange("0", "100", "0", "1", String.valueOf(n)));
        

    }
    
}
