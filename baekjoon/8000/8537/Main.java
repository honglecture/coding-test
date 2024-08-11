// https://www.acmicpc.net/problem/8537
// Imiona mrówek
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int max = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            Set<String> set = new HashSet<>();
            for (int j = 0; j < str.length(); j++) {
                set.add(String.valueOf(str.charAt(j)));
            }
            max = Integer.max(max, set.size());
        }
        System.out.println(max);
        bw.flush();
        bw.close();
    }
   
}