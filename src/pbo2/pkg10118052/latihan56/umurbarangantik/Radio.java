/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan56.umurbarangantik;

/**
 *	
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program berbasis object untuk mendapatkan informasi
 * barang antik seperti nama dan tahun
 */
public class Radio extends BarangAntik {
    private String name;

    public Radio(int umur) {
        super(umur);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
