package DP;

import java.io.*;
public class DP11058 {
    //크리보드
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int bf=0; //c 했을 경우의 버퍼
        dp[0]=0;

        for (int i = 1; i<n+1; i++) {
            dp[i] = dp[i-1]+1;
            if(bf>0) {
                dp[i] = Math.max(dp[i],dp[i-1]+bf);
            }
            if(i>3) {
                if(dp[i-3]*2>dp[i]) {
                    bf = dp[i-3];
                    dp[i] = dp[i - 3]+bf;
                }
            }
        }

        bw.write(String.valueOf(dp[n]));

        bw.flush();
        bw.close();

    }


}
