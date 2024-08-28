// https://www.acmicpc.net/problem/25859
// Sort by Frequency
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int[] array = new int[26];
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            array[index]++;
        }
        while (true) {
            int index = -1;
            int maxCount = 0;
            for (int i = 0; i < array.length; i++) {
                if(maxCount < array[i]){
                    index = i;
                    maxCount = array[i];
                }
            }
            for (int i = 0; i < maxCount; i++) {
                answer.append(String.valueOf((char)(index + 97)));
            }
            if(maxCount == 0){
                break;
            }
            array[index] = 0;
        }
        System.out.println(answer.toString());
        bw.flush();
        bw.close();
    }

}
