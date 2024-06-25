// https://www.acmicpc.net/problem/13414
// 수강신청
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int keyNum = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        Set<String> set = new HashSet<>();
        int rank = 1;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            if(set.contains(str)){
                map1.remove(map2.get(str));
                map2.remove(str);
                map1.put(rank, str);
                map2.put(str, rank);
                rank++;
            } else {
                map1.put(rank, str);
                map2.put(str, rank);
                rank++;
                set.add(str);
            }
        }
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if(map1.get(i) != null){
                bw.write(map1.get(i) + "\n");
                count++;
                if(count == keyNum){
                   break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}