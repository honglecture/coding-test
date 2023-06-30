// https://www.acmicpc.net/problem/10250
// ACM 호텔
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            int target = Integer.parseInt(sArray[2]);
            String result = getAnswer(y, x, target);
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }


    private static String getAnswer(int y, int x, int target){
        String result = "";
        int count = 0;
        int answerY = 0;
        int answerX = 0;
        for (int i = 0; i < x; i++) {
            boolean flag = true;
            for (int j = 0; j < y; j++) {
                count++;
                if(target == count){
                    answerY = j + 1;
                    answerX = i + 1;
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        result += answerY;
        if(answerX > 9){
            result += answerX;
        } else {
            result += "0"+answerX;
        }
        return result;
    }

}