// https://www.acmicpc.net/problem/31924
// 현대모비스 특별상의 주인공은? 2
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        
        String[][] array = new String[size][size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = String.valueOf(sArray[j]);
            }
        }
        if(size >= 5){
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    String s = array[i][j];
                    if(s.equals("M")){
                        answer += getAnswer(array, i, j);                        
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String[][] array, int y, int x){
        int result = 0;
        int[] array1 = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] array2 = {-1, 0, 1, 1, 1, 0, -1, -1};
        for (int i = 0; i < array1.length; i++) {
            int currentY = y;
            int currentX = x;
            String str = "M";
            for (int j = 0; j < 4; j++) {
                currentY += array1[i];
                currentX += array2[i];
                if(currentY < 0 || currentX < 0 || currentY > array.length - 1 || currentX > array.length - 1){
                    break;
                }
                str += array[currentY][currentX];
            }
            if(str.equals("MOBIS")){
                result++;
            }
        }
        return result;
    }

    

}
