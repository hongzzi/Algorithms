package Edition1;
import java.util.Scanner;

public class Ed11720 {

    public static void main (String[] args)  {


        Scanner sc = new Scanner(System.in);
        int sum=0; short num, i, d;

        num = sc.nextShort();
        String[] st = sc.next().split("");

        for (i=0; i<num; i++) {
            d = Short.parseShort(st[i]);
            sum += d;
        }

        System.out.println(sum);

    }
}
