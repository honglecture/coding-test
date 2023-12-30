// https://www.acmicpc.net/problem/10823
// 더하기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str  = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            sb.append(str);
        }
        String[] sArray = sb.toString().split("\\,");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            answer += Integer.parseInt(sArray[i]);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
}