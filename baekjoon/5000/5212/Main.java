// https://www.acmicpc.net/problem/5212
// 지구 온난화
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        String[][] answerArray = new String[y][x];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String str = array[i][j];
                if(str.equals("X")){
                    int count = 0;
                    for (int k = 0; k < array1.length; k++) {
                        int nextY = i + array1[k];
                        int nextX = j + array2[k];
                        if(nextY < 0 || nextX < 0 || nextY > y - 1 || nextX > x - 1){
                            count++;
                            continue;
                        }
                        if(array[nextY][nextX].equals(".")){
                            count++;
                        }
                    }
                    if(count >= 3){
                        answerArray[i][j] = ".";
                    } else {
                        answerArray[i][j] = "X";
                    }
                } else {
                    answerArray[i][j] = ".";
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array[i].length; j++) {
                if(answerArray[i][j].equals("X")){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                answerArray[i][j] = "#";
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < array[i].length; j++) {
                if(answerArray[i][j].equals("X")){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for (int j = 0; j < array[i].length; j++) {
                answerArray[i][j] = "#";
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(answerArray[j][i].equals("X")){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for (int j = 0; j < array.length; j++) {
                answerArray[j][i] = "#";
            }
        }
        for (int i = array[0].length - 1; i >= 0; i--) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(answerArray[j][i].equals("X")){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            for (int j = 0; j < array.length; j++) {
                answerArray[j][i] = "#";
            }
        }
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = 0; j < array[i].length; j++) {
                if(!answerArray[i][j].equals("#")){
                    innerList.add(answerArray[i][j]);
                }
            }
            list.add(innerList);
        }
        for (int i = 0; i < list.size(); i++) {
            List<String> innerlist = list.get(i);
            if(innerlist.size() == 0){
                continue;
            }
            for (int j = 0; j < innerlist.size(); j++) {
                bw.write(innerlist.get(j) + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}