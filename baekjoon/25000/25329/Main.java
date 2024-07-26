// https://www.acmicpc.net/problem/25329
// 학생별 통화 요금 계산
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
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String str1 = sArray[0];
            String str2 = sArray[1];
            sArray = str1.split("\\:");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int sum = (n1 * 60) +  n2;
            if(map.get(str2) != null){
                map.put(str2, map.get(str2) + sum);
            } else {
                map.put(str2, sum);
            }
        }
        Map<Integer, List<String>> listMap = new HashMap<>();
        for (String key : map.keySet()) {
            int sum = map.get(key);
            int result = 10;
            if(sum > 100){
                sum -= 100;
                result += (sum / 50) * 3;
                if(sum % 50 != 0){
                    result += 3;
                }
            }
            if(listMap.get(result) == null){
                List<String> list = new ArrayList<>();
                list.add(key);
                listMap.put(result, list);
            } else {
                listMap.get(result).add(key);
            }
        }
        for (int key : listMap.keySet()) {
            Collections.sort(listMap.get(key));
        }
        List<Integer> list = new ArrayList<>(listMap.keySet());
        Collections.sort(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            List<String> innerList = listMap.get(list.get(i));
            for (int j = 0; j < innerList.size(); j++) {
                bw.write(innerList.get(j) + " " + list.get(i) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
