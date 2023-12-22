// https://www.acmicpc.net/problem/25640
// MBTI
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int size = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(str.equals(bf.readLine())){
                count++;
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

}
