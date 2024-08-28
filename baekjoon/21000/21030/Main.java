// https://www.acmicpc.net/problem/21030
// Frequent Alphabet
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
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        Set<String> set = new HashSet<>();
        int answer = 0;
        for (int i = 0; i < str1.length(); i++) {
            set.add(String.valueOf(str1.charAt(i)));
            set.add(String.valueOf(str2.charAt(i)));
        }
        for (String key : set) {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                String s1 = String.valueOf(str1.charAt(i));
                String s2 = String.valueOf(str2.charAt(i));
                if(key.equals(s1) || key.equals(s2)){
                    count++;
                }
            }
            answer = Integer.max(answer, count);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
