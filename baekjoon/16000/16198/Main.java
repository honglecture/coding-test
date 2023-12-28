// https://www.acmicpc.net/problem/16198
// 에너지 모으기
import java.io.*;

public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static int size;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(bf.readLine());
        array = new int[size];
        visitArray = new boolean[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        getAnswer(0, 0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int sum){
        if(count == size - 2){
            if(sum > answer){
                answer = sum;
            }
            return;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                int n1 = 0;
                int n2 = 0;
                int reuslt = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if(!visitArray[j]){
                        n1 = array[j];
                        break;
                    }
                }
                for (int j = i + 1; j < array.length; j++) {
                    if(!visitArray[j]){
                        n2 = array[j];
                        break;
                    }
                }
                reuslt = n1 * n2;
                getAnswer(count + 1, sum + reuslt);
                visitArray[i] = false;
            }
        }
    }

}

