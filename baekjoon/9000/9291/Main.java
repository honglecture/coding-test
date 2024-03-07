// https://www.acmicpc.net/problem/9291
// 스도쿠 채점
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int[][] array = new int[9][9];
            for (int j = 0; j < 9; j++) {
                String[] sArray = bf.readLine().split(" ");
                for (int k = 0; k < sArray.length; k++) {
                    array[j][k] = Integer.parseInt(sArray[k]);
                }
            }
            boolean result = getAnswer(array);
            if(result){
                bw.write("Case "+(i + 1)+": CORRECT\n");
            } else {
                bw.write("Case "+(i + 1)+": INCORRECT\n");
            }
            if(i != size - 1){
                bf.readLine();
            }
        }
        bw.flush();
        bw.close();
    }


    private static boolean getAnswer(int[][] array){
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            boolean[] checkArray1 = new boolean[10];
            boolean[] checkArray2 = new boolean[10];
            for (int j = 0; j < array.length; j++) {
                int n1 = array[i][j];
                int n2 = array[j][i];
                if(checkArray1[n1]){
                    flag = false;
                    break;
                }
                if(checkArray2[n2]){
                    flag = false;
                    break;
                }
                checkArray1[n1] = true;
                checkArray2[n2] = true;
            }
            if(!flag){
                return flag;
            }
        }
        for (int i = 0; i < array.length; i += 3) {
            for (int j = 0; j < array.length; j += 3) {
                boolean[] checkArray = new boolean[10];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        int n = array[k][l];
                        if(checkArray[n]){
                            flag = false;
                            break;
                        }
                        checkArray[n] = true;
                    }
                    if(!flag){
                        break;
                    }
                }
                if(!flag){
                    return flag;
                }
            }
        }
        return flag;
    }
}