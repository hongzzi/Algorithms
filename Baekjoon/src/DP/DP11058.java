package DP;

import java.io.*;

public class DP11058 {
    //크리보드
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];
        dp[0]=0;
        for (int i=1; i<=n; i++) {

            dp[i] = i;
            dp[i] = Math.max(dp[i], dp[i-1]+1);

            if(i>=5)
                dp[i] = Math.max(dp[i], dp[i-4]*3);
            if(i>=6)
                dp[i] = Math.max(dp[i], dp[i-5]*4);

        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }


}
