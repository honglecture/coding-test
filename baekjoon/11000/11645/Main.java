// https://www.acmicpc.net/problem/11645
// I’ve Been Everywhere, Man
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            Set<String> set = new HashSet<>();
            for (int j = 0; j < size; j++) {
                set.add(bf.readLine());
            }
            bw.write(set.size() + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}

