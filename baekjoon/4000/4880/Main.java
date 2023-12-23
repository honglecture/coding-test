// https://www.acmicpc.net/problem/4880
// 다음수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            if(n1 == 0 && n2 == 0 && n3 == 0){
                break;
            }
            if(n3 - n2 == n2 - n1){
                int n4 = n3 + (n2 - n1);
                bw.write("AP " + n4 + "\n");
            } else {
                int n4 = n3 * (n2 / n1);
                bw.write("GP " + n4 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
