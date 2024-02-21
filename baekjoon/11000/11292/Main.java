// https://www.acmicpc.net/problem/11292
// 키 큰 사람
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            double maxNum = 0;
            List<String> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                String[] sArray = bf.readLine().split(" ");
                String name = sArray[0];
                double num = Double.parseDouble(sArray[1]);
                if(maxNum < num){
                    list.clear();
                    list.add(name);
                    maxNum = num;
                } else if(maxNum == num){
                    list.add(name);
                }
            }
            String answer = "";
            for (int i = 0; i < list.size(); i++) {
                answer += list.get(i) + " ";
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}