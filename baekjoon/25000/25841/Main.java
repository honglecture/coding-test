// https://www.acmicpc.net/problem/25841
// Digit Count
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                int n = Integer.parseInt(String.valueOf(s.charAt(j)));
                if(n == n3){
                    count++;
                }
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
