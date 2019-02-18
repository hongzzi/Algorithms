package Edition1;
import java.util.Scanner;

public class Ed10952 {
    public static void main (String[] args)  {


        Scanner sc = new Scanner(System.in);


        while(true) {
            short a = sc.nextShort();
            short b = sc.nextShort();

            if(a==0&&b==0) {
                break;
            }
            System.out.println(a+b);

        }


    }

}
