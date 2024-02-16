// https://www.acmicpc.net/problem/10178
// 할로윈의 사탕
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result1 = n1 / n2;
            int result2 = n1 % n2;
            bw.write("You get "+result1+" piece(s) and your dad gets "+result2+" piece(s).\n");
        }
        bw.flush();
        bw.close();
    }
    
}


