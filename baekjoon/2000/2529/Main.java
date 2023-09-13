// https://www.acmicpc.net/problem/2529
// 부등호
import java.io.*;
public class Main {

    private static String[] array;
    private static int[] numArray;
    private static boolean[] visitArray;
    private static int size;
    private static long minAnswer = Long.MAX_VALUE;
    private static long maxAnswer = Long.MIN_VALUE;
    private static String minAnswerStr = "";
    private static String maxAnswerStr = "";
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(bf.readLine());
        array = bf.readLine().split(" ");
        numArray = new int[size + 1];
        visitArray = new boolean[10];
        getAnswer(0, 0);
        bw.write(maxAnswerStr + "\n");
        bw.write(minAnswerStr + "\n");
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int count, int index){
        if(count == size + 1){
            checkAnswer();
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                numArray[index] = i;
                getAnswer(count + 1, index + 1);
                visitArray[i] = false;
            }
        }
    }

    private static void checkAnswer(){
        boolean flag = true;
        for (int i = 0; i < numArray.length - 1; i++) {
            int n1 = numArray[i];
            int n2 = numArray[i + 1];
            String type = array[i];
            if(type.equals(">")){
                if(n1 < n2){
                    flag = false;
                    break;
                }
            } else if(type.equals("<")){
                if(n1 > n2){
                    flag = false;
                    break;
                }
            } else {}
        }
        if(flag){
            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < numArray.length; i++) {
                sb.append(String.valueOf(numArray[i]));
            }
            long num = Long.parseLong(sb.toString());
            if(num > maxAnswer){
                maxAnswer = num;
                maxAnswerStr = sb.toString();
            }
            if(num < minAnswer){
                minAnswer = num;
                minAnswerStr = sb.toString();
            }
        }
    }
}