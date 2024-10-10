// https://www.acmicpc.net/problem/3077
// 임진왜란
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array1 = bf.readLine().split(" ");
        String[] array2 = bf.readLine().split(" ");
        int answer1 = 0;
        int answer2 = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            map.put(array1[i], i);
        }
        for (int i = 0; i < array2.length - 1; i++) {
            String s1 = array2[i];
            int n1 = map.get(s1);
            for (int j = i + 1; j < array2.length; j++) {
                String s2 = array2[j];
                int n2 = map.get(s2);
                if(n1 < n2){
                    answer1++;
                }
                answer2++;
            }
        }
        bw.write(answer1 + "/" + answer2 + "\n");
        bw.flush();
        bw.close();
    }
}