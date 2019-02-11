package Edition1;
import java.util.Scanner;
import java.util.Arrays;

public class Ed10817 {

    public static void main (String[] args) throws Exception {


        Scanner sc = new Scanner(System.in);
        short[] arr = new short[3];
        arr[0] = sc.nextShort();
        arr[1] = sc.nextShort();
        arr[2] = sc.nextShort();
        Arrays.sort(arr);

        System.out.print(arr[1]);

    }


}
