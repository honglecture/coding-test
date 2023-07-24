// https://www.acmicpc.net/problem/15686
// 치킨 배달
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    private static int answer = Integer.MAX_VALUE;

    private static List<int[]> homeList;

    private static List<int[]> storeList;

    private static boolean[] openArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int n = Integer.parseInt(sArray[1]);
        homeList = new ArrayList<>();
        storeList = new ArrayList<>();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == 1){
                    homeList.add(new int[]{i, j});
                } else if(array[i][j] == 2){
                    storeList.add(new int[]{i, j});
                }
            }
        }
        openArray = new boolean[storeList.size()];
        getAnswer(0, n, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int n, int count){
        if(count == n){
            int result = 0;
            for (int i = 0; i < homeList.size(); i++) {
                int min = Integer.MAX_VALUE;
                int homeY = homeList.get(i)[0];
                int homeX = homeList.get(i)[1];
                for (int j = 0; j < openArray.length; j++) {
                    if(openArray[j]){
                        int storeY = storeList.get(j)[0];
                        int storeX = storeList.get(j)[1];
                        int score = Math.abs(homeY - storeY) + Math.abs(homeX - storeX);
                        min = Integer.min(min, score);
                    }
                }
                result += min;
            }
            if(result < answer){
                answer = result;
            }
            return;
        }
        for (int i = index; i < openArray.length; i++) {
            openArray[i] = true;
            getAnswer(i + 1, n, count + 1);
            openArray[i] = false;
        }
    }
    
}