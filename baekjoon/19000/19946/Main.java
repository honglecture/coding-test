// https://www.acmicpc.net/problem/19946
// 2의 제곱수 계산하기
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.println(Double.MAX_VALUE);
        long n = Long.parseLong(bf.readLine());
        
        Map<Integer, Long> map = new HashMap<>();
        for (int i = 1; i <= 64; i++) {
            long start = 2;
            int index = 1;
            while (true) {
                if(index == i){
                    start -= 1;
                }
                index++;
                start *= 2;
                if(index == 65){
                    break;
                }
            }
            map.put(i, start);
        }
        System.out.println(map);
        bw.flush();
        bw.close();
    }

    
}