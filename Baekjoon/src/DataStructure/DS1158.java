package DataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 큐임
public class DS1158 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        Queue<Integer> josephus = new LinkedList<Integer>();

        //큐 채우기
        for(int i =1; i<=total; i++)
            josephus.add(i);


        int count = 0;

        while (!josephus.isEmpty()){
            int tmp = josephus.poll();
            count++;

            if (count == num) {
                sb.append(tmp + ", ");
                count = 0;
            } else {
                josephus.add(tmp);

            }
        }
        sb.delete(sb.length()-2, sb.length()); // 콤마, 띄어쓰기 삭제
        sb.append(">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }

}
