// https://www.acmicpc.net/problem/24080
// 複雑な文字列 (Complex String)
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E'){
                set.add(String.valueOf(c));
            }
        }
        if(set.size() >= 3){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        bw.flush();
        bw.close();
    }

}
