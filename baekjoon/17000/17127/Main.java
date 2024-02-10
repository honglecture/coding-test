// https://www.acmicpc.net/problem/17127
// 벚꽃이 정보섬에 피어난 이유
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int anwer = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length - 3; i++) {
            for (int j = i + 1; j < array.length - 2; j++) {
                for (int k = j + 1; k < array.length - 1; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        int start1 = 0;
                        int end1 = i;
                        int start2 = j;
                        int end2 = k - 1;
                        int start3 = k;
                        int end3 = l - 1;
                        int start4 = l;
                        int end4 = array.length - 1;
                        int result = 0;
                        int[][] innerArray ={
                            {start1, end1}, {start2, end2}, {start3, end3}, {start4, end4}
                        };
                        for (int m = 0; m < innerArray.length; m++) {
                            int sum = 1;
                            for (int n = innerArray[m][0]; n <= innerArray[m][1]; n++) {
                                sum *= array[n];
                            }
                            result += sum;
                        }
                        if(result > anwer){
                            anwer = result;
                        }
                    }
                }
            }
        }
        System.out.println(anwer);
        bw.flush();
        bw.close();
    }

}
