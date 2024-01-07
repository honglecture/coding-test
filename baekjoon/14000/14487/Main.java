// https://www.acmicpc.net/problem/14487
// 욱제는 효도쟁이야!!
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int maxIndex = 0;
        int maxNum = 0;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxNum){
                maxIndex = i;
                maxNum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(i == maxIndex){
                continue;
            }
            answer += array[i];
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}