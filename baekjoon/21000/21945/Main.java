// https://www.acmicpc.net/problem/21945
// Palindromes
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        long answer = 0;
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            StringBuilder sb = new StringBuilder(sArray[i]);
            if(sb.toString().equals(sb.reverse().toString())){
                answer += Integer.parseInt(sArray[i]);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
