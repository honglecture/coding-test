// https://www.acmicpc.net/problem/2476
// 주사위 게임
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] answerArray = new int[size];
        for (int i = 0; i < size; i++) {
            int answer = 0;
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            if(n1 == n2 && n2 == n3 && n3 == n1){
                answer += 10000 + (n1 * 1000);
            } else if(n1 != n2 && n2 != n3 && n3 != n1){
                int[] array = {n1, n2, n3};
                Arrays.sort(array);
                answer += 100 * array[2];
            } else {
                if(n1 == n2){
                    answer += 1000 + (n1 * 100);
                } else if(n2 == n3){
                    answer += 1000 + (n2 * 100);
                } else if(n3 == n1){
                    answer += 1000 + (n3 * 100);
                }
            }
            answerArray[i] = answer;
        }
        Arrays.sort(answerArray);
        bw.write(answerArray[size - 1] + "\n");
        bw.flush();
        bw.close();
    }
}