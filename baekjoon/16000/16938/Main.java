// https://www.acmicpc.net/problem/16938
// 캠프 준비
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    private static int left;
    private static int right;
    private static int x;
    private static int[] array;
    private static boolean[] visitArray;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        left = Integer.parseInt(sArray[1]);
        right = Integer.parseInt(sArray[2]);
        x = Integer.parseInt(sArray[3]);
        sArray = bf.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n > right){
                continue;
            }
            list.add(n);
        }
        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Arrays.sort(array);
        visitArray = new boolean[array.length];
        getAnswer(0, 0, 0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, int count, int sum){
        if(index == array.length){
            return;
        }
        if(sum > right){
            return;
        }
        if(index > 0){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < visitArray.length; i++) {
                if(visitArray[i]){
                    if(min > array[i]){
                        min = array[i];
                    }
                    if(max < array[i]){
                        max = array[i];
                    }
                }
            }
            System.out.println(min + " " + max);
            if(max - min > x){
                return;
            }
            if(sum >= left && sum <= right){
                for (int i = 0; i < visitArray.length; i++) {
                    System.out.print(visitArray[i] + " ");
                }
                System.out.println();
                answer++;
            }
        }
        for (int i = index; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(index + 1, count + 1, sum + array[i]);
                visitArray[i] = false;
            }
        }
    }
    
}
