// https://www.acmicpc.net/problem/5349
//  Duplicate SSN
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        Set<String> answerSet = new HashSet<>();
        
        while (true) {
            String str = bf.readLine();
            if(str.equals("000-00-0000")){
                break;
            }
            if(set.contains(str)){
                answerSet.add(str);
            }
            set.add(str);
        }
        List<String> list = new ArrayList<>(answerSet);
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}