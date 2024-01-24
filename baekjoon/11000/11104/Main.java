// https://www.acmicpc.net/problem/11104
// Fridge of Your Dreams
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int answer = Integer.parseInt(str, 2);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}