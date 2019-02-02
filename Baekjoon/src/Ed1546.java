import java.io.*;
import java.util.StringTokenizer;


public class Ed1546 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // n은 1000보다 크거나 같다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] sc = new int[n];
        int max = 0, sum =0;
        float avr;

        for(int i=0; i<n; i++){
            sc[i]=Integer.parseInt(st.nextToken());
            max = Math.max(max, sc[i]);
            sum += sc[i];
        }

        avr = ((float)sum/max*100)/n;

        bw.write(String.valueOf(avr));
        bw.flush();
        bw.close();

    }
}
