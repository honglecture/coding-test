// https://www.acmicpc.net/problem/13129
// Disposable Cup
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int start = (n1 * n3) + n2;
        List<Integer> list = new ArrayList<>();
        list.add(start);
        for (int i = 0; i < n3 - 1; i++) {
            start += n2;
            list.add(start);
        }
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}