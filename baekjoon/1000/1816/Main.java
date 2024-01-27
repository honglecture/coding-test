// https://www.acmicpc.net/problem/1816
// 암호 키

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        list.add(2);
        for (int i = 3; i <= 1000000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        for (int i = 0; i < size; i++) {
            long n = Long.parseLong(bf.readLine());
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if(n % list.get(j) == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
