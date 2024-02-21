// https://www.acmicpc.net/problem/17618
// 신기한 수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 1; i <= size; i++) {
            if(getAnswer(i)){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static boolean getAnswer(int n){
        boolean result = false;
        int sum = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        if(n % sum  == 0){
            result = true;
        }
        return result;
    }
}