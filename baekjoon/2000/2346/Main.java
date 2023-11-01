// https://www.acmicpc.net/problem/2346
// 풍선 터뜨리기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < array.length; i++) {
            deque.add(new int[]{array[i], i + 1, 0});
        }
        List<Integer> list = new ArrayList<>();
        while(true){
            int[] pollArray = deque.poll();
            int n = pollArray[0];
            int index = pollArray[1];
            list.add(index);
            if(list.size() == array.length){
                break;
            }
            deque.addFirst(new int[]{n, index, 1});
            int count = n;
            if(n > 0){
                while(true){
                    if(count == 0){
                        break;
                    }
                    int[] tempArray = deque.pollFirst();
                    deque.add(tempArray);
                    if(deque.peek()[2] == 0){
                        count--;
                    }
                }
            } else {
                while(true){
                    if(count == 0){
                        break;
                    }
                    int[] tempArray = deque.pollLast();
                    deque.addFirst(tempArray);
                    if(deque.peek()[2] == 0){
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(list.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
    
}


