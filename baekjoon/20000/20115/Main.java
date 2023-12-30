// https://www.acmicpc.net/problem/20115
// 에너지 드링크
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < sArray.length; i++) {
            queue.add(Double.parseDouble(sArray[i]));
        }
        while (true) {
            if(queue.size() == 1){
                break;
            }
            double n1 = queue.poll();
            double n2 = queue.poll() / 2;
            queue.add(n1 + n2);
        }
        double result = queue.poll();
        if(String.valueOf(result).split("\\.")[1].equals("0")){
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
        bw.flush();
        bw.close();
    }

}
