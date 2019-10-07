import java.io.*;
import java.util.*;
/**
 * Write a description of class MyApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyApp
{
    public static void main(String[] args){    
        int result = 0;
        double avr = 0.0;
        try{
            HashMap<String,Integer> map = new HashMap<String, Integer>();
            Scanner sc = new Scanner(new FileReader("c:\\temp\\inputData20191007.txt"));
            while(sc.hasNext()){
                String line = sc.nextLine();
                StringTokenizer stz = new StringTokenizer(line, " ");
                map.put(stz.nextToken(), Integer.parseInt(stz.nextToken()));
            }
            Set<String> a = map.keySet();
            Iterator<String> it = a.iterator();
            while(it.hasNext()){
                String key = it.next();
                Integer value = map.get(key);
                result += value;
            }
            avr = result / map.size();
            System.out.println(map.size());
            System.out.println("------ 계산결과 ------");
            System.out.println("총점 : "+ result);
            System.out.println("평균 : "+ avr);
        }catch(IOException e){
            System.out.println("파일이 존재하지 않습니다.");
        }

        System.out.println("------ 계산결과 ------");
        System.out.println("총점 : "+ result);
        System.out.println("평균 : "+ avr);
    }
}
