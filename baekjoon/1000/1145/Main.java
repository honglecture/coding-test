// https://www.acmicpc.net/problem/1145
// 적어도 대부분의 배수
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int answer = 1;
        while(true){
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                int n = array[i];
                if(answer % n == 0){
                    count++;
                }
            }
            if(count >= 3){
                break;
            }
            answer++;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}