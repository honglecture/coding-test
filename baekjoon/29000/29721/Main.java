// https://www.acmicpc.net/problem/29721
// 변형 체스 놀이 : 다바바(Dabbaba)
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        Set<String> set = new HashSet<>();
        Set<String> answerSet = new HashSet<>();
        int[] array1 = {-2, 0, 2, 0};
        int[] array2 = {0, -2, 0, 2};
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[1]) - 1;
            int x = Integer.parseInt(sArray[0]) - 1;
            set.add(y + " " + x);
        }
        for (String str : set) {
            sArray = str.split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            for (int i = 0; i < array1.length; i++) {
                int nextY = y + array1[i];
                int nextX = x + array2[i];
                if(nextY < 0 || nextX < 0 || nextY > size1 - 1 || nextX >  size1 - 1){
                    continue;
                }
                if(set.contains(nextY + " " + nextX)){
                    continue;
                }
                answerSet.add(nextY + " " + nextX);
            }
        }
        System.out.println(answerSet.size());
        bw.flush();
        bw.close();
    }

    

}
