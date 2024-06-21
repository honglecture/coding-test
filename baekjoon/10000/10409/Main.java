// https://www.acmicpc.net/problem/10409
// 서버
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int sum = 0;
        int answer = -1;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if(sum > key){
                answer = i;
                break;
            }
        }
        if(answer == -1){
            answer = size;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}



