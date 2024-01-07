// https://www.acmicpc.net/problem/16165
// 걸그룹 마스터 준석이
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
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n1; i++) {
            String key = bf.readLine();
            int size = Integer.parseInt(bf.readLine());
            List<String> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(bf.readLine());
            }
            Collections.sort(list);
            map.put(key, list);
        }
        for (int i = 0; i < n2; i++) {
            String name = bf.readLine();
            int type = Integer.parseInt(bf.readLine());
            String answer = "";
            if(type == 1){
                for (String key : map.keySet()) {
                    List<String> list = map.get(key);
                    for (int j = 0; j < list.size(); j++) {
                        if(list.get(j).equals(name)){
                            answer = key;
                            break;
                        }
                    }
                    if(!answer.equals(answer)){
                        break;
                    }
                }
                bw.write(answer + "\n");
            } else {
                List<String> list = map.get(name);
                for (int j = 0; j < list.size(); j++) {
                    bw.write(list.get(j) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
