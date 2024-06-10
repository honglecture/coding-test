// https://www.acmicpc.net/problem/30454
// 얼룩말을 찾아라!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int count = 0;
        int maxNum = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int result = getAnswer(str);
            if(maxNum < result){
                maxNum = result;
                count = 1;
            } else if(maxNum == result){
                count++;
            }
        }
        System.out.println(maxNum + " " + count);
        bw.flush();
        bw.close();
    }

    private static int getAnswer(String str){
        int result = 0;
        boolean flag = true;
        if(str.charAt(0) == '0'){
            flag = false;
        } else {
            result++;
        }
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '0'){
                flag = false;
            } else {
                if(!flag){
                    result++;
                    flag = true;
                }
            }
        }
        return result;
    }

    

}
