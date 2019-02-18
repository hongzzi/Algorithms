package Edition1;
import java.util.Scanner;
public class Ed10871 {

    public static void main (String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        short x = sc.nextShort();

        for (int i=0; i<num; i++){
            short a = sc.nextShort();
            if(a<x) System.out.print(a+" ");
        }
    }

}
