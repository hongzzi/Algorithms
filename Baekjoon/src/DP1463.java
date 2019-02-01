import java.io.*;


public class DP1463 {

    public static void main(String[] args) throws Exception {

        //BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num= Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];
        dp[0] = dp[1] = 0;

        for(int i=2; i<=num; i++) {
            dp[i] = dp[i-1] +1;
            if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1);
        }

        bw.write(String.valueOf(dp[num]));
        bw.flush();
        bw.close();

    }

}