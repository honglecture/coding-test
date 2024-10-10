// https://www.acmicpc.net/problem/17265
// 나의 인생에는 수학과 함께
import java.io.*;

public class Main {

    private static int minAnswer = Integer.MAX_VALUE;
    private static int maxAnswer = Integer.MIN_VALUE;
    private static int[] array1 = {1, 0};
    private static int[] array2 = {0, 1};
    private static String[][] array;
    private static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(bf.readLine());
        array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        getAnswer(0, 0, 0, "", 1);
        System.out.println(maxAnswer + " " + minAnswer);
        bw.flush();
        bw.close();
    }
    
    private static void getAnswer(int y, int x, int sum, String s, int count){
        if(y == 0 && x == 0){
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                getAnswer(nextY, nextX, Integer.parseInt(array[0][0]), s, count + 1);
            }
            return;
        }
        if(count % 2 == 0){
            s = array[y][x];
        } else {
            int n = Integer.parseInt(array[y][x]);
            if(s.equals("+")){
                sum += n;
            } else if(s.equals("-")){
                sum -= n;
            } else if(s.equals("*")){
                sum *= n;
            }
        }
        if(y == size  - 1 && x == size - 1){
            minAnswer = Integer.min(minAnswer, sum);
            maxAnswer = Integer.max(maxAnswer, sum);
            return;
        }
        for (int i = 0; i < array1.length; i++) {
            int nextY = y + array1[i];
            int nextX = x + array2[i];
            if(nextY < 0 || nextX < 0 || nextY > size - 1 || nextX > size - 1){
                continue;
            }
            getAnswer(nextY, nextX, sum, s, count + 1);
        }
        
    }

}
