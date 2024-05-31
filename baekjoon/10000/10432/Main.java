// https://www.acmicpc.net/problem/10432
// 데이터 스트림의 섬
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int result = getAnswer(array);
            bw.write((i + 1) + " " + result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i];
            if(n1 == 0){
                continue;
            }
            
        }
        return result;
    }
}



