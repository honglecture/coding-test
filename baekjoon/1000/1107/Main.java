// https://www.acmicpc.net/problem/1107
// 리모컨
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    private static int[] answerArray;
    private static Set<Integer> buttonSet;
    private static int ch;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currentCh = 100;
        ch =  Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        buttonSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            buttonSet.add(i);
        }
        if(size != 0){
            String[] sArray = bf.readLine().split(" ");
            for (int i = 0; i < size; i++) {
                int n = Integer.parseInt(sArray[i]);
                buttonSet.remove(n);
            }
        }
        answerArray = new int[String.valueOf(ch).length() + 1];
        answer = Math.abs(currentCh - ch);
        getAnswer(0, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count != 0){
            String result = "";
            for (int i = 0; i < index; i++) {
                result += answerArray[i];
            }
            int n = Integer.parseInt(result);
            int resultNum = Math.abs(n - ch) + index;
            if(resultNum < answer){
                answer = resultNum;
            }
        }
        if(index == answerArray.length){
            return;
        }
        for (int n : buttonSet) {
            answerArray[index] = n;
            getAnswer(count + 1, index + 1);
            answerArray[index] = 0;
        }
    }

}


