// https://www.acmicpc.net/problem/2149
// 암호 해독
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        int size = str1.length();
        String answer = "";
        List<String> list = new ArrayList<>();
        boolean[] checkArray = new boolean[size];
        for (int i = 0; i < str2.length(); i += size) {
            String str = str2.substring(i, i + size);
            list.add(str);
        }
        for (int i = 0; i <= 25; i++) {
            String s1 = String.valueOf((char)(i +  65));
            for (int j = 0; j < str1.length(); j++) {
                if(checkArray[j]){
                    continue;
                }
                String s2 = String.valueOf((char)(str1.charAt(j)));
                if(s1.equals(s2)){
                    checkArray[j] = true;
                    for (int k = 0; k < list.size(); k++) {
                        answer += String.valueOf(list.get(k).charAt(j));
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}
