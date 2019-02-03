package DP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class DP2193  {

    public static void main(String[] args) throws Exception {

        //ExecTime timer = new ExecTime();
        //timer.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[101];
        dp[0]=0; dp[1]=1; dp[2]=1;

        for (int i=3; i<=n; i++) {
            dp[i] = dp[i-1]+dp[i-2];

        }

        //timer.stop();
        //timer.printExecTime();
        //System.out.println(timer.getRunTimeNano() / 1000000 + " ms");
        //System.out.println(timer.getRunTimeNano() / 1000000 / 1000 + " sec");


        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();

    }

}

class ExecTime {
    private long start;
    private long stop;

    void start() {
        start = System.nanoTime();
    }

    void stop() {
        stop = System.nanoTime();
    }

    long getRunTimeNano() {
        return stop - start;
    }

    void printExecTime() {
        System.out.println(stop - start + " ns");
    }
}