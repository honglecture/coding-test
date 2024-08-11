// https://www.acmicpc.net/problem/26767
// Hurra!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= size; i++) {
            int n = i;
            if(n % 7 == 0 && n % 11 != 0){
                bw.write("Hurra!\n");
            } else if(n % 7 != 0 && n % 11 == 0){
                bw.write("Super!\n");
            } else if(n % 7 == 0 && n % 11 == 0){
                bw.write("Wiwat!\n");
            } else {
                bw.write(n + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
