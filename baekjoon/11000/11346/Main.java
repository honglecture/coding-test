// https://www.acmicpc.net/problem/11346
// Cornell Party - Retry
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            bf.readLine();
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            Set<String> set = new HashSet<>();
            for (int j = 0; j < sArray1.length; j++) {
                set.add(sArray1[j]);
            }
            for (int j = 0; j < sArray2.length; j++) {
                set.add(sArray2[j]);
            }
            bw.write(set.size() + "\n");
        }
        bw.flush();
        bw.close();
    }
}