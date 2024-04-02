// https://www.acmicpc.net/problem/27891
// 특별한 학교 이름 암호화
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new ArrayList<>();
        List<String> nameList = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        String key = bf.readLine();
        list.add("North London Collegiate School");
        list.add("Branksome Hall Asia");
        list.add("Korea International School");
        list.add("St. Johnsbury Academy");
        for (int i = 0; i < list.size(); i++) {
            String result = "";
            String name = list.get(i);
            for (int j = 0; j < name.length(); j++) {
                char c = name.charAt(j);
                if(c == ' ' || c == '.'){
                    continue;
                }
                result += c;
            }
            result = result.toLowerCase();
            if(result.length() > 10){
                result = result.substring(0, 10);
            }
            nameList.add(result);
            map.put(result, list.get(i));
        }
        int count = 1;
        while (true) {
            String str = "";
            for (int i = 0; i < key.length(); i++) {
                int c = key.charAt(i) + count;
                if(c > 122){
                    c -= 26;
                }
                str += String.valueOf((char) c);
            }
            if(nameList.contains(str)){
                String answer = map.get(str);
                if(answer.equals("North London Collegiate School")){
                    System.out.println("NLCS");
                } else if(answer.equals("Branksome Hall Asia")){
                    System.out.println("BHA");
                } else if(answer.equals("Korea International School")){
                    System.out.println("KIS");
                } else if(answer.equals("St. Johnsbury Academy")){
                    System.out.println("SJA");
                }
                break;
            }
            count++;
            if(count > 26){
                break;
            }
        }
        bw.flush();
        bw.close();
    }

    

}
