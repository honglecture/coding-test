// https://www.acmicpc.net/problem/2993
// 세 부분
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int size = str.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 2; j < size; j++) {
                String s1 = str.substring(0, i + 1);
                String s2 = str.substring(i + 1, j);
                String s3 = str.substring(j, size);
                String result1 = getAnswer(s1);
                String result2 = getAnswer(s2);
                String result3 = getAnswer(s3);
                list.add(result1 + result2 + result3);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        bw.flush();
        bw.close();
    }
    private static String getAnswer(String str){
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length() / 2; i++) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(sb.length() - 1 - i);
            sb.setCharAt(sb.length() - 1 - i, c1);
            sb.setCharAt(i, c2);
        }
        return sb.toString();
    }
}