// https://www.acmicpc.net/problem/1138
// 한 줄로 서기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int[] answer = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            int key = i + 1;
            int n = array[i];
            int count = 0;
            for (int j = 0; j < answer.length; j++) {
                if(answer[j] != 0){
                    continue;
                }
                if(n == count){
                    answer[j] = key;
                    break;
                } else {
                    count++;
                }
            }
        }
        for (int i = 0; i < answer.length; i++) {
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}