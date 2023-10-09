import java.util.Scanner;

public class Backup {
    public static void main(String[] args) {
        Scanner isi = new Scanner(System.in);
        int d = isi.nextInt();
        int r = isi.nextInt();
        int i = isi.nextInt();

        String dr = "Dira";
        String rd = "Radi";
        String ir = "Idar";

        String nama = "";
        if (d < r && d < i) {
            if (r < i) {
                nama = dr + ", " + rd + ", " + ir;
            } else {
                nama = dr + ", " + ir + ", " + dr;
            }
    
        } else if (r < d && r < i) {
            if (d < i) {
                nama = rd + ", " + dr + ", " + ir;
            } else {
                nama = rd + ", " + ir + ", " + dr;
            }
        } else {
            if (d < r) {
                nama = ir + ", " + dr + ", " + rd;
            } else {
                nama = ir + ", " + rd + ", " + dr;
            }
        }
        System.out.println(nama);

        isi.close();
    }
}
