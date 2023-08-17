// https://www.acmicpc.net/problem/14499
// 주사위 굴리기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = {0, 0, 0, -1, 1};
        int[] array2 = {0, 1, -1, 0, 0};
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int startY = Integer.parseInt(sArray[2]);
        int startX = Integer.parseInt(sArray[3]);
        int currentN = 1; // 윗면 
        int[] diceArray = new int[7];
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            int order = Integer.parseInt(sArray[i]);
            int nextY = startY + array1[order];
            int nextX = startX + array2[order];
            int nextN = 0;
            int bottomN = 0;
            if(nextY < 0 || nextX < 0 || nextY > array.length - 1 || nextX > array[0].length - 1){
                continue;
            }
            if(currentN == 1){
                if(order == 1){
                    nextN = 4;
                } else if(order == 2){
                    nextN = 3;
                } else if(order == 3){
                    nextN = 5;
                } else if(order == 4){
                    nextN = 2;
                }
            } else if(currentN == 2){
                if(order == 1){
                    nextN = 4;
                } else if(order == 2){
                    nextN = 3;
                } else if(order == 3){
                    nextN = 1;
                } else if(order == 4){
                    nextN = 6;
                }
            } else if(currentN == 3){
                if(order == 1){
                    nextN = 1;
                } else if(order == 2){
                    nextN = 6;
                } else if(order == 3){
                    nextN = 5;
                } else if(order == 4){
                    nextN = 2;
                }
            } else if(currentN == 4){
                if(order == 1){
                    nextN = 6;
                } else if(order == 2){
                    nextN = 1;
                } else if(order == 3){
                    nextN = 2;
                } else if(order == 4){
                    nextN = 5;
                }
            } else if(currentN == 5){
                if(order == 1){
                    nextN = 3;
                } else if(order == 2){
                    nextN = 4;
                } else if(order == 3){
                    nextN = 6;
                } else if(order == 4){
                    nextN = 1;
                }
            } else if(currentN == 6){
                if(order == 1){
                    nextN = 3;
                } else if(order == 2){
                    nextN = 4;
                } else if(order == 3){
                    nextN = 2;
                } else if(order == 4){
                    nextN = 5;
                }
            }
            
            if(nextN == 1){
                bottomN = 6;
            } else if(nextN == 2){
                bottomN = 5;
            } else if(nextN == 3){
                bottomN = 4;
            } else if(nextN == 4){
                bottomN = 3;
            } else if(nextN == 5){
                bottomN = 2;
            } else if(nextN == 6){
                bottomN = 1;
            }
            int temp = array[nextY][nextX];
            array[nextY][nextX] = diceArray[bottomN];
            diceArray[bottomN] = temp;
            currentN = nextN;
            startY = nextY;
            startX = nextX;
            bw.write(diceArray[nextN] + "\n");
            System.out.println(nextN);
            for (int index = 1; index < diceArray.length; index++) {
                System.out.print(diceArray[index] + " ");
            }
            System.out.println();
        }
        bw.flush();
        bw.close();
    }


}