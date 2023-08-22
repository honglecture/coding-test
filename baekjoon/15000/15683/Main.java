// https://www.acmicpc.net/problem/15683
// 감시
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int[][] array;
    private static int[][] cctvArray;
    private static int[] selectArray;
    private static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        array = new int[y][x];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] != 0 && array[i][j] != 6){
                    list.add(new int[]{i, j, array[i][j]});
                }
            }
        }
        cctvArray = new int[list.size()][3];
        selectArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int[] tempArray = list.get(i);
            cctvArray[i][0] = tempArray[0];
            cctvArray[i][1] = tempArray[1];
            cctvArray[i][2] = tempArray[2];
        }
        getAnswer(0, 0);
        bw.write(answer +"\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == selectArray.length){
            getCount();
            return;
        }
        for (int i = 0; i < 4; i++) {
            selectArray[index] = i;
            getAnswer(count + 1, index + 1);
        }
    }

    private static void getCount(){
        int[][] checkArray = getCopyArray();
        for (int i = 0; i < selectArray.length; i++) {
            int d = selectArray[i];
            int y = cctvArray[i][0];
            int x = cctvArray[i][1];
            int type = cctvArray[i][2];
            if(type == 1){
                if(d == 0){
                    setUp(checkArray, y, x);
                } else if(d == 1){
                    setRight(checkArray, y, x);
                } else if(d == 2){
                    setBottom(checkArray, y, x);
                } else if(d == 3){
                    setLeft(checkArray, y, x);
                }
            } else if(type == 2){
                if(d == 0){
                    setUp(checkArray, y, x);
                    setBottom(checkArray, y, x);
                } else if(d == 1){
                    setRight(checkArray, y, x);
                    setLeft(checkArray, y, x);
                } else if(d == 2){
                    setUp(checkArray, y, x);
                    setBottom(checkArray, y, x);
                } else if(d == 3){
                    setRight(checkArray, y, x);
                    setLeft(checkArray, y, x);
                }
            } else if(type == 3){
                if(d == 0){
                    setUp(checkArray, y, x);
                    setRight(checkArray, y, x);
                } else if(d == 1){
                    setRight(checkArray, y, x);
                    setBottom(checkArray, y, x);
                } else if(d == 2){
                    setBottom(checkArray, y, x);
                    setLeft(checkArray, y, x);
                } else if(d == 3){
                    setLeft(checkArray, y, x);
                    setUp(checkArray, y, x);
                }
            } else if(type == 4){
                if(d == 0){
                setUp(checkArray, y, x);
                setRight(checkArray, y, x);
                setLeft(checkArray, y, x);
                } else if(d == 1){
                setUp(checkArray, y, x);
                setRight(checkArray, y, x);
                setBottom(checkArray, y, x);
                } else if(d == 2){
                setRight(checkArray, y, x);
                setBottom(checkArray, y, x);
                setLeft(checkArray, y, x);
                } else if(d == 3){
                setUp(checkArray, y, x);
                setBottom(checkArray, y, x);
                setLeft(checkArray, y, x);
                }
            } else if(type == 5){
                setUp(checkArray, y, x);
                setRight(checkArray, y, x);
                setBottom(checkArray, y, x);
                setLeft(checkArray, y, x);
            }
        }
        int count = 0;
        for (int i = 0; i < checkArray.length; i++) {
            for (int j = 0; j < checkArray[i].length; j++) {
                if(checkArray[i][j] == 0){
                    count++;
                }
            }
        }
        if(count < answer){
            answer = count;
        }
    }

    private static int[][] getCopyArray(){
        int[][] copyArray = new int[array.length][array[0].length];
        for (int i = 0; i < copyArray.length; i++) {
            for (int j = 0; j < copyArray[i].length; j++) {
                copyArray[i][j] = array[i][j];
            }
        }
        return copyArray;
    }

    private static void setUp(int[][] checkArray, int y, int x){
        int currentY = y;
        while(true){
            currentY -= 1;
            if(currentY < 0 || checkArray[currentY][x] == 6){
                break;
            }
            if(checkArray[currentY][x] != 0){
                continue;
            }
            checkArray[currentY][x] = -1;
        }
    }
    private static void setRight(int[][] checkArray, int y, int x){
        int currentX = x;
        while(true){
            currentX += 1;
            if(currentX > array[0].length - 1 || checkArray[y][currentX] == 6){
                break;
            }
            if(checkArray[y][currentX] != 0){
                continue;
            }
            checkArray[y][currentX] = -1;
        }
    }
    private static void setBottom(int[][] checkArray, int y, int x){
        int currentY = y;
        while(true){
            currentY += 1;
            if(currentY > array.length - 1 || checkArray[currentY][x] == 6){
                break;
            }
            if(checkArray[currentY][x] != 0){
                continue;
            }
            checkArray[currentY][x] = -1;
        }
    }
    private static void setLeft(int[][] checkArray, int y, int x){
        int currentX = x;
        while(true){
            currentX -= 1;
            if(currentX < 0 || checkArray[y][currentX] == 6){
                break;
            }
            if(checkArray[y][currentX] != 0){
                continue;
            }
            checkArray[y][currentX] = -1;
        }
    }

}