// https://www.acmicpc.net/problem/15232
// Rectangles
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y = Integer.parseInt(bf.readLine());
        int x = Integer.parseInt(bf.readLine());
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }

    
}
