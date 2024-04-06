// https://www.acmicpc.net/problem/7120
// 등록
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String result = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(i == 0){
                temp = s;
                result += s;
            } else {
                if(!temp.equals(s)){
                    temp = s;
                    result += s;
                }
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }
}