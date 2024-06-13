// https://www.acmicpc.net/problem/31562
// 전주 듣고 노래 맞히기
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < size1; i++) {
            sArray = bf.readLine().split(" ");
            String key = sArray[2] + sArray[3] + sArray[4];
            String value = sArray[1];
            if(map.get(key) == null){
                List<String> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            } else {
                map.get(key).add(value);
            }
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            String key = sArray[0] + sArray[1] + sArray[2];
            if(map.get(key) == null){
                bw.write("!\n");
            } else {
                if(map.get(key).size() == 1){
                    bw.write(map.get(key).get(0) + "\n");
                } else {
                    bw.write("?\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    

}
