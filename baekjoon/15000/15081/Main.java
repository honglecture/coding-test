// https://www.acmicpc.net/problem/15081
// Is Everybody Appy?
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
        int testCase = Integer.parseInt(bf.readLine());
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            List<String> list = new ArrayList<>();
            for (int j = 1; j < sArray.length; j++) {
                list.add(sArray[j]);
            }
            map.put(i, list);
        }
        Set<String> set = new HashSet<>();
        List<String> answerList = new ArrayList<>();
        int index = 0;
        while (true) {
            if(answerList.size() == testCase){
                break;
            }
            List<String> list = map.get(index);
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if(!set.contains(str)){
                    set.add(str);
                    answerList.add(str);
                    break;
                }
            }
            index++;
            if(index == testCase){
                index = 0;
            }
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < answerList.size(); i++) {
            answer.append(answerList.get(i) + " ");
        }
        answer.deleteCharAt(answer.length() - 1);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
