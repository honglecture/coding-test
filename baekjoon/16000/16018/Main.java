// https://www.acmicpc.net/problem/16018
// Occupy parking
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int minSize = Integer.min(str1.length(), str2.length());
        int count = 0;
        for (int i = 0; i < minSize; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1 == 'C' && c2 == 'C'){
                count++;
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
