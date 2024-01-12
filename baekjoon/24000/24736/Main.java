// https://www.acmicpc.net/problem/24736
// Football Scoring
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int[] array = {6, 3, 2, 1, 2};
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < array.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]) * array[i];
            int n2 = Integer.parseInt(sArray2[i]) * array[i];
            answer1 += n1;
            answer2 += n2;
        }
        System.out.println(answer1 +  " " + answer2);
        bw.flush();
        bw.close();
    }

    

}
