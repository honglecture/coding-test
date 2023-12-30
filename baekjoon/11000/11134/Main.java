// https://www.acmicpc.net/problem/11134
// 쿠키애호가
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
            if(n1 % n2 == 0){
                bw.write(n1 / n2 + "\n");
            } else {
                bw.write(n1 / n2 + 1 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}