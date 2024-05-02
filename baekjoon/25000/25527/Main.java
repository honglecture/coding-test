// https://www.acmicpc.net/problem/25527
// Counting Peaks of Infection
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean flag = true;
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){break;}
            int answer = 0;
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int i = 0; i < sArray.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            for (int i = 1; i < array.length; i++) {
                int n = array[i];
                int beforeNum = array[i - 1];
                if(beforeNum > n){
                    if(flag){
                        answer++;
                        flag = false;
                    }
                } else {
                    flag = true;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}
