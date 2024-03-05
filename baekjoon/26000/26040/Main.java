// https://www.acmicpc.net/problem/26040
// 특정 대문자를 소문자로 바꾸기
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        Set<String> set = new HashSet<>();
        String answer = "";
        for (int i = 0; i < sArray.length; i++) {
            set.add(sArray[i]);
        }
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(set.contains(s)){
                s = s.toLowerCase();
            }
            answer += s;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
