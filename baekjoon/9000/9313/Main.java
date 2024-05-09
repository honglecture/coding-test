// https://www.acmicpc.net/problem/9313
// Integer Flipping
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("-1")){
                break;
            }
            String key = Integer.toString(Integer.parseInt(str), 2);
            int legnth = key.length();
            for (int i = 0; i < 32 - legnth; i++) {
                key = "0" + key;
            }
            long result = Long.parseLong(new StringBuilder(key).reverse().toString(), 2);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}