// https://www.acmicpc.net/problem/7600
// 문자가 몇갤까
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
        while (true) {
            String str = bf.readLine().toUpperCase();
            Set<String> set = new HashSet<>();
            if(str.equals("#")){
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c >= 65 && c <= 90){
                    set.add(String.valueOf(c));
                }
            }
            bw.write(set.size() + "\n");
        }
        bw.flush();
        bw.close();
    }
}