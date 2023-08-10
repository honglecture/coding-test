// https://www.acmicpc.net/problem/1550
// 16진수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int result = Integer.parseInt(s, 16);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }


}
