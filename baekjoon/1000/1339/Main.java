// https://www.acmicpc.net/problem/1339
// 단어 수학
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        int[][] sArray = new int[26][3];
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            int legnth = s.length();
            for (int j = 0; j < s.length(); j++) {
                String c = String.valueOf(s.charAt(j));
                int index = (int) s.charAt(j) - 65;
                sArray[index][0]++;
                sArray[index][1] = Integer.max(sArray[index][1], legnth);
                sArray[index][2] = index;
                legnth--;
            }
        }
        int num = 9;
        Queue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o2[0] - o1[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });
        for (int i = 0; i < sArray.length; i++) {
            queue.add(sArray[i]);
        }
        int[] numArray = new int[26];
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            if(pollArray[0] == 0){
                break;
            }
            numArray[pollArray[2]] = num;
            num--;
        }
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            String result = "";
            String s = array[i];
            for (int j = 0; j < s.length(); j++) {
                int index = s.charAt(j) - 65;
                result += numArray[index];
            }
            sum += Integer.parseInt(result);
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();

    }
}