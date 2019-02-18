package DataStructure;

import java.io.*;
import java.util.Stack;

//스택임
public class DS10799 {


    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        Stack<Character> stack = new Stack<>();
        int piece = 0;

        for (int i=0; i<input.length()-1; i++) {

            if(input.charAt(i)=='('&&input.charAt(i+1)==')') {

                piece += stack.size();

            } else if(input.charAt(i)=='('&&input.charAt(i+1)=='(') {

                stack.push(input.charAt(i));

            } else if(input.charAt(i)==')'&&input.charAt(i+1)==')') {

                stack.pop();
                piece++;

            } else continue;

        }

        bw.write(String.valueOf(piece));
        bw.flush();
        bw.close();

    }

}
