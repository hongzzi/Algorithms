import java.io.*;
import java.util.StringTokenizer;

public class DP1149 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine()); // 집의 갯수, N<=1000
        int arr[][] = new int[3][n];
        int dp[][] = new int[3][n];
        int i,answer;

        for (i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
            arr[2][i] = Integer.parseInt(st.nextToken());
        }

        dp[0][0]=arr[0][0]; dp[1][0]=arr[1][0]; dp[2][0]=arr[2][0];

        for (i=1; i<n; i++) {
            dp[0][i] = arr[0][i] + Math.min(dp[1][i-1],dp[2][i-1]);
            dp[1][i] = arr[1][i] + Math.min(dp[0][i-1],dp[2][i-1]);
            dp[2][i] = arr[2][i] + Math.min(dp[0][i-1],dp[1][i-1]);
        }

        answer = Math.min(Math.min(dp[0][n-1],dp[1][n-1]),dp[2][n-1]);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();

    }
}
