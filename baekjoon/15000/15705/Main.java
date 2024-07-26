// https://www.acmicpc.net/problem/15705
// 단어 찾기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array1 = {-1, -1, -1, 0 ,1, 1, 1, 0};
        int[] array2 = {1, 0, -1, -1, -1, 0, 1, 1};

        String key = bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array1.length; k++) {
                    int startY = i;
                    int startX = j;
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        sb.append(array[startY][startX]);
                        startY += array1[k];
                        startX += array2[k];
                        if(startY < 0 || startX < 0 || startY > array.length - 1 || startX > array[0].length - 1){
                            break;
                        }
                    }
                    if(sb.toString().contains(key)){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(flag){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }
    
}