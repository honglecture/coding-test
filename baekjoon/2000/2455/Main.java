// https://www.acmicpc.net/problem/2455
// 지능형 기차
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currentCount = 0;
        int maxCount = 0;
        for (int i = 0; i < 4; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            currentCount -= n1;
            currentCount += n2;
            if(maxCount < currentCount){
                maxCount = currentCount;
            }
        }
        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
    }
}