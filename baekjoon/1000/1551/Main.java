// https://www.acmicpc.net/problem/1551
// 수열의 변화

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
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int order = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split("\\,");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            list.add(Integer.parseInt(sArray[i]));
        }
        for (int i = 0; i < order; i++) {
            List<Integer> nextList = new ArrayList<>();
            for (int j = 1; j < list.size(); j++) {
                int n1 = list.get(j - 1);
                int n2 = list.get(j);
                nextList.add(n2 - n1);
            }
            list = nextList;
        }
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                bw.write(list.get(i) + "");
            } else {
                bw.write(list.get(i) + ",");
            }
            
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }


}
