// https://www.acmicpc.net/problem/23275
// Knot Knowledge
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            set.add(Integer.parseInt(sArray[i]));
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            set.remove(Integer.parseInt(sArray[i]));
        }
        System.out.println(set.iterator().next());
        bw.flush();
        bw.close();
    }
}
