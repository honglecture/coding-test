// https://www.acmicpc.net/problem/25815
// Cat’s Age
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int answer1 = 0;
        int answer2 = 0;
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if(n1 > 0){
            answer1 += 15;
            if(n1 > 1){
                answer1 += 9;
                if(n1 > 2){
                    answer1 += (n1 - 2) * 4;
                }
            }
        }
        if(n2 > 0){
            if(n1 < 1){
                answer2 += n2 * 15;
            } else {
                if(n1 == 1){
                    answer2 += n2 * 9;
                } else {
                    answer2 += n2 * 4;
                }
            }
        }
        answer1 += answer2 / 12;
        answer2 = answer2 % 12;
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

}
