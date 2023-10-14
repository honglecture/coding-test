// https://www.acmicpc.net/problem/5635
// 생일
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
        int min = Integer.MAX_VALUE;
        String minName = "";
        int max = Integer.MIN_VALUE;
        String maxName = "";
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            String s1 = sArray[1];
            String s2 = sArray[2];
            String s3 = sArray[3];
            if(s1.length() == 1){
                s1 = "0" + s1;
            }
            if(s2.length() == 1){
                s2 = "0" + s2;
            }
            int n = Integer.parseInt(s3 + s2 + s1);
            if(n > max){
                max = n;
                maxName = name;
            }
            if(n < min){
                min = n;
                minName = name;
            }
        }
        bw.write(maxName + "\n");
        bw.write(minName + "\n");
        bw.flush();
        bw.close();
    }
}