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
public class OBE extends MyMatrix {

    public OBE(int[][] data) {
        super(data);
    }
    
    public void resetData(int[][] data){
        for (int i = 0; i < data.length; i++) {
            setRow(i+1, data[i]);
        }
    }

    public void swapRow(int row1, int row2) {
        int[] tempRow = getRow(row1);
        setRow(row1, getRow(row2));
        setRow(row2, tempRow);
    }

    public void kaliRow(int rowTarget, int row, int k) {
        int[] result = getRow(row);
        for (int i = 0; i < result.length; i++) {
            result[i] = result[i] * k;
        }
        setRow(row, result);
    }

    public void penjumlahan(int rowTarget, int row1, int row2, int kRow1, int kRow2) {
        int[] R1 = getRow(row1);
        int[] R2 = getRow(row2);
        int[] result = new int[R1.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = (kRow1 * R1[i]) + (kRow2 * R2[i]);
        }
        
        setRow(rowTarget, result);
    }
    
    public void pengurangan(int rowTarget, int row1, int row2, int kRow1, int kRow2) {
        int[] R1 = getRow(row1);
        int[] R2 = getRow(row2);
        int[] result = new int[R1.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = (kRow1 * R1[i]) - (kRow2 * R2[i]);
        }
        
        setRow(rowTarget, result);
        
    }
    
    

}
