// https://www.acmicpc.net/problem/30822
// UOSPC 세기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        int answer = Integer.MAX_VALUE;
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 97;
            array[index]++;
        }
        for (int i = 0; i < array.length; i++) {
            char c = (char)(i + 97);
            int count = array[i];
            if(c == 'u' || c == 'o' || c == 's' || c == 'p' || c == 'c'){
                answer = Integer.min(answer, count);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
