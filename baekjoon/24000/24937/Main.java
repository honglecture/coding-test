// https://www.acmicpc.net/problem/24937
// SciComLove (2022)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine()) % 10;
        StringBuffer sb = new StringBuffer("SciComLove");
        for (int i = 0; i < size; i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(String.valueOf(c));
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }

    

}
