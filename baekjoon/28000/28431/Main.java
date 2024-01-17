// https://www.acmicpc.net/problem/28431
// 양말 짝 맞추기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10];
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(bf.readLine());
            array[n]++;
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
