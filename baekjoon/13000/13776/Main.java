// https://www.acmicpc.net/problem/13776
// Alpha Puzzle
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(s.equals(" ")){
                    continue;
                }
                if(set.contains(s)){
                    continue;
                }
                set.add(s);
                sb.append(s);
            }
        }
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }

}