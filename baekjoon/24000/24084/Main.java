// https://www.acmicpc.net/problem/24084
// 次の文字 (Next Character)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            if(c2 == 'J'){
                bw.write(String.valueOf(c1) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
