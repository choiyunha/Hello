package generic;

import java.util.*;

public class IteratorEx {
   public static void main(String[] args) {
	  // 정수 값만 다루는 generic ArrayList 생성
      ArrayList<Integer> v = new ArrayList<Integer>();
      v.add(27);
      v.add(45);
      v.add(54);
      v.add(1, -36);    // 27과 45 사이에 -36 삽입
      
      Iterator<Integer> it = v.iterator();
      while (it.hasNext()) {
         int n=it.next();
         System.out.println(n);
      }
      
      int sum = 0;
      it = v.iterator();
      while(it.hasNext()) {
         int n = it.next();
         sum += n;
      }
      
      System.out.println("sum of the elements in the ArrayList: " + sum);
   }
   
}
