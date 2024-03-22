// https://www.acmicpc.net/problem/26560
// Periods
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            char c = str.charAt(str.length() - 1);
            if(c != '.'){
                str += ".";
            }
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }

}
