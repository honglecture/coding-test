// https://www.acmicpc.net/problem/2251
// 물통
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 =  Integer.parseInt(sArray[0]);
        int n2 =  Integer.parseInt(sArray[1]);
        int n3 =  Integer.parseInt(sArray[2]);
        Set<Integer> set = new HashSet<>();
        Set<String> strSet = new HashSet<>();
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0, n3});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int m1 = pollArray[0];
            int m2 = pollArray[1];
            int m3 = pollArray[2];
            String str = m1 + " " + m2 + " " + m3;
            if(strSet.contains(str)){
                continue;
            }
            strSet.add(str);
            int w1 = m1;
            int w2 = m2;
            int w3 = m3;
            while(true){
                if(w1 == 0){
                    break;
                }
                if(w2 == n2){
                    break;
                }
                w1--;
                w2++;
            }
            queue.add(new int[]{w1, w2, w3});
            w1 = m1;
            w2 = m2;
            w3 = m3;
            while(true){
                if(w1 == 0){
                    break;
                }
                if(w3 == n3){
                    break;
                }
                w1--;
                w3++;
            }
            queue.add(new int[]{w1, w2, w3});
            w1 = m1;
            w2 = m2;
            w3 = m3;
            while(true){
                if(w2 == 0){
                    break;
                }
                if(w1 == n1){
                    break;
                }
                w2--;
                w1++;
            }
            queue.add(new int[]{w1, w2, w3});
            w1 = m1;
            w2 = m2;
            w3 = m3;
            while(true){
                if(w2 == 0){
                    break;
                }
                if(w3 == n3){
                    break;
                }
                w2--;
                w3++;
            }
            queue.add(new int[]{w1, w2, w3});
            w1 = m1;
            w2 = m2;
            w3 = m3;
            while(true){
                if(w3 == 0){
                    break;
                }
                if(w1 == n1){
                    break;
                }
                w3--;
                w1++;
            }
            queue.add(new int[]{w1, w2, w3});
            w1 = m1;
            w2 = m2;
            w3 = m3;
            while(true){
                if(w3 == 0){
                    break;
                }
                if(w2 == n2){
                    break;
                }
                w3--;
                w2++;
            }
            queue.add(new int[]{w1, w2, w3});
        }
        for (String s : strSet) {
            sArray = s.split(" ");
            int m1 = Integer.parseInt(sArray[0]);
            int m2 = Integer.parseInt(sArray[1]);
            int m3 = Integer.parseInt(sArray[2]);
            if(m1 == 0){
                set.add(m3);
            }
        }
        List<Integer> answerList = new ArrayList<>(set);
        Collections.sort(answerList);
        String answer = "";
        for (int n : answerList) {
            answer += n + " ";
        }
        answer = answer.substring(0, answer.length() - 1);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}