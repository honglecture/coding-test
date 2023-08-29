// https://www.acmicpc.net/problem/17413
// 단어 뒤집기 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String answer = "";
        // <>
        boolean flag = false;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals("<")){
                flag = true;
                answer += sb.reverse().toString();
                answer += s;
                sb = new StringBuilder("");
            } else if(s.equals(">")){
                flag = false;
                answer += s;
            } else if(s.equals(" ")) {
                if(flag){
                    answer += s;
                } else {
                    answer += sb.reverse().toString();
                    answer += s;
                    sb = new StringBuilder("");
                }
            } else {
                if(flag){
                    answer += s;
                } else {
                    sb.append(s);
                }
            }
        }
        answer += sb.reverse().toString();
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

}
