// https://www.acmicpc.net/problem/20362
// 유니대전 퀴즈쇼
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int count = 0;
        int size = Integer.parseInt(sArray[0]);
        String answerName = sArray[1];
        int answerIndex = 0;
        String answerString = "";
        String[][] array = new String[size][2];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            String name = sArray[0];
            String answer = sArray[1];
            array[i][0] = name;
            array[i][1] = answer;
            if(answerName.equals(name)){
                answerIndex = i;
                answerString = answer;
            }
        }
        for (int i = 0; i < answerIndex; i++) {
            String answer = array[i][1];
            if(answer.equals(answerString)){
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
