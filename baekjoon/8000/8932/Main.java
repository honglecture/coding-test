// https://www.acmicpc.net/problem/8932
// 7종 경기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        double[] array1 = {9.23076, 1.84523, 56.0211, 4.99087, 0.188807, 15.9803, 0.11193};
        double[] array2 = {26.7, 75, 1.5, 42.5, 210, 3.8, 254};
        double[] array3 = {1.835, 1.348, 1.05, 1.81, 1.41, 1.04, 1.88};
        String[] typeArray = {"T", "F", "F", "T", "F", "F", "T"};
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                int n = array[j];
                double result = 0;
                if(typeArray[j].equals("T")){
                    result = (array1[j] * Math.pow(array2[j] - n, array3[j]));
                } else {
                    result = (array1[j] * Math.pow(n - array2[j], array3[j]));
                }
                sum += (int)result;
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}