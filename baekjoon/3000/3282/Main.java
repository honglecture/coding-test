// https://www.acmicpc.net/problem/3282
// ROOMS
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] answerArray = new int[Integer.parseInt(sArray[0])];
        int size = Integer.parseInt(sArray[1]);
        int currentIndex = 0;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            while (true) {
                if(answerArray[currentIndex] < 2){
                    n--;
                    answerArray[currentIndex]++;
                    if(n == 0){
                        currentIndex++;
                        if(currentIndex > answerArray.length - 1){
                            currentIndex = 0;
                        }
                        break;
                    }
                } else {
                    currentIndex++;
                    if(currentIndex > answerArray.length - 1){
                        currentIndex = 0;
                    }
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}