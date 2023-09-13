// https://www.acmicpc.net/problem/12852
// 1로 만들기 2
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] visitArray = new String[n + 1];
        visitArray[n] = n + " ";
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(n);
        while(queue.size() != 0){
            int currentN = queue.poll();
            if(currentN == 1){
                break;
            }
            if(currentN % 3 == 0){
                int nextN = currentN / 3;
                if(visitArray[nextN] == null){
                    visitArray[nextN] = visitArray[currentN] + nextN + " ";
                    queue.add(nextN);
                }
            }
            if(currentN % 2 == 0){
                int nextN = currentN / 2;
                if(visitArray[nextN] == null){
                    visitArray[nextN] = visitArray[currentN] + nextN + " ";
                    queue.add(nextN);
                }
            }
            if(currentN - 1 > 0){
                int nextN = currentN - 1;
                if(visitArray[nextN] == null){
                    visitArray[nextN] = visitArray[currentN] + nextN +" ";
                    queue.add(nextN);
                }
            }
            visitArray[currentN] = "";
        }
        bw.write(visitArray[1].split(" ").length - 1 + "\n");
        bw.write(visitArray[1] + "\n");
        bw.flush();
        bw.close();
    }
}
