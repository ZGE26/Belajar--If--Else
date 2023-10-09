import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long pajak = 0;
        long jt = n*1000000;
        String bpp = "";
        if (n>0 && n<=50) {
            pajak = (5*jt)/100;
            bpp = "5%";
        } else if (n>=51 && n<=250) {
            pajak = (15*jt)/100;
            bpp = "15%";
        } else if (n>=251 && n<=500) {
            pajak = (25*jt)/100;
            bpp = "25%";
        } else {
            pajak = (30*jt)/100;
            bpp = "30%";
        }
        long hasilAkhir = jt - pajak;
        System.out.println("Penghasilan kentor = " + n + " juta Rupiah");
        System.out.println("Pajak " + bpp + "= Rp. " + pajak);
        System.out.println("Penghasilan bersih = Rp. " + hasilAkhir);
        
    }
}
