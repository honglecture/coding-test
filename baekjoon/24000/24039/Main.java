// https://www.acmicpc.net/problem/24039
// 2021은 무엇이 특별할까?
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        for (int i = 2; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int result = list.get(i) * list.get(i + 1);
            if(result > n){
                answer = result;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
