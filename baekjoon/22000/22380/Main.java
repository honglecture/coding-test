// https://www.acmicpc.net/problem/22380
// 割り勘
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            int key = n2 / n1;
            int answer = 0;
            sArray = bf.readLine().split(" ");
            for (int i = 0; i < sArray.length; i++) {
                int n = Integer.parseInt(sArray[i]);
                if(key <= n){
                    answer += key;
                } else {
                    answer += n;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
