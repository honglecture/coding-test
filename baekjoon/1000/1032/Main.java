// https://www.acmicpc.net/problem/1032
// 명령 프롬프트

import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        String result = "";
        for (int i = 0; i < array[0].length(); i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < array.length; j++) {
                set.add(array[j].charAt(i) + "");
            }
            if(set.size() != 1){
                result += "?";
            } else {
                result += set.iterator().next();
            }
        }
        bw.write(result +"\n");
        bw.flush();
        bw.close();
    }
    
}