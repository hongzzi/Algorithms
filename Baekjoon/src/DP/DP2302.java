package DP;

import java.io.*;


public class DP2302 {

    public static void main(String[] args) throws Exception {

        //BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sits = Integer.parseInt(br.readLine());
        int[] dp = new int[sits+1];
        int pre, answer = 1, cur = 0;


        fib(dp,sits);

        int vipn = Integer.parseInt(br.readLine());

        for (int i=0; i<vipn; i++) {
            pre = Integer.parseInt(br.readLine());
            answer *= dp[pre-cur-1];
            cur = pre;
        }
        answer *= dp[sits-cur];

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }

    private static void fib(int []dp, int n ) {
        dp[0]=1; dp[1]=1;
        for(int i=2; i<=n; i++) dp[i] = dp[i-1]+dp[i-2];
    }


}
