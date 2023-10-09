import java.util.Scanner;

public class Huruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String huruf = input.nextLine();

        if (huruf.equals("a")  || huruf.equals("i") || huruf.equals("u")|| huruf.equals("e")|| huruf.equals("o") ) {
            System.out.println(huruf + " merupakan huruf vokal");
        } else {
            System.out.println(huruf + " merupakan huruf konsonan");
        }
    }
}