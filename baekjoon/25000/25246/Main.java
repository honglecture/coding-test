// https://www.acmicpc.net/problem/25246
// Brexiting and Brentering
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        int index = 0;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                index = i;
                break;
            }
        }
        sb.delete(index + 1, sb.length());
        System.out.println(sb.toString() + "ntry");
        bw.flush();
        bw.close();
    }

}
