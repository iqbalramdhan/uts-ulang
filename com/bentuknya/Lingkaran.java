package com.bentuknya;

import com.homebase.BangunDatar;

public class Lingkaran implements BangunDatar {

    int jari_jari;

    public Lingkaran(int jari_jari) {
        this.jari_jari = jari_jari;
    }

    @Override
    public void tampilluas() {
        System.out.println("luas lingkaran: " + luas());
    }

    @Override
    public int panjang() {
        return this.jari_jari;
    }

    @Override
    public int lebar() {
        return this.jari_jari;
    }

    @Override
    public double luas() {
        return (double) Math.PI * (jari_jari * jari_jari);
    }

}
