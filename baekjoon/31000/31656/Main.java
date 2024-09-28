// https://www.acmicpc.net/problem/31656
// Sticky Keys
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp = bf.readLine();
        StringBuilder answer = new StringBuilder();
        String str = "";
        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            if(c == ' '){
                String result = getAnswer(str);
                answer.append(result);
                answer.append(" ");
                str = "";
            } else {
                str += String.valueOf(c);
            }
        }
        answer.append(getAnswer(str));
        bw.write(answer.toString() + "\n");
        bw.flush();
        bw.close();
    }

    private static String getAnswer(String str){
        String result = "";
        StringBuilder sb = new StringBuilder(str);
        int index = 1;
        while (true) {
            if(sb.length() <= index){
                break;
            }
            char c1 = sb.charAt(index - 1);
            char c2 = sb.charAt(index);
            if(c1 == c2){
                sb.deleteCharAt(index);
            } else {
                index++;
            }
        }
        result = sb.toString();
        return result;
    }
    

}