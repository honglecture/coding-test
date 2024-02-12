// https://www.acmicpc.net/problem/29738
// Goodbye, Code Jam
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            String result = "";
            if(n > 4500){
                result = "Round 1";
            } else if(n > 1000){
                result = "Round 2";
            } else if(n > 25){
                result = "Round 3";
            } else {
                result = "World Finals";
            }
            bw.write("Case #" + (i + 1) + ": " + result + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
