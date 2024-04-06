// https://www.acmicpc.net/problem/5679
// Hailstone Sequences
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 0){
                break;
            }
            List<Integer> list = new ArrayList<>();
            list.add(n);
            while (true) {
                int currentNum = list.get(list.size() - 1);
                if(currentNum == 1){
                    break;
                }
                if(currentNum % 2 == 0){
                    list.add(currentNum / 2);
                } else {
                    list.add(3 * currentNum + 1);
                }
            }
            Collections.sort(list);
            bw.write(list.get(list.size() - 1) + "\n");
        }
        bw.flush();
        bw.close();
    }
}