// https://www.acmicpc.net/problem/13913
// 숨바꼭질 4
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int size = 100001;
        if(n1 > n2){
            StringBuilder result = new StringBuilder("");
            for (int i = n1; i >= n2; i--) {
                result.append(i + " ");
            }
            System.out.println(result.toString().split(" ").length - 1);
            System.out.println(result.toString());
            return;
        }
        String[] visitArray = new String[size];
        Queue<Integer> queue = new ArrayDeque<>();
        visitArray[n1] = n1 + " ";
        queue.add(n1);
        while(queue.size() != 0){
            int n = queue.poll();
            if(n == n2){
                break;
            }
            int nextN1 = n - 1;
            int nextN2 = n + 1;
            int nextN3 = n * 2;
            if(nextN1 >= 0 && nextN1 < size){
                if(visitArray[nextN1] == null){
                    visitArray[nextN1] = visitArray[n] + nextN1 + " ";
                    queue.add(nextN1);
                }
            }
            if(nextN2 >= 0 && nextN2 < size){
                if(visitArray[nextN2] == null){
                    visitArray[nextN2] = visitArray[n] + nextN2 + " ";
                    queue.add(nextN2);
                }
            }
            if(nextN3 >= 0 && nextN3 < size){
                if(visitArray[nextN3] == null){
                    visitArray[nextN3] = visitArray[n] + nextN3 + " ";
                    queue.add(nextN3);
                }
            }
            visitArray[n] = "";
        }
        
        bw.write(visitArray[n2].split(" ").length - 1 + "\n");
        bw.write(visitArray[n2] + "\n");
        bw.flush();
        bw.close();
    }

}