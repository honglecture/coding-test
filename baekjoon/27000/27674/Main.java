// https://www.acmicpc.net/problem/27674
// A+B
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String str = bf.readLine();
            int[] array = new int[str.length()];
            for (int j = 0; j < str.length(); j++) {
                array[j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
            Arrays.sort(array);
            str = "";
            for (int j = array.length - 1; j >= 0; j--) {
                str += array[j];
            }
            String str1 = str.substring(0, str.length() - 1);
            String str2 = str.substring(str.length() - 1, str.length());
            long answer = Long.parseLong(str1) + Integer.parseInt(str2);

            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
