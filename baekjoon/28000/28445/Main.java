// https://www.acmicpc.net/problem/28445
// 알록달록 앵무새
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
        List<String> list = new ArrayList<>();
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        for (int i = 0; i < sArray1.length; i++) {
            if(!list.contains(sArray1[i])){
                list.add(sArray1[i]);
            }
        }
        for (int i = 0; i < sArray2.length; i++) {
            if(!list.contains(sArray2[i])){
                list.add(sArray2[i]);
            }
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                String str1 = list.get(i) + " " + list.get(j);
                String str2 = list.get(j) + " " + list.get(i);
                set.add(str1);
                set.add(str2);
            }
        }
        List<String> answerList = new ArrayList<>(set);
        Collections.sort(answerList);
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

  
}
