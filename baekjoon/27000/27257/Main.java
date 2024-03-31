// https://www.acmicpc.net/problem/27257
// Любитель нулей
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        int answer = 0;
        while (true) {
            if(sb.length() == 0){
                break;
            }
            if(sb.charAt(sb.length() - 1) == '0'){
                sb.deleteCharAt(sb.length() - 1);
            } else {
                break;
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) == '0'){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
