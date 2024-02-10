// https://www.acmicpc.net/problem/16503
// 괄호 없는 사칙연산
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int answer1 = 0;
        int answer2 = 0;
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[2]);
        int n3 = Integer.parseInt(sArray[4]);
        String type1 = sArray[1];
        String type2 = sArray[3];
        int result1 = getAnswer(n1, n2, type1);
        answer1 = getAnswer(result1, n3, type2);
        int result2 = getAnswer(n2, n3, type2);
        answer2 = getAnswer(n1, result2, type1);
        System.out.println(Integer.min(answer1, answer2));
        System.out.println(Integer.max(answer1, answer2));
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n1, int n2, String type){
        int result = 0;
        if(type.equals("+")){
            result = n1 + n2;
        } else if(type.equals("-")){
            result = n1 - n2;
        } else if(type.equals("*")){
            result = n1 * n2;
        } else if(type.equals("/")){
            result = n1 / n2;
        }
        return result;
    }

    


}
