// https://www.acmicpc.net/problem/17599
// Bags
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            set.add(Integer.parseInt(sArray[i]));
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

}
