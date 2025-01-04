// https://www.acmicpc.net/problem/10482
// Goldbach’s Conjecture
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= 32000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            List<String> answerList = new ArrayList<>();

            for (int j = 0; j < list.size(); j++) {
                int n1 = list.get(j);
                int n2 = n - n1;
                if(n2 < n1){
                    break;
                }
                if(list.contains(n2)){
                    answerList.add(n1 + "+" + n2);
                }
            }

            bw.write(n + " has "+(answerList.size())+" representation(s)\n");
            for (int j = 0; j < answerList.size(); j++) {
                bw.write(answerList.get(j) + "\n");
            }
            if(i != size - 1){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }

}