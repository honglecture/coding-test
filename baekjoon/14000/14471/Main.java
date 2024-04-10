// https://www.acmicpc.net/problem/14471
// 포인트 카드
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int answer = 0;
        for (int i = 0; i < m; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 < n2){
                list.add(n2 - n1);
            } else {
                count++;
            }
        }
        if(count < m - 1){
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                answer += list.get(i) / 2;
                count++;
                if(count >= m - 1){
                    break;
                }
            }
            System.out.println(answer);
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }
}