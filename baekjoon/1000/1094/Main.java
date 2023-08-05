// https://www.acmicpc.net/problem/1094
// 막대기
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int start = 64;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        list.add(start);
        while(true){
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            Collections.sort(list);
            if(sum > n){
                int n2 = list.get(0);
                n2 /= 2;
                if(sum - n2 >= n){
                    list.remove(0);
                    list.add(n2);
                } else {
                    list.remove(0);
                    list.add(n2);
                    list.add(n2);
                }
            }
            sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if(sum == n){
                count = list.size();
                break;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    
}

// 23
// 64 => 32 => 32
// 32 => 16 16
// 16 16 => 16 8

