// https://www.acmicpc.net/problem/14769
// Stacking Cups
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
        int size = Integer.parseInt(bf.readLine());
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            char c = str1.charAt(0);
            String type = "";
            int n = 0;
            if(c >= 48 && c <= 57){
                type = str2;
                n = Integer.parseInt(str1);
            } else {
                type = str1;
                n = Integer.parseInt(str2) * 2;
            }
            map.put(n, type);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(map.get(list.get(i)) + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}