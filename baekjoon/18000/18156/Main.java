// https://www.acmicpc.net/problem/18156
// Black and White
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][size];
        for (int i = 0; i < array.length; i++) {
            String str = bf.readLine();
            for (int j = 0; j < array.length; j++) {
                array[i][j] = String.valueOf(str.charAt(j));
            }
        }
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int count4 = 0;
            int maxCount1 = 0;
            int maxCount2 = 0;
            String beforeString1 = "";
            String beforeString2 = "";
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals("W")){
                    count2++;
                } else {
                    count1++;
                }
                if(array[j][i].equals("W")){
                    count4++;
                } else {
                    count3++;
                }
                if(beforeString1.equals("")){
                    maxCount1 = 1;
                    beforeString1 = array[i][j];
                } else {
                    if(array[i][j].equals(beforeString1)){
                        maxCount1++;
                        if(maxCount1 >= 3){
                            flag = false;
                            break;
                        }
                    } else {
                        maxCount1 = 1;
                        beforeString1 = array[i][j];
                    }
                }
                if(beforeString2.equals("")){
                    maxCount2 = 1;
                    beforeString2 = array[j][i];
                } else {
                    if(array[j][i].equals(beforeString2)){
                        maxCount2++;
                        if(maxCount2 >= 3){
                            flag = false;
                            break;
                        }
                    } else {
                        maxCount2 = 1;
                        beforeString2 = array[j][i];
                    }
                }
            }
            if(count1 != count2){
                flag = false;
                break;
            }
            if(count3 != count4){
                flag = false;
                break;
            }
            if(!flag){
                break;
            }
        }

        if(flag){
            bw.write("1\n");
        } else {
            bw.write("0\n");
        }
        
        bw.flush();
        bw.close();
    }

}
