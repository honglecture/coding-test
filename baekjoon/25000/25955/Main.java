// https://www.acmicpc.net/problem/25955
// APC는 쉬운 난이도 순일까, 아닐까?
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> typeMap = new HashMap<>();
        typeMap.put("B", 1);
        typeMap.put("S", 2);
        typeMap.put("G",3);
        typeMap.put("P", 4);
        typeMap.put("D", 5);
        int size = Integer.parseInt(bf.readLine());
        String[] array = bf.readLine().split(" ");
        String[] copyArray = array.clone();
        List<String> list = new ArrayList<>();
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String type1 = String.valueOf(o1.charAt(0));
                String type2 = String.valueOf(o2.charAt(0));
                int num1 = Integer.parseInt(String.valueOf(o1.substring(1)));
                int num2 = Integer.parseInt(String.valueOf(o2.substring(1)));
                if(type1.equals(type2)){
                    if(num1 > num2){
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    int typeIndex1 = typeMap.get(type1);
                    int typeIndex2 = typeMap.get(type2);
                    return typeIndex1 - typeIndex2;
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(copyArray[i])){
                list.add(array[i]);
            }
        }
        if(list.size() == 0){
            bw.write("OK\n");
        } else {
            bw.write("KO\n");
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String type1 = String.valueOf(o1.charAt(0));
                    String type2 = String.valueOf(o2.charAt(0));
                    int num1 = Integer.parseInt(String.valueOf(o1.substring(1)));
                    int num2 = Integer.parseInt(String.valueOf(o2.substring(1)));
                    if(type1.equals(type2)){
                        if(num1 > num2){
                            return -1;
                        } else {
                            return 1;
                        }
                    } else {
                        int typeIndex1 = typeMap.get(type1);
                        int typeIndex2 = typeMap.get(type2);
                        return typeIndex1 - typeIndex2;
                    }
                }
            });
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i) + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
