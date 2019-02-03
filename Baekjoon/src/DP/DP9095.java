package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class DP9095 {

    public static void main (String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] dp = new int[11];
        int n = Integer.parseInt(br.readLine());
        dp[0] = 0; dp[1] = 1; dp[2] = 2; dp[3] = 4;

        for (int i = 4; i<11; i++ ) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int i = 0; i<n; i++) {
            int answer = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(dp[answer]+"\n"));
        }


        bw.flush();
        bw.close();

    }

}
