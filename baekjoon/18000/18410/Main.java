// https://www.acmicpc.net/problem/18410
// マージ (Merge)
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        List<Integer> list = new ArrayList<>();
        String[] array1 = bf.readLine().split(" ");
        String[] array2 = bf.readLine().split(" ");
        for (int i = 0; i < array1.length; i++) {
            list.add(Integer.parseInt(array1[i]));
        }
        for (int i = 0; i < array2.length; i++) {
            list.add(Integer.parseInt(array2[i]));
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
