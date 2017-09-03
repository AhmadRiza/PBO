/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Ahmad Riza NIM 16650053
 */
public class RangeConverter {

    /**
     * Soal 1
     *
     * @param n integer nilai yg akan dikonversi
     * @return fixed range (integer)
     */
    public double rangeSoal1(int n) {

        double scale = 1 / 100d;//skala = jarak baru / jarak akhir
        return n * scale; //konversi skalanya

    }

    /**
     * Soal 2
     *
     * @param n integer nilai yg akan dikonversi
     * @return fixed range (integer)
     */
    public double rangeSoal2(int n) {

        int normalizeN = n - (-10); // ubah start n ke-0
        double scale = (double) (1 - 0) / (100 - (-10));//skala = jarak baru / jarak akhir
        double result = normalizeN * scale;//konversi skalanya

        return result;

    }

    /**
     * SOAL 3
     *
     * @param startOld nilai terkecil range asal
     * @param endOld nilai terbesar range asal
     * @param startNew nilai terbesar range baru
     * @param endNew nilai terbesar range baru
     * @param n nilai yg akan dikinversi
     * @return hasil konversi
     */
    public double rangeSoal3(
            int startOld, int endOld,
            int startNew, int endNew,
            int n) {

        int normalizedN = n - (startOld);// ubah start n ke-0
        double scale = (double) (endNew - startNew) / (endOld - startOld);//skala = jarak baru / jarak akhir
        double result = normalizedN * scale;//konversi skalanya
        double denormalizedRes = result + startNew; // ubah start n ke- start baru

        return denormalizedRes;

    }

    /**
     * SOAL 4 : OVERLOADING + FIXED FUNCTION INLINE NORMALIZATION 
     *
     * @param startOld nilai terkecil range asal
     * @param endOld nilai terbesar range asal
     * @param startNew nilai terbesar range baru
     * @param endNew nilai terbesar range baru
     * @param n nilai yg akan dikinversi
     * @return hasil konversi
     */
    
    //integer parameter
    
    public double convertRange(
            int startOld, int endOld,
            int startNew, int endNew,
            int n) {

        double scale = (double) (endNew - startNew) / (endOld - startOld);//skala = jarak baru / jarak akhir
        double result = ((n - startOld) * scale) + startNew;//konversi skalanya + inline normalize
        
        return result;
    }
    
    //String parameter Overload
    public String convertRange(
            String startOld, String endOld,
            String startNew, String endNew,
            String n) {
        
        //convert to int to operate
        int startOldI = Integer.parseInt(startOld);
        int endOldI = Integer.parseInt(endOld);
        int startNewI = Integer.parseInt(startNew);
        int endNewI = Integer.parseInt(endNew);
        int nI = Integer.parseInt(n);
        
        // call normal method to operate then convert to String value
        String result = String.valueOf( convertRange(startOldI, endOldI, startNewI, endNewI, nI) );
        
        return result;
    }
    
}
