// https://www.acmicpc.net/problem/29614
// 학점계산프로그램
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        double answer = 0;
        double sum1 = 0;
        int sum2 = 0;
        Map<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A", 4.0);
        map.put("B+", 3.5);
        map.put("B", 3.0);
        map.put("C+", 2.5);
        map.put("C", 2.0);
        map.put("D+", 1.5);
        map.put("D", 1.0);
        map.put("F", 0.0);
        for (int i = 0; i < str.length(); i++) {
            String s1 = String.valueOf(str.charAt(i));
            if(s1.equals("+")){
                continue;
            }
            if(s1.equals("F")){
                sum2++;
                continue;
            }
            if(i + 1 < str.length()){
                String temp = String.valueOf(str.charAt(i + 1));
                if(temp.equals("+")){
                    s1 += "+";
                }
            }
            sum1 += map.get(s1);
            sum2++;
            
        }
        answer = sum1 / sum2;
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
