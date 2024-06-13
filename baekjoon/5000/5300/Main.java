// https://www.acmicpc.net/problem/5300
// Fill the Rowboats!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= size; i++) {
            if(i % 6 == 0){
                bw.write(i + " Go! ");
            } else {
                bw.write(i+ " ");
            }
        }
        if(size % 6 != 0){
            bw.write("Go!");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}