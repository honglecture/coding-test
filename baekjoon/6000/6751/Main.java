// https://www.acmicpc.net/problem/6751
// From 1987 to 2013
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = n + 1; i <= 20000; i++) {
            String str = String.valueOf(i);
            Set<String> set = new HashSet<>();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(set.contains(s)){
                    flag = false;
                    break;
                }
                set.add(s);
            }
            if(flag){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}