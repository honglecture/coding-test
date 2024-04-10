// https://www.acmicpc.net/problem/8721
// Wykreślanka
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        int start = 1;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(start == n){
                start++;
            } else {
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
   
}