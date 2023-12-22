// https://www.acmicpc.net/problem/9933
// 민균이의 비밀번호
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        String answer = "";
        int n = 0;
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder(bf.readLine());
            list.add(sb.toString());
            String s = sb.reverse().toString();
            set.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(set.contains(s)){
                n = s.length();
                answer = s.charAt(n / 2) + "";
                break;
            }
        }
        
        System.out.println(n + " " + answer);
        bw.flush();
        bw.close();
    }
}