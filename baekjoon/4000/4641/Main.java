// https://www.acmicpc.net/problem/4641
// Doubles
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int answer = 0;
            String str = bf.readLine();
            if(str.equals("-1")){
                break;
            }
            String[] sArray = str.split(" ");
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < sArray.length - 1; i++) {
                set.add(Integer.parseInt(sArray[i]));
            }
            for (int n : set) {
                if(set.contains(n * 2)){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}