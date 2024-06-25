// https://www.acmicpc.net/problem/19583
// 싸이버개강총회
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> answerSet = new HashSet<>();
        String[] sArray = bf.readLine().split(" ");
        String[] sArray1 = sArray[0].split(":");
        String[] sArray2 = sArray[1].split(":");
        String[] sArray3 = sArray[2].split(":");
        int start = Integer.parseInt(sArray1[0]) * 60 + Integer.parseInt(sArray1[1]);
        int end1 = Integer.parseInt(sArray2[0]) * 60 + Integer.parseInt(sArray2[1]);
        int end2 = Integer.parseInt(sArray3[0]) * 60 + Integer.parseInt(sArray3[1]);
        Map<String, Integer> map = new HashMap<>();
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            sArray = str.split(" ");
            String[] timeArray = sArray[0].split(":");
            String name = sArray[1];
            int time = Integer.parseInt(timeArray[0]) * 60 + Integer.parseInt(timeArray[1]);
            if(map.get(name) != null){
                if(time >= end1 && time <= end2){
                    answerSet.add(name);
                }
            } else {
                if(time <= start){
                    map.put(name, time);
                }
            }
        }
        bw.write(answerSet.size() + "\n");
        bw.flush();
        bw.close();
    }
    
}