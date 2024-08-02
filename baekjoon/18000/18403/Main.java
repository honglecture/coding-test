// https://www.acmicpc.net/problem/18403
// KABISA
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(", ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            StringBuilder answer = new StringBuilder();
            for (int j = 0; j < array.length; j++) {
                if(array[j] % 4 == 0){
                    answer.append(array[j] + " ");
                }
            }
            answer.deleteCharAt(answer.length() - 1);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
