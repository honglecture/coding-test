// https://www.acmicpc.net/problem/15184
// Angles
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine().toUpperCase();
        int[] array = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - 65;
            if(n >= 0 && n <= 25){
                array[n]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            char c = (char) (i + 65);
            int count = array[i];
            String result = c + " | ";
            for (int j = 0; j < count; j++) {
                result += "*";
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
