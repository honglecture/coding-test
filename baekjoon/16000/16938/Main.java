// https://www.acmicpc.net/problem/16938
// 캠프 준비
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {

    private static int left;
    private static int right;
    private static int key;
    private static int[] array;
    private static boolean[] visitArray;
    private static Set<String> set = new HashSet<>();
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        left = Integer.parseInt(sArray[1]);
        right = Integer.parseInt(sArray[2]);
        key = Integer.parseInt(sArray[3]);
        array = new int[size];
        visitArray = new boolean[size];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0, 0, 0, 0);
        answer = set.size();
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int sum, int firstNum, int lastNum, int count){
        if(count >= array.length){
            return;
        }
        if(sum > right){
            return;
        }
        if(sum >= left && sum <= right && count > 1){
            if(lastNum - firstNum >= key){
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < visitArray.length; i++) {
                    if(visitArray[i]){
                        sb.append(i + " ");
                    }
                }
                set.add(sb.toString());
            }
        }
        for (int i = count; i < array.length; i++) {
            if(!visitArray[i]){
                if(firstNum != 0){
                    visitArray[i] = true;
                    getAnswer(sum + array[i], firstNum, array[i], count + 1);
                    visitArray[i] = false;
                } else {
                    visitArray[i] = true;
                    getAnswer(array[i], array[i], array[i], count + 1);
                    visitArray[i] = false;
                }
            }
        }
    }

}
