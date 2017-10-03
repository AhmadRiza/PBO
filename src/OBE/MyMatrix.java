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
public class MyMatrix {
    
    private int[][] data;
    
    public MyMatrix(int[][] data) {
        this.data = data;
    }
    
    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data=null;
        this.data = data;
    }
    
    
    public int[] getRow(int row){
        row--;
        int[] result = data[row];
        return result;
    }
    
    public void setRow(int row, int[] rowData){
        row--;
        data[row]=rowData;
    }
    
    public int getValue(int row, int col){
        row--;
        col--;
        return data[row][col];
    }
    
    
    public void printData(){
        System.out.println("---------");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j]+"   ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
