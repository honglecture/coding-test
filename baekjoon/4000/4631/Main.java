// https://www.acmicpc.net/problem/4631
// Symmetric Order
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 1;
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            String[] array = new String[size];
            String[] answerArray = new String[size];
            for (int i = 0; i < size; i++) {
                String str = bf.readLine();
                array[i] = str;
            }
            int start = 0;
            int end = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                if(i % 2 == 0){
                    answerArray[start++] = array[i];
                } else {
                    answerArray[end--] = array[i];
                }
            }
            bw.write("SET " + count + "\n");
            for (int i = 0; i < answerArray.length; i++) {
                bw.write(answerArray[i] + "\n");
            }
            count++;
        }
        bw.flush();
        bw.close();
    }
    
}