// https://www.acmicpc.net/problem/27522
// 카트라이더: 드리프트
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Double, String> map = new HashMap<>();
        List<Double> list = new ArrayList<>();
        int[] scoreArray = {10, 8, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < 8; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str = sArray[0];
            String team = sArray[1];
            double result = 0;
            sArray = str.split("\\:");
            result += Double.parseDouble(sArray[0]) * 60;
            result += Double.parseDouble(sArray[1]);
            result += Double.parseDouble("0." + sArray[2]);
            list.add(result);
            map.put(result, team);
        }
        Collections.sort(list);
        int blueScore = 0;
        int redScore = 0;
        for (int i = 0; i < list.size(); i++) {
            double n = list.get(i);
            String team = map.get(n);
            if(team.equals("B")){
                blueScore += scoreArray[i];
            } else {
                redScore += scoreArray[i];
            }
        }
        if(blueScore > redScore){
            System.out.println("Blue");
        } else if(blueScore < redScore){
            System.out.println("Red");
        } else {
            String team = map.get(list.get(0));
            if(team.equals("B")){
                System.out.println("Blue");
            } else {
                System.out.println("Red");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
