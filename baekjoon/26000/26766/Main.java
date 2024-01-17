// https://www.acmicpc.net/problem/26766
// Serca
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            bw.write(" @@@   @@@ \n");
            bw.write("@   @ @   @\n");
            bw.write("@    @    @\n");
            bw.write("@         @\n");
            bw.write(" @       @ \n");
            bw.write("  @     @  \n");
            bw.write("   @   @   \n");
            bw.write("    @ @    \n");
            bw.write("     @     \n");
        }
        bw.flush();
        bw.close();
    }

}
