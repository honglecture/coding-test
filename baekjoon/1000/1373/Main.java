// https://www.acmicpc.net/problem/1373
// 2진수 8진수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> map = new HashMap<>();
        map.put("000", "0");
        map.put("001", "1");
        map.put("010", "2");
        map.put("011", "3");
        map.put("100", "4");
        map.put("101", "5");
        map.put("110", "6");
        map.put("111", "7");
        String str = bf.readLine();
        if(str.length() % 3 == 1){
            str = "00" + str;
        } else if(str.length() % 3 == 2){
            str = "0" + str;
        }
        StringBuilder result = new StringBuilder("");
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            if(result.length() == 3){
                answer.append(map.get(result.toString()));
                result = new StringBuilder("");
            }
        }
        bw.write(answer.toString() + "\n");
        bw.flush();
        bw.close();
    }

}