// https://www.acmicpc.net/problem/2578
// 빙고
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {

    private static boolean[][] visitArray = new boolean[5][5];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] array = new int[5][5];
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                array[i][j] = n;
                map.put(n, new int[]{i, j});
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            boolean flag = false;
            for (int j = 0; j < sArray.length; j++) {
                int n = Integer.parseInt(sArray[j]);
                int[] tempArray = map.get(n);
                visitArray[tempArray[0]][tempArray[1]] = true;
                count++;
                boolean result = getAnswer();
                if(result){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static boolean getAnswer(){
        int count = 0;
        for (int i = 0; i < visitArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < visitArray[i].length; j++) {
                if(!visitArray[i][j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        for (int i = 0; i < visitArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < visitArray[i].length; j++) {
                if(!visitArray[j][i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        boolean crossFlag = true;
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i][i]){
                crossFlag = false;
                break;
            }
        }
        if(crossFlag){
            count++;
        }
        crossFlag = true;
        for (int i = visitArray.length - 1; i >= 0; i--) {
            if(!visitArray[i][visitArray.length - 1 - i]){
                crossFlag = false;
                break;
            }
        }
        if(crossFlag){
            count++;
        }
        return count >= 3 ? true : false;
    }

}