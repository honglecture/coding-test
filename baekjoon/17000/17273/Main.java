// https://www.acmicpc.net/problem/17273
// 카드 공장 (Small)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[][] array = new int[size1][2];
        int[] visitArray = new int[size1];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 0; i < size2; i++) {
            int k = Integer.parseInt(bf.readLine());
            for (int j = 0; j < array.length; j++) {
                int n = array[j][visitArray[j]];
                if(k >= n){
                    if(visitArray[j] == 0){
                        visitArray[j] = 1;
                    } else {
                        visitArray[j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            answer += array[i][visitArray[i]];
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}

