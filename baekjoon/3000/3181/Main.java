// https://www.acmicpc.net/problem/3181
// 줄임말 만들기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        set.add("i");
        set.add("pa");
        set.add("te");
        set.add("ni");
        set.add("niti");
        set.add("a");
        set.add("ali");
        set.add("nego");
        set.add("no");
        set.add("ili");
        sb.append(String.valueOf(sArray[0].charAt(0)).toUpperCase());
        for (int i = 1; i < sArray.length; i++) {
            String str = sArray[i];
            if(set.contains(str)){
                continue;
            }
            sb.append(String.valueOf(sArray[i].charAt(0)).toUpperCase());
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}