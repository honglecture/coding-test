// https://www.acmicpc.net/problem/8941
// 7종 경기
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            double result = getAnswer(str);
            String answer = String.format("%.3f", result);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


    private static double getAnswer(String str){
        Map<String, Double> map = new HashMap<>();
        double carbon = 12.01;
        double hydrogen = 1.008;
        double oxygen = 16.00;
        double nitrogen = 14.01;
        map.put("C", carbon);
        map.put("H", hydrogen);
        map.put("O", oxygen);
        map.put("N", nitrogen);
        double answer = 0;
        String type = "";
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(i == 0){
                type = String.valueOf(c);
                continue;
            }
            if(c == 'C'){
                if(num.equals("")){
                    answer += map.get(type);
                } else {
                    answer += map.get(type) * Double.parseDouble(num);
                }
                type = "C";
                num = "";
            } else if(c == 'H'){
                if(num.equals("")){
                    answer += map.get(type);
                } else {
                    answer += map.get(type) * Double.parseDouble(num);
                }
                type = "H";
                num = "";
            } else if(c == 'O'){
                if(num.equals("")){
                    answer += map.get(type);
                } else {
                    answer += map.get(type) * Double.parseDouble(num);
                }
                type = "O";
                num = "";
            } else if(c == 'N'){
                if(num.equals("")){
                    answer += map.get(type);
                } else {
                    answer += map.get(type) * Double.parseDouble(num);
                }
                type = "N";
                num = "";
            } else {
                num += String.valueOf(c);
            }
        }

        if(num.equals("")){
            answer += map.get(type);
        } else {
            answer += map.get(type) * Double.parseDouble(num);
        }


        return answer;
    }
   
}