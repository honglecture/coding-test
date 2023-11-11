// https://www.acmicpc.net/problem/11559
// Puyo Puyo
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
public class Main {

    private static String[][] array;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        array = new String[12][6];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        getAnswer();
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(){
        while (true) {
            if(!checkAnswer()){
                return;
            }
            
            answer++;
            for (int i = 0; i < array[0].length; i++) {
                Queue<String> queue = new ArrayDeque<>();
                for (int j = array.length - 1; j >= 0; j--) {
                    if(!array[j][i].equals(".")){
                        queue.add(array[j][i]);
                    }
                    array[j][i] = ".";
                }
                int y = array.length - 1;
                int x = i;
                while (queue.size() != 0) {
                    array[y][x] = queue.poll();
                    y--;
                }
            }

        }
    }

    private static boolean checkAnswer(){
        boolean flag = false;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        boolean[][] visitArray = new boolean[12][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!visitArray[i][j] && !array[i][j].equals(".")){
                    Queue<int[]> queue = new ArrayDeque<>();
                    String type = array[i][j];
                    queue.add(new int[]{i, j});
                    List<int[]> list = new ArrayList<>();
                    while (queue.size() != 0) {
                        int[] pollArray = queue.poll();
                        int y = pollArray[0];
                        int x = pollArray[1];
                        if(visitArray[y][x]){
                            continue;
                        }
                        if(!array[y][x].equals(type)){
                            continue;
                        }
                        list.add(new int[]{y, x});
                        visitArray[y][x] = true;
                        for (int k = 0; k < array1.length; k++) {
                            int nextY = y + array1[k];
                            int nextX = x + array2[k];
                            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                                continue;
                            }
                            queue.add(new int[]{nextY, nextX});
                        }
                    }
                    if(list.size() >= 4){
                        for (int k = 0; k < list.size(); k++) {
                            array[list.get(k)[0]][list.get(k)[1]] = ".";
                        }
                        flag = true;
                    }
                    
                }
            }
        }
        return flag;
    }
}

