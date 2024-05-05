// https://www.acmicpc.net/problem/8965
// Circular Sequence
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            List<String> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder(bf.readLine());
            int legnth = sb.length();
            for (int j = 0; j < legnth; j++) {
                list.add(sb.toString());
                char temp = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(String.valueOf(temp));
            }
            Collections.sort(list);
            bw.write(list.get(0) + "\n");
        }
        bw.flush();
        bw.close();
    }

    
   
}