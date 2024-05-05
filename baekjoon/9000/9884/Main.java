// https://www.acmicpc.net/problem/9884
// Euclid
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        while (true) {
            if(n1 == n2){
                answer = n1;
                break;
            }
            int result = Integer.max(n1, n2) - Integer.min(n1, n2);
            n2 = Integer.min(n1, n2);
            n1 = result;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}