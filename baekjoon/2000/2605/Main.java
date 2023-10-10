// https://www.acmicpc.net/problem/2605
// 줄 세우기
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            list.add(n, i + 1);
        }
        String result = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            result += list.get(i) + " ";
        }
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }

}