// https://www.acmicpc.net/problem/23348
// 스트릿 코딩 파이터
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] scoreArray = new int[sArray.length];
        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] = Integer.parseInt(sArray[i]);
        }
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                int n3 = Integer.parseInt(sArray[2]);
                sum += scoreArray[0] * n1;
                sum += scoreArray[1] * n2;
                sum += scoreArray[2] * n3;
            }
            list.add(sum);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        bw.flush();
        bw.close();
    }
    

}
