// https://www.acmicpc.net/problem/9019
// DSLR
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
            String[] commandArray = new String[10000];
            boolean[] visitaArray = new boolean[10000];
            Queue<Integer> queue = new ArrayDeque<>();
            visitaArray[n1] = true;
            for (int j = 0; j < commandArray.length; j++) {
                commandArray[j] = "";
            }
            queue.add(n1);
            while(queue.size() != 0){
                int n = queue.poll();
                int d = (n * 2) % 10000;
                int s = n == 0 ? 9999 : n - 1;
                int l = (n % 1000) * 10 + n / 1000;
                int r = (n % 10) * 1000 + n / 10;
                if(n == n2){
                    break;
                }
                if(!visitaArray[d]){
                    visitaArray[d] = true;
                    commandArray[d] = commandArray[n] + "D";
                    queue.add(d);
                }
                if(!visitaArray[s]){
                    visitaArray[s] = true;
                    commandArray[s] = commandArray[n] + "S";
                    queue.add(s);
                }
                if(!visitaArray[l]){
                    visitaArray[l] = true;
                    commandArray[l] = commandArray[n] + "L";
                    queue.add(l);
                }
                if(!visitaArray[r]){
                    visitaArray[r] = true;
                    commandArray[r] = commandArray[n] + "R";
                    queue.add(r);
                }
            }
            bw.write(commandArray[n2] + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}