// https://www.acmicpc.net/problem/19236
// 청소년 상어
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[] array1 = {0, -1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] array2 = {0, 0, -1, -1, -1, 0, 1, 1, 1};
    private static int[][][] array;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        array = new int[4][4][2];
        for (int i = 0; i < 4; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j+=2) {
                int n1 = Integer.parseInt(sArray[j]);
                int n2 = Integer.parseInt(sArray[j + 1]);
                array[i][j / 2][0] = n1;
                array[i][j / 2][1] = n2;
            }
        }
        int sum = array[0][0][0];
        array[0][0][0] = 17;
        getAnswer(sum, 0, 0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int sum, int y, int x){
        if(!checkAnswer()){
            if(answer < sum){
                answer = sum;
            }
            return;
        }
        // 물고기 이동
        moveFish();
        // 상어 이동
        int[][][] copyArray = copyArray();
        int backupY = y;
        int backupX = x;
        int d = array[backupY][backupX][1];
        while (true) {
            y = y + array1[d];
            x = x + array2[d];
            if(y < 0 || x < 0 || y > 3 || x > 3){
                break;
            }
            if(array[y][x][0] == 0){
                continue;
            }
            array[backupY][backupX][0] = 0;
            array[backupY][backupX][1] = 0;
            int nextSum = array[y][x][0] + sum;
            array[y][x][0] = 17;
            getAnswer(nextSum, y, x);
            array = copyArray;
        }
    }
    private static void moveFish(){
        // 0, 0 은 비어있다.
        int start = 1;
        while (true) {
            if(start == 17){
                break;
            }
            boolean flag = false;;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(array[i][j][0] == start){
                        int d = array[i][j][1];
                        int nextY = 0;
                        int nextX = 0;
                        flag = true;
                        Set<Integer> set = new HashSet<>();
                        while (true) {
                            if(set.contains(d)){
                                break;
                            }
                            set.add(d);
                            nextY = i + array1[d];
                            nextX = j + array2[d];
                            if(nextY < 0 || nextY > 3 || nextX < 0 || nextX > 3){
                                d += 1;
                                if(d == 9){
                                    d = 1;
                                }
                                array[i][j][1] = d;
                                continue;
                            }
                            if(array[nextY][nextX][0] == 17){
                                d += 1;
                                if(d == 9){
                                    d = 1;
                                }
                                array[i][j][1] = d;
                                continue;
                            }
                            array[i][j][1] = d;
                            break;
                        }
                        if(set.size() == 8){
                            break;
                        }
                        if(array[nextY][nextX][0] == 0){
                            array[nextY][nextX][0] = array[i][j][0];
                            array[nextY][nextX][1] = array[i][j][1];
                            array[i][j][0] = 0;
                            array[i][j][1] = 0;
                        } else {
                            int temp1 = array[nextY][nextX][0];
                            int temp2 = array[nextY][nextX][1];
                            array[nextY][nextX][0] = array[i][j][0];
                            array[nextY][nextX][1] = array[i][j][1];
                            array[i][j][0] = temp1;
                            array[i][j][1] = temp2;
                        }
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            start++;
        }
    }

    private static boolean checkAnswer(){
        boolean flag = false;
        int y = 0;
        int x = 0;
        int d = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j][0] == 17){
                    y = i;
                    x = j;
                    d = array[i][j][1];
                    break;
                }
            }
            if(d != 0){
                break;
            }
        }
        while (true) {
            y = y + array1[d];
            x = x + array2[d];
            if(y < 0 || y > 3 || x < 0 || x > 3){
                break;
            }
            if(array[y][x][0] != 0){
                flag = true;
                break;
            }
        }
        return flag;
    }


    private static int[][][] copyArray(){
        int[][][] copyArray = new int[4][4][2];
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[i].length; j++) {
                copyArray[i][j][0] = array[i][j][0];
                copyArray[i][j][1] = array[i][j][1];
            }
        }
        return copyArray;
    }
}