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
        int n = 10;
        
        //soal 1
        System.out.println("<Soal 1> "+ n +" = "+
                converter.rangeSoal1(n));
        
        //soal 2
        System.out.println("<Soal 2> "+ n +" = "+
                converter.rangeSoal2(n));
        
        //soal 3
        System.out.println("<Soal 3> "+ n +" = "+
                converter.rangeSoal3(0, 100, -1, 1, n));
        
        //soal 4
        //@param = (awal lama, akhir lama, awal baru, akhir baru, nilai yg akan dikonversikan)
        
        System.out.println("<Soal 4 int> "+ n +" = "+
                converter.convertRange(0, 100, 0, 1, n));
        
        //overload String
        System.out.println("<Soal 4 String> "+ n +" = "+
                converter.convertRange("0", "100", "0", "1", String.valueOf(n)));
        
        //overload int[]
        int[] numbers = {-5,-3,-1,0,1,3,5,9,10};
        int[] numbers2 = {-3,-5,0,-1,1,3,10,9,5};
        double[] res = converter.convertRange(-5, 10, -1, 1, numbers);
        double[] res2 = converter.convertRange(-5, 10, -1, 1, numbers2);
        System.out.print("<int[] overload> :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println("");
        System.out.print("<int[] overload2> :");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(res2[i]+" ");
        }
        System.out.println("");
        System.out.println(converter.numb);

    }
    
}
