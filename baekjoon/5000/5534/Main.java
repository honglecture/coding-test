// https://www.acmicpc.net/problem/5534
// 간판
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String key = bf.readLine();
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            boolean result = getAnswer(key, str);
            if(result){
                answer++;
            }
        }
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }
    private static boolean getAnswer(String key, String str){
        boolean result = false;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int startIndex = -1;
            if(str.charAt(i) == key.charAt(0)){
                startIndex = i;
            }
            if(startIndex != -1){
                map.put(startIndex, new ArrayList<>());
                for (int j = startIndex + 1; j < str.length(); j++) {
                    if(str.charAt(j) == key.charAt(1)){
                        map.get(startIndex).add(j);
                    }
                }
            }
        }
        for (int startIndex : map.keySet()) {
            List<Integer> nextIndexList = map.get(startIndex);
            for (int i = 0; i < nextIndexList.size(); i++) {
                StringBuilder sb = new StringBuilder();
                int keyIndex = nextIndexList.get(i) - startIndex;
                for (int j = startIndex; j < str.length(); j+=keyIndex) {
                    sb.append(str.charAt(j)+"");
                    if(sb.length() == key.length()){
                        break;
                    }
                }
                if(sb.toString().equals(key)){
                    return true;
                }
            }
        }
        return result;
    }
}