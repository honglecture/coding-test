// https://www.acmicpc.net/problem/1697
// 숨바꼭질

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        boolean[] array = new boolean[200000];
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Set<Integer> currentList = new HashSet<>();
        currentList.add(n1);
        int count = 0;
        while(true){
            if(currentList.contains(n2)){
                break;
            }
            Set<Integer> nextList = new HashSet<>();
            for (int n : currentList) {
                int nextNum1 = n - 1;
                int nextNum2 = n + 1;
                int nextNum3 = n * 2;
                if(nextNum1 > -1){
                    if(!array[nextNum1]){
                        array[nextNum1] = true;
                        nextList.add(nextNum1);
                    }
                }
                if(nextNum2 < array.length){
                    if(!array[nextNum2]){
                        array[nextNum2] = true;
                        nextList.add(nextNum2);
                    }
                }
                if(nextNum3 < array.length){
                    if(!array[nextNum3]){
                        array[nextNum3] = true;
                        nextList.add(nextNum3);
                    }
                }
            }
            currentList.clear();
            currentList.addAll(nextList);
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }


}
