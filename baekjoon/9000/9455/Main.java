// https://www.acmicpc.net/problem/9455
// 박스
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            int[][] array = new int[y][x];
            for (int j = 0; j < array.length; j++) {
                sArray = bf.readLine().split(" ");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = Integer.parseInt(sArray[k]);
                }
            }
            int result = getAnswer(array);
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[][] array){
        int result = 0;
        for (int i = 0; i < array[0].length; i++) {
            Deque<Integer> queue = new ArrayDeque<>();
            for (int j = 0; j < array.length; j++) {
                int n = array[j][i];
                queue.addFirst(n);
            }
            int answer = 0;
            int count = 0;
            while (queue.size() != 0) {
                int n = queue.poll();
                if(n == 0){
                    count++;
                } else {
                    answer += count;
                }
            }
            result += answer;
        }
        return result;
    }
    
}