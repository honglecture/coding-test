// https://www.acmicpc.net/problem/2857
// FBI
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";
        for (int i = 0; i < 5; i++) {
            String str = bf.readLine();
            if(str.contains("FBI")){
                answer += (i + 1) + " ";
            }
        }
        if(answer.equals("")){
            System.out.println("HE GOT AWAY!");
        } else {
            System.out.println(answer.substring(0, answer.length() - 1));
        }
        bw.flush();
        bw.close();
    }
}