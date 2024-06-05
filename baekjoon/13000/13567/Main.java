// https://www.acmicpc.net/problem/13567
// 로봇
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = {1, 0, -1, 0};
        int[] array2 = {0, 1, 0 ,-1};
        int currentIndex = 1;
        int keyNum = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int currentY = 0;
        int currentX = 0;
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            String type = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(type.equals("TURN")){
                if(n == 0){
                    currentIndex--;
                    if(currentIndex < 0){
                        currentIndex = 3;
                    }
                } else {
                    currentIndex++;
                    if(currentIndex > 3){
                        currentIndex = 0;
                    }
                }
            } else {
                currentY += (n * array1[currentIndex]);
                currentX += (n * array2[currentIndex]);
            }
            if(currentX < 0 || currentY < 0 || currentX > keyNum || currentY > keyNum){
                flag = false;
                break;
            }
        }
        if(flag){
            bw.write(currentX + " " + currentY + "\n");
        } else {
            bw.write("-1\n");
        }
        bw.flush();
        bw.close();
    }

}