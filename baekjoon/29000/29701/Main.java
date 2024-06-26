// https://www.acmicpc.net/problem/29701
// 모스 부호
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, String> map = new HashMap<>();
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        String result = "";
        map.put("A", ".-");
        map.put("B", "-...");
        map.put("C", "-.-.");
        map.put("D", "-..");
        map.put("E", ".");
        map.put("F", "..-.");
        map.put("G", "--.");
        map.put("H", "....");
        map.put("I", "..");
        map.put("J", ".---");
        map.put("K", "-.-");
        map.put("L", ".-..");
        map.put("M", "--");
        map.put("N", "-.");
        map.put("O", "---");
        map.put("P", ".--.");
        map.put("Q", "--.-");
        map.put("R", ".-.");
        map.put("S", "...");
        map.put("T", "-");
        map.put("U", "..-");
        map.put("V", "...-");
        map.put("W", ".--");
        map.put("X", "-..-");
        map.put("Y", "-.--");
        map.put("Z", "--..");
        map.put("1", ".----");
        map.put("2", "..---");
        map.put("3", "...--");
        map.put("4", "....-");
        map.put("5", ".....");
        map.put("6", "-....");
        map.put("7", "--...");
        map.put("8", "---..");
        map.put("9", "----.");
        map.put("0", "-----");
        map.put(",", "--..--");
        map.put(".", ".-.-.-");
        map.put("?", "..--..");
        map.put(":", "---...");
        map.put("-", "-....-");
        map.put("@", ".--.-.");
        for (int i = 0; i < sArray.length; i++) {
            String str = sArray[i];
            for (String key : map.keySet()) {
                if(map.get(key).equals(str)){
                    result += key;
                    break;
                }
            }
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    

}
