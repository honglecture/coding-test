// https://www.acmicpc.net/problem/23901
// Bike Tour
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array = new int[size];
            String[] sArray = bf.readLine().split(" ");
            int beforeNum = array[0];
            boolean flag = false;
            int answer = 0;
            int max = 0;
            for (int j = 0; j < sArray.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            for (int j = 1; j < array.length; j++) {
                int currentNum = array[j];
                if(currentNum > beforeNum){
                    flag = true;
                } else if(currentNum < beforeNum) {
                    if(flag){
                        if(max < beforeNum){
                            max = beforeNum;
                            answer++;
                        }
                        flag = false;
                    } else {
                        flag = false;
                    }
                } else {
                    flag = false;
                }
                beforeNum = currentNum;
            }
            bw.write("Case #"+(i + 1)+": "+answer+"\n");
        }
        bw.flush();
        bw.close();
    }

}
