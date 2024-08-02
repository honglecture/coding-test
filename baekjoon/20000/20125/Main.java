// https://www.acmicpc.net/problem/20125
// 쿠키의 신체 측정
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        List<Integer> answerList = new ArrayList<>();
        int centerY = 0;
        int centerX = 0;
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if(array[i][j].equals("*")){
                    centerY = i + 1;
                    centerX = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        int left = 0;
        int right = 0;
        int center = 0;
        int leftLeg = 0;
        int rightLeg = 0;
        for (int i = centerX - 1; i >= 0; i--) {
            if(!array[centerY][i].equals("*")){
                break;
            }
            left++;
        }
        for (int i = centerX + 1; i < array.length; i++) {
            if(!array[centerY][i].equals("*")){
                break;
            }
            right++;
        }
        for (int i = centerY + 1; i < array.length; i++) {
            if(!array[i][centerX].equals("*")){
                break;
            }
            center++;
        }
        for (int i = centerY + center + 1; i < array.length; i++) {
            if(!array[i][centerX - 1].equals("*")){
                break;
            }
            leftLeg++;
        }
        for (int i = centerY + center + 1; i < array.length; i++) {
            if(!array[i][centerX + 1].equals("*")){
                break;
            }
            rightLeg++;
        }
        answerList.add(left);
        answerList.add(right);
        answerList.add(center);
        answerList.add(leftLeg);
        answerList.add(rightLeg);
        bw.write((centerY + 1) + " " + (centerX + 1) + "\n");
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

}
