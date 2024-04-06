// https://www.acmicpc.net/problem/27495
// 만다라트 만들기
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
        String[][] array = new String[9][9];
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {-1, 0, 1, 1, 1, 0, -1, -1};
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array1.length; i++) {
            int y = 4 + array1[i];
            int x = 4 + array2[i];
            map.put(array[y][x], new ArrayList<>());
        }
        for (String key : map.keySet()) {
            int y = 0;
            int x = 0;
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(i >= 3 && i <= 5){
                        if(j >= 3 && j<= 5){
                            continue;
                        }
                    }
                    if(array[i][j].equals(key)){
                        y = i;
                        x = j;
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            for (int i = 0; i < array1.length; i++) {
                int currentY = y + array1[i];
                int currentX = x + array2[i];
                map.get(key).add(array[currentY][currentX]);
            }
        }
        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for (int i = 0; i < keyList.size(); i++) {
            String key = keyList.get(i);
            int keyIndex = i + 1;
            List<String> list = map.get(key);
            bw.write("#"+keyIndex+". " + key + "\n");
            for (int j = 0; j < list.size(); j++) {
                int valueIndex = j + 1;
                String value = list.get(j);
                bw.write("#"+keyIndex+"-"+valueIndex+". " + value + "\n");
            }
        }
        bw.flush();
        bw.close();
    }


}
