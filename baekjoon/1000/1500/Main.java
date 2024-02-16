// https://www.acmicpc.net/problem/1500
// 최대 곱

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
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        List<Integer> list = new ArrayList<>();
        int index = 0;
        int result = n1 % n2;
        for (int i = 0; i < n2; i++) {
            list.add(n1 / n2);
        }
        for (int i = 0; i < result; i++) {
            list.set(index, list.get(index) + 1);
            index++;
        }
        long answer = 1;
        for (int i = 0; i < list.size(); i++) {
            answer *= list.get(i);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
