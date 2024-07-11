// https://www.acmicpc.net/problem/7280
// Kortos
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
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= 13; i++) {
            set.add("S " + i);
            set.add("B " + i);
            set.add("V " + i);
            set.add("K " + i);
        }
        for (int i = 0; i < 51; i++) {
            String key = bf.readLine();
            set.remove(key);
        }
        System.out.println(set.iterator().next());
        bw.flush();
        bw.close();
    }
}