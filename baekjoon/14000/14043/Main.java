// https://www.acmicpc.net/problem/14043
// Ragaman
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        Map<String, Integer> map = new HashMap<>();
        boolean flag = true;
        for (int i = 0; i < str1.length(); i++) {
            String s = String.valueOf(str1.charAt(i));
            if(map.get(s) == null){
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            String s = String.valueOf(str2.charAt(i));
            if(!s.equals("*")){
                if(map.get(s) == null){
                    flag = false;
                    break;
                } else {
                    int n = map.get(s);
                    if(n == 0){
                        flag = false;
                        break;
                    } else {
                        map.put(s, n - 1);
                    }
                }
            }
        }
        if(flag){
            System.out.println("A");
        } else {
            System.out.println("N");
        }
        bw.flush();
        bw.close();
    }


}