// https://www.acmicpc.net/problem/10188
// Quadrilateral
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[1]);
            int x = Integer.parseInt(sArray[0]);
            for (int j = 0; j < y; j++) {
                for (int j2 = 0; j2 < x; j2++) {
                    bw.write("X" + "");
                }
                bw.write("\n");
            }
            if(i != size - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}


