
import com.bentuknya.*;
import com.menghitung.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        System.out.print("masukan panjang: ");
        x = sc.nextInt();
        System.out.print("masukan lebar: ");
        y = sc.nextInt();

        Lingkaran lingsatu = new Lingkaran(y);
        Persegi persegisatu = new Persegi(x, y);

        HitungArsiran pertama = new HitungArsiran(lingsatu, persegisatu);
        pertama.tampilkanHasil();
    }
}
