// https://www.acmicpc.net/problem/13410
// 거꾸로 구구단
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n2; i++) {
            int result = i * n1;
            StringBuilder sb = new StringBuilder(result + "").reverse();
            list.add(Integer.parseInt(sb.toString()));
        }
        Collections.sort(list);
        int answer = list.get(list.size() - 1);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}