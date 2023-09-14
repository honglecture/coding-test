// https://www.acmicpc.net/problem/10867
// 큐
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<Integer> set = new HashSet<>();
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            set.add(Integer.parseInt(sArray[i]));
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}