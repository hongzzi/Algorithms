package Edition1;
import java.util.Scanner;
public class Ed11721 {

    public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();

        sc.close();
        for (int i=0; i <len ; i++) {
            if(i%10==0&&i!=0) {
                System.out.println();
            }
            System.out.print(st.charAt(i));
        }

    }
}
