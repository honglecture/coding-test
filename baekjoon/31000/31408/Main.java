// https://www.acmicpc.net/problem/31408
// 당직 근무표
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int[] countArray = new int[100001];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            countArray[n]++;
        }
        for (int i = 0; i < countArray.length; i++) {
            if(maxCount < countArray[i]){
                maxCount = countArray[i];
            }
        }
        if(size % 2 == 0){
            if(maxCount > size / 2){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            if(maxCount > size / 2 + 1){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        bw.flush();
        bw.close();
    }

    

}
