import java.io.*;
import java.util.*;
/**
 * inutData20191007.txt 파일로 부터 이름과 성적 정보를 읽어 들여서 총점과 평균을 계산해주는 프로그램.
 *
 * @author (2018315036 양유석 , 2018315003 최세원)
 * @version (2019.10.07)
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
            
            Set<String> set = map.keySet();
            Iterator<String> it = set.iterator();
            
            while(it.hasNext()){
                String key = it.next();
                Integer value = map.get(key);
                result += value;
            }
            avr = result / map.size();
          
            System.out.println("------ 계산결과 ------");
            System.out.println("총점 : "+ result);
            System.out.println("평균 : "+ avr);
            
        }catch(IOException e){
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
