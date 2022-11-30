package com.bentuknya;

import com.homebase.BangunDatar;

public class Persegi implements BangunDatar {

    int panjang;
    int lebar;

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void tampilluas() {
        System.out.println("luas persegi: " + luas());
    }

    @Override
    public int panjang() {
        return this.panjang;
    }

    @Override
    public int lebar() {
        return this.lebar;
    }

    @Override
    public double luas() {
        return panjang * lebar;
    }
}
