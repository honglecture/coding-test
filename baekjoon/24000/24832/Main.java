// https://www.acmicpc.net/problem/24832
// Longest Palindrome
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < size1; i++) {
            StringBuilder sb1 = new StringBuilder(bf.readLine());
            StringBuilder sb2 = new StringBuilder(sb1.toString()).reverse();
            if(sb1.toString().equals(sb2.toString())){
                set2.add(sb1.toString());
            } else {
                set1.add(sb1.toString());
            }
        }
        StringBuilder answer = new StringBuilder();
        Set<String> answerSet = new HashSet<>();
        for (String str : set1) {
            StringBuilder sb = new StringBuilder(str).reverse();
            if(set1.contains(sb.toString())){
                if(answerSet.contains(str) || answerSet.contains(sb.toString())){
                    continue;
                }
                answerSet.add(str);
            }
        }
        for (String str : answerSet) {
            answer.append(str);
        }
        String temp = new StringBuilder(answer.toString()).reverse().toString();
        if(set2.size() != 0){
            answer.append(set2.iterator().next());
        }
        answer.append(temp);
        if(answer.toString().equals("")){
            System.out.println("0");
        } else {
            System.out.println(answer.toString().length());
            System.out.println(answer.toString());
        }
        bw.flush();
        bw.close();
    }

}
