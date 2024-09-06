// https://www.acmicpc.net/problem/24573
// Good Fours and Good Fives
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        int answer = 0;
        while (true) {
            if(count == 0){
                if(n % 5 == 0){
                    answer++;
                }
                count++;
            } else {
                int result = n - (count * 4);
                if(result < 0){
                    break;
                }
                if(result % 5 == 0){
                    answer++;
                }
                count++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
