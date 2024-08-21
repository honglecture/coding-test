// https://www.acmicpc.net/problem/14544
// Vote
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size1 = Integer.parseInt(sArray[0]);
            int size2 = Integer.parseInt(sArray[1]);
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < size1; j++) {
                map.put(bf.readLine(), 0);
            }
            for (int j = 0; j < size2; j++) {
                sArray = bf.readLine().split(" ");
                String str = sArray[0];
                int n = Integer.parseInt(sArray[1]);
                map.put(str, map.get(str) + n);
            }
            List<String> list = new ArrayList<>();
            int max = 0;
            for (String str : map.keySet()) {
                if(max < map.get(str)){
                    list.clear();
                    max = map.get(str);
                    list.add(str);
                } else if(max == map.get(str)){
                    list.add(str);
                }
            }
            if(list.size() == 1){
                bw.write("VOTE "+(i + 1)+": THE WINNER IS "+list.get(0)+" " + max + "\n");
            } else {
                bw.write("VOTE "+(i + 1)+": THERE IS A DILEMMA\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}

