// https://www.acmicpc.net/problem/30868
// 개표
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int n1 = n / 5;
            int n2 = n % 5;
            String answer = "";
            for (int j = 0; j < n1; j++) {
                answer += "++++ ";
            }
            for (int j = 0; j < n2; j++) {
                answer += "|";
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    

}
