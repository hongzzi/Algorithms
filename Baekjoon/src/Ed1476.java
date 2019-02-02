import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ed1476 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int earth = Integer.parseInt(st.nextToken());   //1<=e<=15
        int sun = Integer.parseInt(st.nextToken());     //1<=s<=28
        int moon = Integer.parseInt(st.nextToken());    //1<=m<=19
        int i;int e = 0; int s = 0; int m = 0;

        for(i=0; ; i++) {
            if((earth==e&&sun==s&&moon==m)){
                bw.write(String.valueOf(i));
                break;
            }
            e++;
            s++;
            m++;
            if(e>15) e=1;
            if(s>28) s=1;
            if(m>19) m=1;
        }

        bw.flush();
        bw.close();

    }
}
