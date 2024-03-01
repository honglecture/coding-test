// https://www.acmicpc.net/problem/28417
// 스케이트보드
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int result = 0;
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            List<Integer> list = new ArrayList<>();
            for (int j = 2; j < 7; j++) {
                list.add(Integer.parseInt(sArray[j]));
            }
            Collections.sort(list);
            result = Integer.max(n1, n2) + list.get(4) + list.get(3);
            answerList.add(result);
        }
        Collections.sort(answerList);
        System.out.println(answerList.get(answerList.size() - 1));
        bw.flush();
        bw.close();
    }

  
}
