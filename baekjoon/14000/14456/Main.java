// https://www.acmicpc.net/problem/14456
// Hoof, Paper, Scissors (Bronze)
import java.io.*;
public class Main {

    private static boolean[] visitArray;
    private static String[] mappingArray;
    private static String[] strArray = {"a", "b", "c"};
    private static int[][] array;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size][2];
        visitArray = new boolean[3];
        mappingArray = new String[3];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        getAnswer(0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count){
        if(count == 3){
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                int n1 = array[i][0];
                int n2 = array[i][1];
                String s1 = mappingArray[n1 - 1];
                String s2 = mappingArray[n2 - 1];
                if(s1.equals("a") && s2.equals("c")){
                    result++;
                } else if(s1.equals("b") && s2.equals("a")){
                    result++;
                } else if(s1.equals("c") && s2.equals("b")){
                    result++;
                }
            }
            answer = Integer.max(answer, result);
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                mappingArray[count] = strArray[i];
                getAnswer(count + 1);
                visitArray[i] = false;
                mappingArray[count] = null;
            }
        }

    }
    
}