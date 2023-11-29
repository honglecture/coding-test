// https://www.acmicpc.net/problem/12515
// 챔피언소트 (Small)
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int answer = 0;
            int size = Integer.parseInt(bf.readLine());
            int[] array = new int[size + 1];
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[j + 1] = Integer.parseInt(sArray[j]);
            }
            int currentNum = 1;
            while (true) {
                if(currentNum == size + 1){
                    break;
                }
                int index = 0;
                for (int j = 1; j < array.length; j++) {
                    if(array[j] == currentNum){
                        index = j;
                        break;
                    }
                }
                if(index != currentNum){
                    answer += 2;
                    int temp = array[currentNum];
                    array[currentNum] = array[index];
                    array[index] = temp;
                }
                currentNum++;
            }
            if(answer == 0){
                bw.write("Case #" + (i + 1) + ": 0.000000\n");
            } else {
                bw.write("Case #" + (i + 1) + ": "+answer+".000000\n");
            }
        }
        bw.flush();
        bw.close();
    }
   
}


