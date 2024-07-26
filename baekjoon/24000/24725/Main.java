// https://www.acmicpc.net/problem/24725
// 엠비티아이
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        set.add("ESFP");
        set.add("ENFP");
        set.add("ISFP");
        set.add("INFP");
        set.add("ESFJ");
        set.add("ENFJ");
        set.add("ISFJ");
        set.add("INFJ");
        set.add("ESTP");
        set.add("ENTP");
        set.add("ISTP");
        set.add("INTP");
        set.add("ESTJ");
        set.add("ENTJ");
        set.add("ISTJ");
        set.add("INTJ");
        String[] sArray = bf.readLine().split(" ");
        String[][] array = new String[Integer.parseInt(sArray[0])][Integer.parseInt(sArray[1])];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int result = getAnswer(array, i, j);
                answer += result;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


    private static int getAnswer(String[][] array, int startY, int startX){
        int result = 0;
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {1, 0, -1, -1, -1, 0, 1, 1};
        for (int i = 0; i < array1.length; i++) {
            String str = "";
            int currentY = startY;
            int currentX = startX;
            while (true) {
                str += array[currentY][currentX];
                if(str.length() == 4){
                    break;
                }
                currentY += array1[i];
                currentX += array2[i];
                if(currentY < 0 || currentX < 0 || currentY >  array.length - 1 || currentX > array[0].length - 1){
                    break;
                }
            }
            if(str.length() == 4){
                if(set.contains(str)){
                    result++;
                }
            }
        }
        return result;
    }
    

}
