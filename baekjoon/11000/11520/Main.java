// https://www.acmicpc.net/problem/11520
// And Then There Was 5
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            bw.write(sArray[1] + " " + 5 + "\n");
        }
        bw.flush();
        bw.close();
    }


    
}