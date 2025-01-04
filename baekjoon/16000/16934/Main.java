// https://www.acmicpc.net/problem/16934
// 게임 닉네임
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();
        Set<String> answerSet = new HashSet<>();
        List<String> answerList = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String answer = "";
            if(set.contains(str)){
                if(map.get(str) == null){
                    map.put(str, 2);
                }
                int count = map.get(str);
                answer = str + count;
                map.put(str, count + 1);
            } else {
                int index = 1;
                while (true) {
                    if(index > str.length()){
                        break;
                    }
                    String s = str.substring(0, index++);
                    if(!answerSet.contains(s)){
                        answerSet.add(s);
                        answer = s;
                        break;
                    }
                }
            }
            set.add(str);
            answerList.add(answer);
        }
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}
