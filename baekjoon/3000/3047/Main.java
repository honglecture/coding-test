// https://www.acmicpc.net/problem/3047
// ABC
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
        String[] sArray = bf.readLine().split(" ");
        String str = bf.readLine();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int a = array[0];
        int b = array[1];
        int c = array[2];
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if(chr == 'A'){
                answer += a + " ";
            } else if(chr == 'B'){
                answer += b + " ";
            } else {
                answer += c + " ";
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}