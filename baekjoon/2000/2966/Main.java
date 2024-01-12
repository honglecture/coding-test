// https://www.acmicpc.net/problem/2966
// 캥거루 세마리
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
        String str = bf.readLine();
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        String[] array1 = {"A", "B", "C"};
        String[] array2 = {"B", "A", "B", "C"};
        String[] array3 = {"C", "C", "A", "A", "B", "B"};
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals(array1[i % (array1.length)])){
                n1++;
            }
            if(s.equals(array2[i % (array2.length)])){
                n2++;
            }
            if(s.equals(array3[i % (array3.length)])){
                n3++;
            }
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("Adrian", n1);
        map.put("Bruno", n2);
        map.put("Goran", n3);
        int maxNum = 0;
        List<String> list = new ArrayList<>();
        for (String name : map.keySet()) {
            if(map.get(name) > maxNum){
                list.clear();
                list.add(name);
                maxNum = map.get(name);
            } else if(map.get(name) == maxNum){
                list.add(name);
            }
        }
        Collections.sort(list);
        System.out.println(maxNum);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        bw.flush();
        bw.close();
    }
}