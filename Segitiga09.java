import java.util.Scanner;

public class Segitiga09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;
        System.out.println(" Alas Segitiga: ");
        alas = sc.nextInt();
        System.out.println("Tinggi Segitiga: ");
        tinggi = sc.nextInt();

        luas = alas*tinggi / 2;
        System.out.println("Luas segitiga: "+ luas);    
    }
}
