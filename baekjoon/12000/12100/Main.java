// https://www.acmicpc.net/problem/12100
// 2048 (Easy)
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {
    
    private static int[][] array;
    private static int answer = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        getAnswer(0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void test(int type){
        int[][] copyArray = getCopyArray(array);
        int[][] nextArray = new int[array.length][array.length];
        if(type == 0){
            for (int j = 0; j < array.length; j++) {
                Queue<Integer> queue = new ArrayDeque<>();
                for (int k = 0; k < array.length; k++) {
                    if(array[k][j] != 0){
                        queue.add(array[k][j]);
                    }
                }
                int index = 0;
                if(queue.size() == 0){
                    continue;
                }
                int currentN = queue.poll();
                if(queue.size() == 0){
                    nextArray[index][j] = currentN;
                    continue;
                }
                while(queue.size() != 0){
                    int nextN = queue.poll();
                    if(currentN == nextN){
                        nextArray[index++][j] = currentN + currentN;
                        currentN = 0;
                    } else {
                        if(currentN == 0){
                            currentN = nextN;
                        } else {
                            nextArray[index++][j] = currentN;
                            currentN = nextN;
                        }
                    }
                }
                if(currentN != 0){
                    System.out.println(index);
                    nextArray[index][j] = currentN;
                }
            }
        } else if(type == 1){
            for (int j = 0; j < array.length; j++) {
                Queue<Integer> queue = new ArrayDeque<>();
                for (int k = array.length - 1; k >= 0; k--) {
                    if(array[j][k] != 0){
                        queue.add(array[j][k]);
                    }
                }
                int index = array.length - 1;
                if(queue.size() == 0){
                    continue;
                }
                int currentN = queue.poll();
                if(queue.size() == 0){
                    nextArray[j][index] = currentN;
                    continue;
                }
                while(queue.size() != 0){
                    int nextN = queue.poll();
                    if(currentN == nextN){
                        nextArray[j][index--] = currentN + currentN;
                        currentN = 0;
                    } else {
                        if(currentN == 0){
                            currentN = nextN;
                        } else {
                            nextArray[j][index--] = currentN;
                            currentN = nextN;
                        }
                    }
                }
                if(currentN != 0){
                    nextArray[j][index] = currentN;
                }
            }
        } else if(type == 2){
            for (int j = 0; j < array.length; j++) {
                Queue<Integer> queue = new ArrayDeque<>();
                for (int k = array.length - 1; k >= 0; k--) {
                    if(array[k][j] != 0){
                        queue.add(array[k][j]);
                    }
                }
                int index = array.length - 1;
                if(queue.size() == 0){
                    continue;
                }
                int currentN = queue.poll();
                if(queue.size() == 0){
                    nextArray[index][j] = currentN;
                    continue;
                }
                while(queue.size() != 0){
                    int nextN = queue.poll();
                    if(currentN == nextN){
                        nextArray[index--][j] = currentN + currentN;
                        currentN = 0;
                    } else {
                        nextArray[index--][j] = currentN;
                        currentN = nextN;
                    }
                }
                if(currentN != 0){
                    nextArray[index][j] = currentN;
                }
            }
        } else {
            for (int j = 0; j < array.length; j++) {
                Queue<Integer> queue = new ArrayDeque<>();
                for (int k = 0; k < array.length; k++) {
                    if(array[j][k] != 0){
                        queue.add(array[j][k]);
                    }
                }
                int index = 0;;
                if(queue.size() == 0){
                    continue;
                }
                int currentN = queue.poll();
                if(queue.size() == 0){
                    nextArray[j][index] = currentN;
                    continue;
                }
                while(queue.size() != 0){
                    int nextN = queue.poll();
                    if(currentN == nextN){
                        nextArray[j][index++] = currentN + currentN;
                        currentN = 0;
                    } else {
                        nextArray[j][index++] = currentN;
                        currentN = nextN;
                    }
                }
                if(currentN != 0){
                    nextArray[j][index] = currentN;
                }
            }
        }
        for (int i = 0; i < nextArray.length; i++) {
            for (int j = 0; j < nextArray.length; j++) {
                System.out.print(nextArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void getAnswer(int count){
        if(count == 5){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(array[i][j] > answer){
                        answer = array[i][j];
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        int[][] copyArray = getCopyArray(array);
        for (int i = 0; i < 4; i++) {
            int[][] nextArray = new int[array.length][array.length];
            if(i == 0){
                for (int j = 0; j < array.length; j++) {
                    Queue<Integer> queue = new ArrayDeque<>();
                    for (int k = 0; k < array.length; k++) {
                        if(array[k][j] != 0){
                            queue.add(array[k][j]);
                        }
                    }
                    int index = 0;
                    if(queue.size() == 0){
                        continue;
                    }
                    int currentN = queue.poll();
                    if(queue.size() == 0){
                        nextArray[index][j] = currentN;
                        continue;
                    }
                    while(queue.size() != 0){
                        int nextN = queue.poll();
                        if(currentN == nextN){
                            nextArray[index++][j] = currentN + currentN;
                            currentN = 0;
                        } else {
                            if(currentN == 0){
                                currentN = nextN;
                            } else {
                                nextArray[index++][j] = currentN;
                                currentN = nextN;
                            }
                        }
                    }
                    if(currentN != 0){
                        nextArray[index][j] = currentN;
                    }
                }
            } else if(i == 1){
                for (int j = 0; j < array.length; j++) {
                    Queue<Integer> queue = new ArrayDeque<>();
                    for (int k = array.length - 1; k >= 0; k--) {
                        if(array[j][k] != 0){
                            queue.add(array[j][k]);
                        }
                    }
                    int index = array.length - 1;
                    if(queue.size() == 0){
                        continue;
                    }
                    int currentN = queue.poll();
                    if(queue.size() == 0){
                        nextArray[j][index] = currentN;
                        continue;
                    }
                    while(queue.size() != 0){
                        int nextN = queue.poll();
                        if(currentN == nextN){
                            nextArray[j][index--] = currentN + currentN;
                            currentN = 0;
                        } else {
                            if(currentN == 0){
                                currentN = nextN;
                            } else {
                                nextArray[j][index--] = currentN;
                                currentN = nextN;
                            }
                        }
                    }
                    if(currentN != 0){
                        nextArray[j][index] = currentN;
                    }
                }
            } else if(i == 2){
                for (int j = 0; j < array.length; j++) {
                    Queue<Integer> queue = new ArrayDeque<>();
                    for (int k = array.length - 1; k >= 0; k--) {
                        if(array[k][j] != 0){
                            queue.add(array[k][j]);
                        }
                    }
                    int index = array.length - 1;
                    if(queue.size() == 0){
                        continue;
                    }
                    int currentN = queue.poll();
                    if(queue.size() == 0){
                        nextArray[index][j] = currentN;
                        continue;
                    }
                    while(queue.size() != 0){
                        int nextN = queue.poll();
                        if(currentN == nextN){
                            nextArray[index--][j] = currentN + currentN;
                            currentN = 0;
                        } else {
                            if(currentN == 0){
                                currentN = nextN;
                            } else {
                                nextArray[index--][j] = currentN;
                                currentN = nextN;
                            }
                        }
                    }
                    if(currentN != 0){
                        nextArray[index][j] = currentN;
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    Queue<Integer> queue = new ArrayDeque<>();
                    for (int k = 0; k < array.length; k++) {
                        if(array[j][k] != 0){
                            queue.add(array[j][k]);
                        }
                    }
                    int index = 0;;
                    if(queue.size() == 0){
                        continue;
                    }
                    int currentN = queue.poll();
                    if(queue.size() == 0){
                        nextArray[j][index] = currentN;
                        continue;
                    }
                    while(queue.size() != 0){
                        int nextN = queue.poll();
                        if(currentN == nextN){
                            nextArray[j][index++] = currentN + currentN;
                            currentN = 0;
                        } else {
                            if(currentN == 0){
                                currentN = nextN;
                            } else {
                                nextArray[j][index++] = currentN;
                                currentN = nextN;
                            }
                        }
                    }
                    if(currentN != 0){
                        nextArray[j][index] = currentN;
                    }
                }
            }
            array = getCopyArray(nextArray);
            getAnswer(count + 1);
            array = getCopyArray(copyArray);
        }

    }

    private static int[][] getCopyArray(int[][] paramArray){
        int[][] copyArray = new int[paramArray.length][paramArray.length];
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray.length; j++) {
                copyArray[i][j] = paramArray[i][j];
            }
        }
        return copyArray;
    }

}
