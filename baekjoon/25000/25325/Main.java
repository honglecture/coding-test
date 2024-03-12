// https://www.acmicpc.net/problem/25325
// 학생 인기도 측정
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
        String[] sArray = bf.readLine().split(" ");
        Map<String, Integer> map = new HashMap<>();
        String[][] answerArray = new String[size][2];
        int index = 0;
        for (int i = 0; i < sArray.length; i++) {
            String name = sArray[i];
            map.put(name, 0);
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                String name = sArray[j];
                map.put(name, map.get(name) + 1);
            }
        }
        for (String key : map.keySet()) {
            answerArray[index][0] = key;
            answerArray[index][1] = map.get(key) + "";
            index++;
        }
        Arrays.sort(answerArray, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                int n1 = Integer.parseInt(s1[1]);
                int n2 = Integer.parseInt(s2[1]);
                if(n1 == n2){
                    return s1[0].compareTo(s2[0]);
                } else {
                    return n2 - n1;
                }
            }
        });
        for (int i = 0; i < answerArray.length; i++) {
            bw.write(answerArray[i][0] + " " + answerArray[i][1] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
