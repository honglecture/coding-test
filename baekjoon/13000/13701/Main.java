// https://www.acmicpc.net/problem/13701
// 중복 제거
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < sArray.length; i++) {
            String str = sArray[i];
            if(set.contains(str)){
                continue;
            }
            set.add(str);
            bw.write(str + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}