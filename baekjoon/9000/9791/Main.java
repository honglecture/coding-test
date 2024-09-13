// https://www.acmicpc.net/problem/9791
// Encoding Binary Numbers
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String temp = bf.readLine();
            if(temp.equals("0")){
                break;
            }
            String answer = "";
            int count = 0;
            char current = ' ';
            for (int i = 0; i < temp.length(); i++) {
                char c = temp.charAt(i);
                if(i == 0){
                    current = c;
                    count++;
                    continue;
                }
                if(current == c){
                    count++;
                } else {
                    answer += count + "" + String.valueOf(current);
                    count = 1;
                    current = c;
                }
            }
            answer += count + "" + String.valueOf(current);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}