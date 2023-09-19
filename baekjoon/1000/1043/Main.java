// https://www.acmicpc.net/problem/1043
// 거짓말

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int partySize = Integer.parseInt(sArray[1]);
        Set<Integer> lieSet = new HashSet<>();
        sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        List<Set<Integer>> partyList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            lieSet.add(Integer.parseInt(sArray[i + 1]));
        }
        for (int i = 0; i < partySize; i++) {
            sArray = bf.readLine().split(" ");
            Set<Integer> innerSet = new HashSet<>();
            size = Integer.parseInt(sArray[0]);
            for (int j = 0; j < size; j++) {
                int num = Integer.parseInt(sArray[j + 1]);
                innerSet.add(num);
            }
            partyList.add(innerSet);
        }
        Set<Integer> tempSet = new HashSet<>();
        while(true){
            boolean breakFlag = false;
            for (int i = 0; i < partyList.size(); i++) {
                Set<Integer> innerSet = partyList.get(i);
                boolean flag = false;
                for (int num : innerSet) {
                    if(lieSet.contains(num)){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    if(!tempSet.contains(i)){
                        tempSet.add(i);
                        breakFlag = true;
                    }
                    lieSet.addAll(innerSet);
                }
            }
            if(!breakFlag){
                break;
            }
        }
            
        
        for (int i = 0; i < partyList.size(); i++) {
            Set<Integer> innerSet = partyList.get(i);
            boolean flag = true;
            for (int n1 : lieSet) {
                for (int n2 : innerSet) {
                    if(n1 == n2){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}