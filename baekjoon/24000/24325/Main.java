// https://www.acmicpc.net/problem/24325
// Making Change
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = {50, 20, 10, 5, 1};
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            double n1 = Double.parseDouble(sArray[0]);
            double n2 = Double.parseDouble(sArray[1]);
            double n3 = n2 - n1;
            for (int j = 0; j < array.length; j++) {
                int result = (int)(n3 / array[j]);
                if(j != array.length - 1){
                    bw.write(result + "-" +"$" + array[j] + ", ");
                    n3 -= result * array[j];
                } else {
                    bw.write(result + "-" +"$" + array[j] + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
