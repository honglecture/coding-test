// https://www.acmicpc.net/problem/11587
// MARKO
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new HashMap<>();
        int answer = 0;
        map.put("a", 2);
        map.put("b", 2);
        map.put("c", 2);
        map.put("d", 3);
        map.put("e", 3);
        map.put("f", 3);
        map.put("g", 4);
        map.put("h", 4);
        map.put("i", 4);
        map.put("j", 5);
        map.put("k", 5);
        map.put("l", 5);
        map.put("m", 6);
        map.put("n", 6);
        map.put("o", 6);
        map.put("p", 7);
        map.put("q", 7);
        map.put("r", 7);
        map.put("s", 7);
        map.put("t", 8);
        map.put("u", 8);
        map.put("v", 8);
        map.put("w", 9);
        map.put("x", 9);
        map.put("y", 9);
        map.put("z", 9);
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        String key = bf.readLine();
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            boolean flag = true;
            if(str.length() != key.length()){
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                int n1 = map.get(String.valueOf(str.charAt(j)));
                int n2 = Integer.parseInt(String.valueOf(key.charAt(j)));
                if(n1 != n2){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}

