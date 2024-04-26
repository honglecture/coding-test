// https://www.acmicpc.net/problem/14241
// 슬라임 합치기
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            list.add(Integer.parseInt(sArray[i]));
        }
        while (true) {
            if(list.size() == 1){
                break;
            }
            Collections.sort(list);
            int n1 = list.get(list.size() - 1);
            int n2 = list.get(list.size() - 2);
            sum += n1 * n2;
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(n1 + n2);
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }


}