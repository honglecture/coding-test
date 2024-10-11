// https://www.acmicpc.net/problem/31458
// !!초콜릿 중독 주의!!
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            StringBuilder str = new StringBuilder(bf.readLine());
            int result = getAnswer(str);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(StringBuilder str){
        int result = 0;
        Map<String, String> map = new HashMap<>();
        map.put("0!", "1");
        map.put("1!", "1");
        map.put("!0", "1");
        map.put("!1", "0");
        while (true) {
            if(str.length() == 1){
                break;
            }
            int index = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c == '0' || c == '1'){
                    index = i;
                    break;
                }
            }
            if(index == str.length() - 1){
                String key = String.valueOf(str.charAt(index - 1)) + String.valueOf(str.charAt(index));
                str.deleteCharAt(index - 1);
                str.setCharAt(str.length() - 1, map.get(key).charAt(0));
            } else {
                String key = String.valueOf(str.charAt(index)) + String.valueOf(str.charAt(index + 1));
                str.deleteCharAt(index + 1);
                str.setCharAt(index, map.get(key).charAt(0));
            }
        }
        result = Integer.parseInt(str.toString());
        return result;
    }
    

}

