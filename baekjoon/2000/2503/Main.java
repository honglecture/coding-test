// https://www.acmicpc.net/problem/2503
// 숫자 야구
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            map.put(n1, new int[]{n2, n3});
        }
        for (int i = 111; i <= 999; i++) {
            boolean flag = true;
            String str1 = i + "";
            Set<String> set = new HashSet<>();
            for (int j = 0; j < str1.length(); j++) {
                set.add(String.valueOf(str1.charAt(j)));
            }
            if(set.size() != 3){
                continue;
            }
            if(set.contains("0")){
                continue;
            }
            for (int key : map.keySet()) {
                int[] array = map.get(key);
                String str2 = key + "";
                int n1 = array[0];
                int n2 = array[1];
                int n3 = 0;
                int n4 = 0;
                for (int j = 0; j < str2.length(); j++) {
                    String c = str2.charAt(j) + "";
                    if(str1.contains(c)){
                        if(str1.charAt(j) == str2.charAt(j)){
                            n3++;
                        } else {
                            n4++;
                        }
                    }
                }
                if(n1 != n3 || n2 != n4){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}