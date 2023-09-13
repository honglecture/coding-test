// https://www.acmicpc.net/problem/2506
// 점수계산
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int answer = 0;
        int score = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                answer += score;
                score++;
            } else {
                score = 1;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
}