// https://www.acmicpc.net/problem/21412
// Дробь
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int start = 0;
        int end = 0;
        if(n % 2 == 0){
            start = n / 2 - 1;
            end = n / 2 + 1;
        } else {
            start = (n - 1) / 2;
            end = n - start;
        }
        while (true) {
            if(checkAnswer(start, end)){
                break;
            }
            start--;
            end++;
        }
        System.out.println(start + " " + end);
        bw.flush();
        bw.close();
    }

    private static boolean checkAnswer(int start, int end){
        if(start == 1){
            return true;
        }
        if(end % start == 0){
            return false;
        }
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(start); i++) {
            if(start % i == 0){
                int n1 = i;
                int n2 = start / i;
                if(end % n1 == 0 || end % n2 == 0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
