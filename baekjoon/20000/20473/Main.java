// https://www.acmicpc.net/problem/20473
// Гостиница
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer1 = 0;
        int answer2 = 0;
        int count = 0;
        int sum = Integer.MAX_VALUE;
        while (true) {
            int result = count * 2;
            if(result > n){
                break;
            }
            int temp = n - result;
            if(temp % 3 == 0){
                int count1 = count;
                int count2 = temp / 3;
                if(count1 + count2 < sum){
                    sum = count1 + count2;
                    answer1 = count1;
                    answer2 = count2;
                }
            }
            count++;
        }
        System.out.println(answer1 + " " + answer2);
        bw.flush();
        bw.close();
    }

}
