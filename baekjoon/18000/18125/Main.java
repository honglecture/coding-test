// https://www.acmicpc.net/problem/18125
// 고양이 사료
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[x][y];
        boolean flag = true;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                list1.add(array[i][j]);
            }
        }
        array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = x - 1; i >= 0; i--) {
            for (int j = 0; j < y; j++) {
                list2.add(array[j][i]);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) != list2.get(i)){
                flag = false;
                break;
            }
        }
        if(!flag){
            System.out.println("|>___/|     /}");
            System.out.println("| O O |    / }");
            System.out.println("( =0= )\"\"\"\"  \\");
            System.out.println("| ^  ____    |");
            System.out.println("|_|_/    ||__|");
        } else {
            System.out.println("|>___/|        /}");
            System.out.println("| O < |       / }");
            System.out.println("(==0==)------/ }");
            System.out.println("| ^  _____    |");
            System.out.println("|_|_/     ||__|");
        }
        bw.flush();
        bw.close();
    }

}
