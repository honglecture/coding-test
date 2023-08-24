// https://www.acmicpc.net/problem/15829
// Hashing
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 1;
        long answer = 0;

        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 96;
            int checkCount = 0;
            long sum = n;
            if(i == 0){
                answer += n;
            } else {
                while(true){
                    if(checkCount == count){
                        break;
                    }
                    checkCount++;
                    sum *= 31;
                    sum %= 1234567891;
                }
                count++;
                answer += sum;
                answer %= 1234567891;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}