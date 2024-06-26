// https://www.acmicpc.net/problem/18813
// Divisionals Spelling
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        int answer = 0;
        for (int i = 0; i < size; i++) {
            Set<String> set = new HashSet<>();
            String str = bf.readLine();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                int n = str.charAt(j) - 65;
                if(n > key - 1){
                    flag = false;
                    break;
                }
                if(set.contains(String.valueOf(str.charAt(j)))){
                    flag = false;
                    break;
                }
                set.add(String.valueOf(str.charAt(j)));
            }
            if(flag){
                answer++;
            }
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

}
