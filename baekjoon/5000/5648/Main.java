// https://www.acmicpc.net/problem/5648
// 역원소 정렬
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        List<Long> list = new ArrayList<>();
        for (int i = 1; i < sArray.length; i++) {
            StringBuilder sb = new StringBuilder(sArray[i]).reverse();
            list.add(Long.parseLong(sb.toString()));
        }
        while (true) {
            if(list.size() == size){
                break;
            }
            sArray = bf.readLine().trim().split(" ");
            for (int i = 0; i < sArray.length; i++) {
                if(sArray[i].equals("")){
                    continue;
                }
                StringBuilder sb = new StringBuilder(sArray[i]).reverse();
                list.add(Long.parseLong(sb.toString()));
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}