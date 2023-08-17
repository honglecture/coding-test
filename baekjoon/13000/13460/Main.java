// https://www.acmicpc.net/problem/13460
// 구슬 탈출 2
import java.io.*;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
public class Main {

    private static String[][] array;
    private static Set<String> visitSet;
    private static int[] ballArray;
    private static int[] goalArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new String[y][x];
        ballArray = new int[4];
        goalArray = new int[2];
        visitSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sArray[j];
                if(array[i][j].equals("R")){
                    ballArray[0] = i;
                    ballArray[1] = j;
                } else if(array[i][j].equals("B")){
                    ballArray[2] = i;
                    ballArray[3] = j;
                } else if(array[i][j].equals("O")){
                    goalArray[0] = i;
                    goalArray[1] = j;
                }
            }
        }
        int result = getAnswer();
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    private static int getAnswer(){
        int count = -1;
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{ballArray[0], ballArray[1], ballArray[2], ballArray[3], 0});
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentRedY = pollArray[0];
            int currentRedX = pollArray[1];
            int currentBlueY = pollArray[2];
            int currentBlueX = pollArray[3];
            int currentCount = pollArray[4];
            String visitStr = currentRedY + " " + currentRedX + " " + currentBlueY + " " + currentBlueX;
            if(visitSet.contains(visitStr)){
                continue;
            }
            if(currentCount > 10){
                continue;
            }
            if(goalArray[0] == currentBlueY && goalArray[1] == currentBlueX){
                continue;
            }
            if(goalArray[0] == currentRedY && goalArray[1] == currentRedX){
                count = currentCount;
                break;
            }
            visitSet.add(visitStr);
            for (int i = 0; i < array1.length; i++) {
                int nextRedY = currentRedY;
                int nextRedX = currentRedX;
                int nextBlueY = currentBlueY;
                int nextBlueX = currentBlueX;
                boolean flag = true;
                for (int j = 0; j < 2; j++) {
                    while(true){
                        if(array[nextRedY][nextRedX].equals("O")){
                            break;
                        }
                        int tempNextRedY = nextRedY + array1[i];
                        int tempNextRedX = nextRedX + array2[i];
                        if(tempNextRedY < 0 || tempNextRedX < 0 || tempNextRedY > array.length - 1 || tempNextRedX > array[0].length - 1){
                            break;
                        }
                        if(array[tempNextRedY][tempNextRedX].equals("#")){
                            break;
                        }
                        if(array[tempNextRedY][tempNextRedX].equals("O")){
                            nextRedY = tempNextRedY;
                            nextRedX = tempNextRedX;
                            break;
                        }
                        if(tempNextRedY == nextBlueY && tempNextRedX == nextBlueX){
                            break;
                        }
                        nextRedY = tempNextRedY;
                        nextRedX = tempNextRedX;
                    }
                    while(true){
                        if(array[nextBlueY][nextBlueX].equals("O")){
                            break;
                        }
                        int tempNextBlueY = nextBlueY + array1[i];
                        int tempNextBlueX = nextBlueX + array2[i];
                        if(tempNextBlueY < 0 || tempNextBlueX < 0 || tempNextBlueY > array.length - 1 || tempNextBlueX > array[0].length - 1){
                            break;
                        }
                        if(array[tempNextBlueY][tempNextBlueX].equals("#")){
                            break;
                        }
                        if(array[tempNextBlueY][tempNextBlueX].equals("O")){
                            flag = false;
                            nextBlueY = tempNextBlueY;
                            nextBlueX = tempNextBlueX;
                            break;
                        }
                        if(nextRedY == tempNextBlueY && nextRedX == tempNextBlueX){
                            break;
                        }
                        nextBlueY = tempNextBlueY;
                        nextBlueX = tempNextBlueX;
                    }
                    if(!flag){
                        break;
                    }
                }
                if(nextBlueY == nextRedY && nextRedX == nextBlueX){
                    flag = false;
                }
                if(flag){
                    queue.add(new int[]{nextRedY, nextRedX, nextBlueY, nextBlueX, currentCount + 1});
                }
            }
        }
        return count;
    }

}