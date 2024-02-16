// https://www.acmicpc.net/problem/17509
// And the Winner Is... Ourselves!
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        int[] array = new int[11];
        int[] answerArray = new int[11];
        int temp = 0;
        for (int i = 0; i < 11; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = n1;
            array[i] = result;
            temp += 20 * n2;
        }
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            answerArray[i] = sum;
        }
        for (int i = 0; i < answerArray.length; i++) {
            answer += answerArray[i];
        }
        System.out.println(answer + temp);
        bw.flush();
        bw.close();
    }

}
