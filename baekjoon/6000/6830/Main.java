// https://www.acmicpc.net/problem/6830
// It’s Cold Here!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String answer = "";
        int answerNum = Integer.MAX_VALUE;
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            String[] sArray = str.split(" ");
            String name = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(answerNum > n){
                answer = name;
                answerNum = n;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}