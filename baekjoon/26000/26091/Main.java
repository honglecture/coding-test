// https://www.acmicpc.net/problem/26091
// 현대모비스 소프트웨어 아카데미
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (true) {
            if(left >= right){
                break;
            }
            int leftNum = array[left];
            int rightNum = array[right];
            if(leftNum + rightNum >= n2){
                answer++;
                left++;
                right--;
            } else {
                left++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
