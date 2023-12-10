// https://www.acmicpc.net/problem/20291
// 파일 정리
import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
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
            String str = bf.readLine().split("\\.")[1];
            if(map.get(str) == null){
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        List<String> keylist = new ArrayList<>(map.keySet());
        Collections.sort(keylist);
        for (int i = 0; i < keylist.size(); i++) {
            bw.write(keylist.get(i) + " " + map.get(keylist.get(i)) + "\n");
        }
        bw.flush();
        bw.close();
    }

}
