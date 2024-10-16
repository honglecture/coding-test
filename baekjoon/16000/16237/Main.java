// https://www.acmicpc.net/problem/16237
// 이삿짐센터
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int[] answerArray = new int[100000];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int count = array[i];
            int n = i + 1;
            int index = 0;
            while (true) {
                if(count == 0){
                    break;
                }
                if(answerArray[index] + n > 5){
                    index++;
                    continue;
                }
                answerArray[index] += n;
                count--;
            }            
        }
        for (int i = 0; i < answerArray.length; i++) {
            if(answerArray[i] == 0){
                break;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
