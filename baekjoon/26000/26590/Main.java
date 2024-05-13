// https://www.acmicpc.net/problem/26590
// Word Mix
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String min = "";
        String max = "";
        String answer = "";
        if(sArray[0].length() > sArray[1].length()){
            min = sArray[1];
            max = sArray[0];
        } else if(sArray[1].length() > sArray[0].length()){
            min = sArray[0];
            max = sArray[1];
        } else {
            min = sArray[0];
            max = sArray[1];
        }
        for (int i = 0; i < min.length(); i++) {
            if(i % 2 == 0){
                answer += min.charAt(i);
            } else {
                answer += max.charAt(i);
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
