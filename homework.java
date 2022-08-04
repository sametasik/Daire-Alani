import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double alan, pi, r, a;
        pi = 3.14;
        System.out.print("Yarıçapı Giriniz:  ");
        r = inp.nextDouble();
        System.out.print("Merkez Açıyı Giriniz:  ");
        a = inp.nextDouble();
        alan = (pi * (r * r) * a) / 360;
        System.out.print(alan);
    }
}
