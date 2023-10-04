// https://www.acmicpc.net/problem/15685
// 감시
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = {0, -1, 0, 1};
        int[] array2 = {1, 0, -1, 0};
        boolean[][] array = new boolean[101][101];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[1]);
            int n2 = Integer.parseInt(sArray[0]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            List<Integer> list = new ArrayList<>();
            list.add(n3);
            int currentY = n1 + array1[n3];
            int currentX = n2 + array2[n3];
            array[n1][n2] = true;
            array[currentY][currentX] = true;
            for (int j = 0; j < n4; j++) {
                int nextY = currentY;
                int nextX = currentX;
                List<Integer> innerList = new ArrayList<>();
                for (int k = list.size() - 1; k >= 0; k--) {
                    int n = list.get(k) + 1;
                    if(n == 4){
                        n = 0;
                    }
                    innerList.add(n);
                    nextY = nextY + array1[n];
                    nextX = nextX + array2[n];
                    array[nextY][nextX] = true;
                }
                list.addAll(innerList);
                currentY = nextY;
                currentX = nextX;
            }
        }
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[i][j] && array[i + 1][j] && array[i][j + 1] && array[i + 1][j + 1]){
                    count++;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
