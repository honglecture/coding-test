// https://www.acmicpc.net/problem/12791
// Mini Fantasy War
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = {
            "1967 DavidBowie"
            ,"1969 SpaceOddity"
            ,"1970 TheManWhoSoldTheWorld"
            ,"1971 HunkyDory"
            ,"1972 TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"
            ,"1973 AladdinSane"
            ,"1973 PinUps"
            ,"1974 DiamondDogs"
            ,"1975 YoungAmericans"
            ,"1976 StationToStation"
            ,"1977 Low"
            ,"1977 Heroes"
            ,"1979 Lodger"
            ,"1980 ScaryMonstersAndSuperCreeps"
            ,"1983 LetsDance"
            ,"1984 Tonight"
            ,"1987 NeverLetMeDown"
            ,"1993 BlackTieWhiteNoise"
            ,"1995 1.Outside"
            ,"1997 Earthling"
            ,"1999 Hours"
            ,"2002 Heathen"
            ,"2003 Reality"
            ,"2013 TheNextDay"
            ,"2016 BlackStar"
        };
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            String[] sArray = array[i].split(" ");
            int year = Integer.parseInt(sArray[0]);
            String name = sArray[1];
            if(map.get(year) == null){
                List<String> list = new ArrayList<>();
                list.add(name);
                map.put(year, list);
            } else {
                map.get(year).add(name);
            }
        }
        
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            List<String> list = new ArrayList<>();
            for (int j = n1; j <= n2; j++) {
                List<String> innerList = map.get(j);
                if(innerList == null){
                    continue;
                } else {
                    for (int k = 0; k < innerList.size(); k++) {
                        list.add(j + " " + innerList.get(k));
                    }
                }
            }
            if(list.size() == 0){
                bw.write("0\n");
            } else {
                bw.write(list.size() + "\n");
                for (int j = 0; j < list.size(); j++) {
                    bw.write(list.get(j) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

}
