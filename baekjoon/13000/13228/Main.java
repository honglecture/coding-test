// https://www.acmicpc.net/problem/13228
// The REAL Manhattan distance
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int answer = 0;
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            int n5 = Integer.parseInt(sArray[4]);
            int n6 = Integer.parseInt(sArray[5]);
            answer += n3 + n6;
            answer += Math.abs(n2 - n5);
            answer += Math.abs(n1 - n4);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}