// https://www.acmicpc.net/problem/1766
// 문제집

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        StringBuilder sb = new StringBuilder("");
        Queue<int[]> queue1 = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        Queue<Integer> queue2 = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) o1 - (int) o2;
            }
        });
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        boolean[] visitArray = new boolean[n + 1];
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            visitArray[n1] = true;
            visitArray[n2] = true;
            queue1.add(new int[]{n1, n2});
        }
        for (int i = 1; i < visitArray.length; i++) {
            if(!visitArray[i]){
                queue2.add(i);
            }
        }
        while(queue1.size() != 0){
            int[] pollArray = queue1.peek();
            int n1 = pollArray[0];
            int n2 = pollArray[1];
            if(queue2.isEmpty()){
                if(!set.contains(n1)){
                    list.add(n1);
                    set.add(n1);
                }
                if(!set.contains(n2)){
                    queue2.add(n2);
                    set.add(n2);
                }
                queue1.poll();
            } else {
                if(n1 > queue2.peek()){
                    if(!set.contains(queue2.peek())){
                        set.add(queue2.peek());
                        list.add(queue2.poll());
                    } else {
                        queue2.poll();
                    }
                } else {
                    if(!set.contains(n1)){
                        list.add(n1);
                        set.add(n1);
                    }
                    if(!set.contains(n2)){
                        set.add(n2);
                        queue2.add(n2);
                    }
                    queue1.poll();
                }
            }
        }
        while(queue2.size() != 0){
            int num = queue2.poll();
            if(set.contains(num)){
                continue;
            }
            list.add(num);
            set.add(num);
        }
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
   
}



