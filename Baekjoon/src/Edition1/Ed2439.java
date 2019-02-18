package Edition1;

import java.util.Scanner;

// 별찍기 2

public class Ed2439 {

    public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();

        sc.close();
        for (int i=1; i<=num; i++) {
            for (int j=num-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
