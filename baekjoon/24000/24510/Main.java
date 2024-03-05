// https://www.acmicpc.net/problem/24510
// 시간복잡도를 배운 도도
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int length = str.length();
            int result1 = str.replaceAll("for", "").length();
            int result2 = str.replaceAll("while", "").length();
            int sum = ((length - result1) / 3) + ((length - result2) / 5);
            list.add(sum);

        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        bw.flush();
        bw.close();
    }
    

}
