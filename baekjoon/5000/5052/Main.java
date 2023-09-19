// https://www.acmicpc.net/problem/5052
// 전화번호 목록
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            Map<String, Set<String>> map = new HashMap<>();
            int size = Integer.parseInt(bf.readLine());
            String[] array = new String[size];
            for (int j = 0; j < array.length; j++) {
                String str = bf.readLine();
                array[j] = str;
                StringBuilder sb = new StringBuilder("");
                for (int k = 0; k < str.length() - 1; k++) {
                    sb.append(str.charAt(k));
                    String result = sb.toString();
                    Set<String> set = new HashSet<>();
                    if(map.get(result) != null){
                        set = map.get(result);
                    }
                    set.add(result + str.charAt(k + 1));
                    map.put(result, set);
                }
            }
            Arrays.sort(array, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length() - o2.length();
                }
            });
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                String str = array[j];
                Set<String> set = map.get(str);
                if(set != null){
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}