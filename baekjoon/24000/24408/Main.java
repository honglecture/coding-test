// https://www.acmicpc.net/problem/24408
// Mult!
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int key = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(key == 0){
                key = n;
            } else {
                if(n % key == 0){
                    key = 0;
                    bw.write(n + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
