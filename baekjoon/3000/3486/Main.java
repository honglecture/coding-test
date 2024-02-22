// https://www.acmicpc.net/problem/3486
// Adding Reversed Numbers
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
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            StringBuilder sb1 = new StringBuilder(sArray[0]).reverse();
            StringBuilder sb2 = new StringBuilder(sArray[1]).reverse();
            int sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
            StringBuilder sb3 = new StringBuilder(String.valueOf(sum)).reverse();
            int result = Integer.parseInt(sb3.toString());
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}

