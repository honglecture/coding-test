// https://www.acmicpc.net/problem/20360
// Binary numbers
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String str = Integer.toString(n, 2);
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(c == '1'){
                bw.write(index + " ");
            }
            index++;
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
