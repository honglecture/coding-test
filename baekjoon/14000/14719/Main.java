// https://www.acmicpc.net/problem/14719
// 빗물
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        boolean[][] array = new boolean[y][x];
        sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            for (int j = y - 1; j >= 0; j--) {
                if(n == 0){
                    break;
                }
                array[j][i] = true;
                n--;
            }
        }
        for (int i = y - 1; i >= 0; i--) {
            boolean flag = false;
            int count = 0;
            for (int j = 0; j < x; j++) {
                if(array[i][j]){
                    if(!flag){
                        flag = true;
                    } else {
                        answer += count;
                        count = 0;
                    }
                } else {
                    if(flag){
                        count++;
                    }
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
}