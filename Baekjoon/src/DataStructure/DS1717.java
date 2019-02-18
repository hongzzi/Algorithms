package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DS1717 {


    public static int[] parent;

    public static void union (int x, int y) {
        x = find(x);
        y = find(y);

        if(x!=y) {
            parent[y] = x;
        }

    }
    public static int find (int x) {
        if (x==parent[x])
            return x;
        else
            return parent[x] = find(parent[x]);
    }
    public static void isSameParent(int x, int y) {
        x = find(x);
        y = find(y);
        if(x == y) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        parent = new int[num+1];
        for(int i=0; i<=num; i++) {
            parent[i]=i;
        }

        for(int i=0; i<count; i++) {

            st =  new StringTokenizer(br.readLine());
            int cal = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(cal==0) {
                union(x, y);

            }else if(cal==1) {
                isSameParent(x, y);
            }
        }
    }

}
