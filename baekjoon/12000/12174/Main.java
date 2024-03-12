// https://www.acmicpc.net/problem/12174
// #include <Google I/O.h>
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String str = bf.readLine();
            String answer = "Case #"+(i + 1)+": ";
            for (int j = 0; j < str.length(); j += 8) {
                String result = str.substring(j, j + 8);
                result = result.replaceAll("I", "1");
                result = result.replaceAll("O", "0");
                char c = (char) Integer.parseInt(result, 2);
                answer += c;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
