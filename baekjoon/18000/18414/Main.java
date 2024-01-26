// https://www.acmicpc.net/problem/18414
// X に最も近い値 (The Nearest Value)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = n2; i <= n3; i++) {
            int n = Math.abs(i - n1);
            if(min > n){
                answer = i;
                min = n;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
