// https://www.acmicpc.net/problem/1236
// 성 지키기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            int checkY = -1;
            int checkX = -1;
            boolean flag = false;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals("X")){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            
            for (int j = 0; j < array[i].length; j++) {
                boolean checkFlag = false;
                for (int k = i; k < array.length; k++) {
                    if(array[k][j].equals("X")){
                        checkFlag = true;
                        break;
                    }
                }
                if(!checkFlag){
                    checkY = i;
                    checkX = j;
                    break;
                }
            }
            if(checkY == -1){
                array[i][0] = "X";
            } else {
                array[checkY][checkX] = "X";
            }
            
            answer += 1;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}
