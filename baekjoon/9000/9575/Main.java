// https://www.acmicpc.net/problem/9575
// 행운의 수
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            bf.readLine();
            String[] sArray = bf.readLine().split(" ");
            int[] array1 = new int[sArray.length];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = Integer.parseInt(sArray[j]);
            }
            bf.readLine();
            sArray = bf.readLine().split(" ");
            int[] array2 = new int[sArray.length];
            for (int j = 0; j < array2.length; j++) {
                array2[j] = Integer.parseInt(sArray[j]);
            }
            bf.readLine();
            sArray = bf.readLine().split(" ");
            int[] array3 = new int[sArray.length];
            for (int j = 0; j < array3.length; j++) {
                array3[j] = Integer.parseInt(sArray[j]);
            }
            int answer = getAnswer(array1, array2, array3);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[] array1, int[] array2, int[] array3){
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array3.length; k++) {
                    set.add(array1[i] + array2[j] + array3[k]);
                }
            }
        }
        for (int n : set) {
            String s = String.valueOf(n);
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c != '5' && c != '8'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        return answer;
    }
   

}