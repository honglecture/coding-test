// https://www.acmicpc.net/problem/7510
// 고급 수학
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[3];
            for (int j = 0; j < sArray.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            int result1 = (array[0] * array[0]) + (array[1] * array[1]);
            int result2 = array[2] * array[2];
            bw.write("Scenario #"+(i + 1)+":\n");
            if(result1 == result2){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}