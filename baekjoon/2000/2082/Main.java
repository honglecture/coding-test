// https://www.acmicpc.net/problem/2082
// 시계
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] keyArray = new String[5][15];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < keyArray.length; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                keyArray[i][j] = String.valueOf(str.charAt(j));
            }
        }
        String[][] array = {
            {"###","#.#","#.#","#.#","###"}
            ,{ "..#","..#","..#","..#","..#"}
            ,{
                "###"
               ,"..#"
               ,"###"
               ,"#.."
               ,"###"
            }
            ,{
                "###"
               ,"..#"
               ,"###"
               ,"..#"
               ,"###"
            }
            ,{
                "#.#"
               ,"#.#"
               ,"###"
               ,"..#"
               ,"..#"
            }
            ,{
                "###"
               ,"#.."
               ,"###"
               ,"..#"
               ,"###"
            }
            ,{
                "###"
               ,"#.."
               ,"###"
               ,"#.#"
               ,"###"
            }
            ,{
                "###"
               ,"..#"
               ,"..#"
               ,"..#"
               ,"..#"
            }
            ,{
                "###"
               ,"#.#"
               ,"###"
               ,"#.#"
               ,"###"
            }
            ,{
                "###"
               ,"#.#"
               ,"###"
               ,"..#"
               ,"###"
            }
        };
        for (int i = 0; i < keyArray[0].length; i+=4) {
            String[][] innerArray = new String[5][3];
            int count1 = 0;
            for (int j = 0; j < innerArray.length; j++) {
                int count2 = 0;
                for (int k = i; k < i + 3; k++) {
                    innerArray[count1][count2++] = keyArray[j][k];
                }
                count1++;
            }
            for (int j = 0; j < array.length; j++) {
                boolean flag = true;
                for (int k = 0; k < array[j].length; k++) {
                    for (int l = 0; l < array[j][k].length(); l++) {
                        if(innerArray[k][l].equals("#") && array[j][k].charAt(l) != '#'){
                            flag = false;
                            break;
                        }
                    }
                    if(!flag){
                        break;
                    }
                }
                if(flag){
                    sb.append(String.valueOf(j));
                    break;
                }
            }
        }
        sb.insert(2, ":");
        System.out.println(sb.toString());
        bw.flush();
        bw.close();
    }



}