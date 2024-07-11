// https://www.acmicpc.net/problem/25840
// Sharing Birthdays
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(bf.readLine());
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

}
