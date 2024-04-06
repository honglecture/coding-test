// https://www.acmicpc.net/problem/4575
// Refrigerator Magnets
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
            String str = bf.readLine();
            if(str.equals("END")){
                break;
            }
            Set<String> set = new HashSet<>();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if(s.equals(" ")){
                    continue;
                }
                if(set.contains(s)){
                    flag = false;
                    break;
                }
                set.add(s);
            }
            if(flag){
                bw.write(str + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

   
}