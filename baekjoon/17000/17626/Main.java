// https://www.acmicpc.net/problem/17626
// Four Squares
import java.io.*;

public class Main {

    private static int n;
    private static int[] array;
    private static int[] selectArray;
    private static int minAnswer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        array = new int[224];
        selectArray = new int[4];
        n = Integer.parseInt(bf.readLine());
        int count = 1;
        while(true){
            int result = count * count;
            if(result > 50000){
                break;
            }
            array[count] = result;
            count++;
        }
        getAnswer(0, 0, 0);
        bw.write(minAnswer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index, int result){
        if(result == n){
            if(minAnswer > count){
                minAnswer = count;
            }
            return;
        } else if(result > n){
            return;
        }
        if(count >= 4){
            return;
        }
        for (int i = 1; i < array.length; i++) {
            if(array[i] > n){
                return;
            }
            selectArray[index] = array[i];
            getAnswer(count + 1, index + 1, result + array[i]);
            selectArray[index] = 0;
        }
    }
}