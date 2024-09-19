// https://www.acmicpc.net/problem/6191
// Cows on Skates
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        boolean[][] visitArray = new boolean[y][x];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, -1, 0, 1};
        String answer = "";
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        Queue<Object[]> queue = new ArrayDeque<>();
        queue.add(new Object[]{0, 0, ""});
        while (queue.size() != 0) {
            Object[] pollArray = queue.poll();
            int currentY = (int) pollArray[0];
            int currentX = (int) pollArray[1];
            String str = (String) pollArray[2];
            if(visitArray[currentY][currentX]){
                continue;
            }
            if(array[currentY][currentX].equals("*")){
                continue;
            }
            visitArray[currentY][currentX] = true;
            str += currentY + "" + currentX;
            if(currentY == y - 1 && currentX == x - 1){
                answer = str;
                break;
            }
            for (int i = 0; i < array1.length; i++) {
                int nextY = currentY + array1[i];
                int nextX = currentX + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                    continue;
                }
                queue.add(new Object[]{nextY, nextX, str});
            }
        }
        if(answer.equals("")){
            bw.write("" + "\n");
        } else {
            for (int i = 0; i < answer.length(); i += 2) {
                int n1 = Integer.parseInt(String.valueOf(answer.charAt(i))) + 1;
                int n2 = Integer.parseInt(String.valueOf(answer.charAt(i + 1))) + 1;
                bw.write(n1 + " " + n2 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
   
}