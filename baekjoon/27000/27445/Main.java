// https://www.acmicpc.net/problem/27445
// Gorani Command
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[] array1 = new int[y - 1];
        int[] array2 = new int[x];
        int answerY = -1;
        int answerX = -1;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(bf.readLine());
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                boolean flag = true;
                for (int k = 0; k < array1.length; k++) {
                    int n = array1[k];
                    int result = Math.abs(k - i) + Math.abs(0 - j);
                    if(n != result){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    continue;
                }
                for (int k = 0; k < array2.length; k++) {
                    int n = array2[k];
                    int result = Math.abs(y - 1 - i) + Math.abs(k - j);
                    if(n != result){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    continue;
                } else {
                    answerY = i + 1;
                    answerX = j + 1;
                    break;
                }
            }
            if(answerY != -1){
                break;
            }
        }
        bw.write(answerY + " " + answerX + "\n");
        bw.flush();
        bw.close();
    }

    

}
