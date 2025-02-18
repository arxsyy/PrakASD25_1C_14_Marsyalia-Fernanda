import java.util.Scanner;

public class Perulangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();

        int n = (nim.charAt(nim.length()-2) - '0') * 10 + (nim.charAt(nim.length()-1) - '0');
        
        if (n < 10) {
            n += 10;
        }
        System.out.println("=====================");
        System.out.println("n : " + n);
        
        for (int i = 1; i <= n; i++) {
            
            if (i == 6 || i == 10) {
                continue;
            }
            
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}