import java.io.*;


public class DP2302 {

    public static void main(String[] args) throws Exception {

        //BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sits = Integer.parseInt(br.readLine());
        int vn = Integer.parseInt(br.readLine());
        int[] vip = new int[vn];
        int[] part = new int[vn+1];


        vip[0] = Integer.parseInt(br.readLine());
        part[0] = vip[0]-1;

        int maximum = part[0];

        for(int i = 1; i<vn; i++) {
            vip[i] = Integer.parseInt(br.readLine());
            part[i] = (vip[i]-vip[i-1])-1;
            maximum = Math.max(maximum,part[i]);
        }
        part[vn] = sits-vip[vn-1];
        maximum = Math.max(maximum,part[vn]);


        int[] dp = new int[maximum+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;


        if(maximum>2) {
            for(int j = 3; j<=maximum; j++) {
                dp[j] = dp[j-1]+dp[j-2];
            }
        }

        int result = 1;
        for (int k=0; k<part.length; k++){
            result *= dp[part[k]];
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }

}
