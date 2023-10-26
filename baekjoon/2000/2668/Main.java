// https://www.acmicpc.net/problem/2668
// 단지번호붙이기
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    private static int[] array;
    private static boolean[] visitArray;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        visitArray = new boolean[size + 1];
        for (int i = 1; i < array.length; i++) {
            if(visitArray[i]){
                continue;
            }
            boolean[] innerVisitArray = new boolean[size + 1];
            int startIndex = i;
            int result = getAnswer(innerVisitArray, startIndex, startIndex, 0);
            if(result != -1){
                for (int j = 1; j < innerVisitArray.length; j++) {
                    if(innerVisitArray[i]){
                        visitArray[i] = true;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 1; i < visitArray.length; i++) {
            if(visitArray[i]){
                answer++;
            }
        }
        bw.write(answer + "\n");
        for (int i = 1; i < visitArray.length; i++) {
            if(visitArray[i])
                bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(boolean[] innerVisitArray, int startIndex, int currentIndex, int count){
        if(innerVisitArray[currentIndex]){
            if(startIndex == currentIndex){
                return count;
            } else {
                return -1;
            }
        }
        innerVisitArray[currentIndex] = true;
        return getAnswer(innerVisitArray, startIndex, array[currentIndex], count + 1);
    }

}
// 1 2 3 4 5 6
// 2 3 2 5 6 5