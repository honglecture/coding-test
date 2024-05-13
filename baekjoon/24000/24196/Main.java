// https://www.acmicpc.net/problem/24196
// Gömda ord
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = String.valueOf(str.charAt(0));
        int currentIndex = 0;
        while (true) {
            int count = (int)(answer.charAt(answer.length() - 1)) - 64;
            currentIndex += count;
            if(currentIndex >  str.length() - 1){
                break;
            }
            answer += String.valueOf(str.charAt(currentIndex));
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
