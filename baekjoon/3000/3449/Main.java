// https://www.acmicpc.net/problem/3449
// 해밍 거리
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String s1 = bf.readLine();
            String s2 = bf.readLine();
            int count = 0;
            for (int j = 0; j < s1.length(); j++) {
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);
                if(c1 != c2){
                    count++;
                }
            }
            bw.write("Hamming distance is "+count+".\n");
        }
        bw.flush();
        bw.close();
    }
}