// https://www.acmicpc.net/problem/15494
// Davor
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = 1;
        int k = 1;
        int n = Integer.parseInt(bf.readLine());
        int answerX = Integer.MIN_VALUE;
        int answerK = Integer.MAX_VALUE;
        while (true) {
            int sum = 0;
            sum += x * 52;
            if(sum >= n){
                break;
            }
            int temp = 0;
            for (int i = 0; i < 7; i++) {
                temp += (i * k);
            }
            temp *= 52;
            sum += temp;
            bw.write(sum + "\n");
            if(sum > n){
                x++;
                k = 1;
            } else if(sum == n){
                if(answerX < x){
                    answerX = x;
                    answerK = k;
                } else if(answerX == x){
                    if(answerK > k){
                        answerX = x;
                        answerK = k;
                    }
                }
                x++;
                k = 1;
            } else {
                k++;
            }
        }
        System.out.println(answerX);
        System.out.println(answerK);
        bw.flush();
        bw.close();
    }

    
}

// 52 * 1;
// 1 + 2+ 6+ 8 + 10 + 12 =>  