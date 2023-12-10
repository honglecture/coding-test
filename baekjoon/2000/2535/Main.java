// https://www.acmicpc.net/problem/2535
// 아시아 정보올림피아드
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][3];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            array[i][0] = n1;
            array[i][1] = n2;
            array[i][2] = n3;
        }
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(count == 3){
                break;
            }
            int n = array[i][0];
            if(map.get(n) == null){
                map.put(n, 1);
                bw.write(array[i][0] + " " + array[i][1] + "\n");
                count++;
            } else {
                if(map.get(n) == 2){
                    continue;
                } else {
                    map.put(n, map.get(n) + 1);
                    bw.write(array[i][0] + " " + array[i][1] + "\n");
                    count++;
                }
            }
        }



        bw.flush();
        bw.close();
    }
}