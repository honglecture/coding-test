// https://www.acmicpc.net/problem/8979
// 올림픽
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]); // key 번째 국가
        int[][] array = new int[size][5];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
            array[i][2] = Integer.parseInt(sArray[2]);
            array[i][3] = Integer.parseInt(sArray[3]);
            array[i][4] = array[i][1] + array[i][2] + array[i][3];
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1] == o1[1]){
                    if(o2[2] == o1[2]){
                        if(o2[3] == o1[3]){
                            return o2[4] - o1[4];
                        } else {
                            return o2[3] - o1[3];
                        }
                    } else {
                        return o2[2] - o1[2];
                    }
                } else {
                    return o2[1] - o1[1];
                }
            }
        });
        int count = 1;
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String str = array[i][1] + " " + array[i][2] + " " + array[i][3];
            int n = array[i][0];
            if(map.get(str) == null){
                if(n == key){
                    answer = count + "";
                    break;
                }
                map.put(str, count);
                count++;
            } else {
                if(n == key){
                    answer = map.get(str) + "";
                }
                count++;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
   
}