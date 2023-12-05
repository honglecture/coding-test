// https://www.acmicpc.net/problem/23746
// 사이클 게임
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            map.put(str2, str1);
        }
        String str = bf.readLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            result += map.get(s);
        }
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        result = result.substring(start - 1, end);
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
