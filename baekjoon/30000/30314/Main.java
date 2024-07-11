// https://www.acmicpc.net/problem/30314
// Just a Joystick
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int answer = 0;
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            int result = 0;
            int result1 = Math.abs(c1 - c2);
            int result2 = 0;
            if(c1 > c2){
                int temp = 25 - (c1 - 65);
                result2 = temp + (c2 - 65) + 1;
            } else if(c1 < c2){
                int temp = 25 - (c2 - 65);
                result2 = temp + (c1 - 65) + 1;
            } else {
                result2 = 0;
            }
            result = Integer.min(result1, result2);
            answer += result;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
