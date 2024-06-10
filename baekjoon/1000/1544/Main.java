// https://www.acmicpc.net/problem/1544
// 사이클 단어
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
        int size = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder(bf.readLine());
            int legnth = sb.length();
            boolean flag = true;
            for (int j = 0; j < legnth; j++) {
                if(set.contains(sb.toString())){
                    flag = false;
                    break;
                }
                sb.append(String.valueOf(sb.toString().charAt(0)));
                sb.deleteCharAt(0);
            }
            if(flag){
                set.add(sb.toString());
            }
        }
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }


}
