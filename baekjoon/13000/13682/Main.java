// https://www.acmicpc.net/problem/13682
// Loop Musical
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            int answer = 2;
            boolean flag = true;
            if(array[0] > array[1]){
                flag = false;
            }
            for (int i = 2; i < array.length; i++) {
                int n1 = array[i - 1];
                int n2 = array[i];
                if(n1 > n2){
                    if(flag){
                        flag = false;
                        answer++;
                    }
                } else {
                    if(!flag){
                        flag = true;
                        answer++;
                    }
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

}