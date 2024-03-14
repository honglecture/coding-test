// https://www.acmicpc.net/problem/16205
// 변수명
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String type = sArray[0];
        String str = sArray[1];
        List<String> list = new ArrayList<>();
        String answer1 = "";
        String answer2 = "";
        String answer3 = "";
        if(type.equals("1")){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c >= 65 && c <= 90){
                    list.add(result.toLowerCase());
                    result = "";
                    result += c;
                } else {
                    result += c;
                }
            }
            list.add(result.toLowerCase());
        } else if(type.equals("2")){
            sArray = str.split("\\_");
            for (int i = 0; i < sArray.length; i++) {
                list.add(sArray[i]);
            }
        } else {
            String result = String.valueOf(str.charAt(0)).toLowerCase();
            for (int i = 1; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c >= 65 && c <= 90){
                    list.add(result.toLowerCase());
                    result = "";
                    result += c;
                } else {
                    result += c;
                }
            }
            list.add(result.toLowerCase());
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            if(i == 0){
                answer1 += sb.toString();
            } else {
                String temp = String.valueOf(sb.toString().charAt(0)).toUpperCase();
                sb.setCharAt(0, temp.charAt(0));
                answer1 += sb.toString();
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                answer2 += list.get(i);
            } else {
                answer2 += list.get(i) + "_";
            }
        }
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sb = new StringBuilder(list.get(i));
            String temp = String.valueOf(sb.toString().charAt(0)).toUpperCase();
            sb.setCharAt(0, temp.charAt(0));
            answer3 += sb.toString();
        }
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

        bw.flush();
        bw.close();
    }
}

