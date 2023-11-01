// https://www.acmicpc.net/problem/2961
// 도영이가 만든 맛있는 음식
import java.io.*;
public class Main {

    private static int[][] array;
    private static boolean[] visitArray;
    private static long answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][2];
        visitArray = new boolean[size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
        }
        getAnswer(0, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int index, int count){
        for (int i = 0; i < visitArray.length; i++) {
            System.out.print(visitArray[i] + " ");
        }
        System.out.println();
        if(count > 0){
            long sum1 = 0;
            long sum2 = 0;
            boolean flag = false;;
            for (int i = 0; i < visitArray.length; i++) {
                if(visitArray[i]){
                    flag = true;
                    int n1 = array[i][0];
                    int n2 = array[i][1];
                    if(sum1 == 0){
                        sum1 = n1;
                    } else {
                        sum1 *= n1;
                    }
                    if(sum2 == 0){
                        sum2 = n2;
                    } else {
                        sum2 += n2;
                    }
                }
            }
            if(flag){
                long sum3 = Math.abs(sum1 - sum2);
                if(answer > sum3){
                    answer = sum3;
                }
            }
        }
        if(count > array.length - 1){
            return;
        }
        visitArray[index] = true;
        getAnswer(index + 1, count + 1);
        visitArray[index] = false;
        getAnswer(index + 1, count + 1);

    }
}