import java.util.Scanner;


public class DP11727 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] arr = new long[num+1];

        arr[0]=1;
        arr[1]=1;

        if(num==0||num==1) {
            System.out.println(arr[num]);
            return ;
        }
        else {
            for(int i=2; i<=num; i++) {
                arr[i] = (arr[i-1] + arr[i-2]*2)%10007;

            }
        }

        System.out.println(arr[num]);

        sc.close();
    }
}
