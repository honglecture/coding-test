// https://www.acmicpc.net/problem/11692
// 시그마 함수
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 1; i <= m; i++) {
            int result = getAnswer(i);
            if(result % 2 == 0){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    

    private static int getAnswer(int n){
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                set.add(i);
                set.add(n / i);
            }
        }
        for (int num : set) {
            sum += num;
        }
        return sum;
    }
}