// https://www.acmicpc.net/problem/14562
// 태권왕
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int result = getAnswer(n1, n2);
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n1, int n2){
        int result = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{n1, n2, 0});
        while (queue.size() != 0) {
            int[] pollArray = queue.poll();
            int currentNum = pollArray[0];
            int keyNum = pollArray[1];
            int count = pollArray[2];
            if(currentNum > keyNum){
                continue;
            }
            if(currentNum == keyNum){
                result = count;
                break;
            }
            queue.add(new int[]{currentNum + 1, keyNum, count + 1});
            queue.add(new int[]{currentNum * 2, keyNum + 3, count + 1});
        }

        return result;
    }

    
}

