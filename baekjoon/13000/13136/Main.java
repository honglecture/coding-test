// https://www.acmicpc.net/problem/13136
// Do Not Touch Anything
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int n = Integer.parseInt(sArray[2]);
        long result1 = 0;
        long result2 = 0;
        if(y % n == 0){
            result1 = y / n;
        } else {
            result1 = y / n + 1;
        }
        if(x % n == 0){
            result2 = x / n;
        } else {
            result2 = x / n + 1;
        }
        long result = result1 * result2;
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}