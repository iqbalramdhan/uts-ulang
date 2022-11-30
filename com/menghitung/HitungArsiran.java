package com.menghitung;

import com.bentuknya.Lingkaran;
import com.bentuknya.Persegi;

public class HitungArsiran {
    double hasil;

    Lingkaran lingkaran;
    Persegi persegi;

    public HitungArsiran(Lingkaran lingkaran, Persegi persegi){
        this.lingkaran = lingkaran;
        this.persegi = persegi;
    }

    public void tampilkanHasil(){
        lingkaran.tampilluas();
        persegi.tampilluas();
        hasil = persegi.luas() - (lingkaran.luas() / 2);
        System.out.println("hasilnya adalah: " + hasil);
    }
    
}