// https://www.acmicpc.net/problem/14501
// 퇴사
import java.io.*;

public class Main {

    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array1[i] = n1;
            array2[i] = n2;
        }
        getAnswer(array1, array2, 0, 0);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int[] array1, int[] array2, int currentIndex, int sum){
        boolean flag = false;
        for (int i = currentIndex; i < array1.length; i++) {
            int n1 = array1[i];
            int n2 = array2[i];
            if(i + n1 > array1.length){
                continue;
            }
            getAnswer(array1, array2, i + n1, sum + n2);
            flag = true;
        }
        if(!flag){
            if(answer < sum){
                answer = sum;
            }
        }
    }
}