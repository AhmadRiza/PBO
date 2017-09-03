package pbo;

/**
 * @author Ahmad Riza
 * @tugas - buat program konversi dari sekumpulan data dengan range 0-100  jadi sekumpulan
 * data denngan range 0-1
 * @tugas - kembangkan dmn datanya pada range -10-100 yg dkonversikan mjd kumpulan data dg range 0-1
 * @tugas kembangkan dengan range variabel
 * @tugas data program bisa menangani data berupa int dan String
 */

class Hitung{
    public double mean(int[] data){
        double jumlah = 0;
        int i;
        for (i = 0; i < data.length; i++) {
            jumlah +=data[i];
        }
        return jumlah/i;
    }
}
public class Main {
    public static void main(String[] args) {
        Hitung hitung = new  Hitung();
        int[] data={13,891,127};
        System.out.println(hitung.mean(data));
    }
}
