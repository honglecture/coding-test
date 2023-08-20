// https://www.acmicpc.net/problem/14891
// 톱니바퀴
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    private static int[][] array;
    private static int[] dArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        array = new int[4][8];
        dArray = new int[4];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            getAnswer(n1, n2);
        }
        // N극은 0, S극은 1
        // 방향이 1인 경우는 시계 방향이고, -1인 경우는 반시계 방향
        int answer = 0;
        if(array[0][dArray[0]] == 1){
            answer += 1;
        }
        if(array[1][dArray[1]] == 1){
            answer += 2;
        }
        if(array[2][dArray[2]] == 1){
            answer += 4;
        }
        if(array[3][dArray[3]] == 1){
            answer += 8;    
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    private static void getAnswer(int n1, int n2){
        int[] nextDArray = dArray.clone();
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{n1, n2});
        boolean[] visit = new boolean[4];
        while(queue.size() != 0){
            int[] pollArray = queue.poll();
            int currentN = pollArray[0];
            int currentD = pollArray[1];
            if(visit[currentN - 1]){
                continue;
            }
            visit[currentN - 1] = true;
            if(currentD == -1){
                nextDArray[currentN - 1] = getLeftOne(currentN);
            } else {
                nextDArray[currentN - 1] = getRightOne(currentN);
            }
            if(currentN == 1){
                if(visit[1]){
                    continue;
                }
                int right = array[0][getRight(1)];
                int left = array[1][getLeft(2)];
                if(right != left){
                    if(currentD == -1){
                        queue.add(new int[]{2, 1});
                    } else {
                        queue.add(new int[]{2, -1});
                    }
                }
            } else if(currentN == 4){
                if(visit[2]){
                    continue;
                }
                int right = array[2][getRight(3)];
                int left = array[3][getLeft(4)];
                if(right != left){
                    if(currentD == -1){
                        queue.add(new int[]{3, 1});
                    } else {
                        queue.add(new int[]{3, -1});
                    }
                }
            } else if(currentN == 2){
                if(!visit[0]){
                    int right = array[0][getRight(1)];
                    int left = array[1][getLeft(2)];
                    if(right != left){
                        if(currentD == -1){
                            queue.add(new int[]{1, 1});
                        } else {
                            queue.add(new int[]{1, -1});
                        }
                    }
                }
                if(!visit[2]){
                    int right = array[1][getRight(2)];
                    int left = array[2][getLeft(3)];
                    if(right != left){
                        if(currentD == -1){
                            queue.add(new int[]{3, 1});
                        } else {
                            queue.add(new int[]{3, -1});
                        }
                    }
                }
            } else if(currentN == 3){
                if(!visit[1]){
                    int right = array[1][getRight(2)];
                    int left = array[2][getLeft(3)];
                    if(right != left){
                        if(currentD == -1){
                            queue.add(new int[]{2, 1});
                        } else {
                            queue.add(new int[]{2, -1});
                        }
                    }
                }
                if(!visit[3]){
                    int right = array[2][getRight(3)];
                    int left = array[3][getLeft(4)];
                    if(right != left){
                        if(currentD == -1){
                            queue.add(new int[]{4, 1});
                        } else {
                            queue.add(new int[]{4, -1});
                        }
                    }
                }
            }
        }
        for (int i = 0; i < nextDArray.length; i++) {
            dArray[i] = nextDArray[i];
        }
    }

    private static int getLeft(int type){
        int currentDIndex = dArray[type - 1];
        currentDIndex -= 2;
        if(currentDIndex < 0){
            currentDIndex = 8 + currentDIndex;
        }
        return currentDIndex;
    }

    private static int getRight(int type){
        int currentDIndex = dArray[type - 1];
        currentDIndex += 2;
        if(currentDIndex > 7){
            currentDIndex = currentDIndex - 8;
        }
        return currentDIndex;
    }

    private static int getRightOne(int type){
        int currentDIndex = dArray[type - 1];
        currentDIndex -= 1;
        if(currentDIndex < 0){
            currentDIndex = 8 + currentDIndex;
        }
        return currentDIndex;
    }

    private static int getLeftOne(int type){
        int currentDIndex = dArray[type - 1];
        currentDIndex += 1;
        if(currentDIndex > 7){
            currentDIndex = currentDIndex - 8;
        }
        return currentDIndex;
    }

    
}