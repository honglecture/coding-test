// https://www.acmicpc.net/problem/10480
// Oddities
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n % 2 == 0){
                bw.write(n + " is even\n");
            } else {
                bw.write(n + " is odd\n");
            }
        }
        bw.flush();
        bw.close();
    }


    

}