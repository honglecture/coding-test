// https://www.acmicpc.net/problem/12723
// 단어순서 뒤집기
import java.io.*;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array1 = new int[size];
            int[] array2 = new int[size];
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            for (int j = 0; j < array1.length; j++) {
                array1[j] = Integer.parseInt(sArray1[j]);
                array2[j] = Integer.parseInt(sArray2[j]);
            }
            boolean[] visitArray1 = new boolean[size];
            boolean[] visitArray2 = new boolean[size];
            int result = 0;
            while (true) {
                boolean flag = false;
                int sum = Integer.MAX_VALUE;
                int index1 = 0;
                int index2 = 0;
                
                for (int j = 0; j < array1.length; j++) {
                    if(visitArray1[j]){
                        continue;
                    }
                    int n1 = array1[j];
                    flag = true;
                    for (int k = 0; k < array2.length; k++) {
                        if(visitArray2[k]){
                            continue;
                        }
                        int n2 = array2[k];
                        if(sum > n1 * n2){
                            sum = n1 * n2;
                            index1 = j;
                            index2 = k;
                        }
                    }
                }
                if(!flag){
                    break;
                }
                visitArray1[index1] = true;
                visitArray2[index2] = true;
                result += sum;
            }
            bw.write("Case #"+(i + 1)+": " + result + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


