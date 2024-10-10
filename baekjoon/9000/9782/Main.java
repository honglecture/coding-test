// https://www.acmicpc.net/problem/9782
// Median
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int index = 1;
        while (true) {
            String temp = bf.readLine();
            if(temp.equals("0")){
                break;
            }
            String[] sArray = temp.split(" ");
            double[] array = new double[sArray.length - 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = Double.parseDouble(sArray[i + 1]);
            }
            //Arrays.sort(array);
            String answer = "Case "+(index++)+": ";
            if(array.length % 2 == 0){
                double result = (array[array.length / 2 - 1] + array[array.length / 2]) / 2;
                answer += String.format("%.1f", result);
            } else {
                double result = array[array.length / 2];
                answer += String.format("%.1f", result);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}