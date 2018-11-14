/******************************************************************
 * Test.java
 * Copyright jk 2018
 * CreateDate：2018年8月15日
 * Author：jk
 ******************************************************************/

package lambda.test1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * <b>修改记录：</b> 
 * <p>
 * <li>
 * 
 *                        ---- jk 2018年8月15日
 * </li>
 * </p>
 * 
 * <b>类说明：</b>
 * <p> 
 * 
 * </p>
 */
public class Test {
	
	public static void main(String[] args) {
		ArrayList<Person> arrayList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			arrayList.add(new Person("person"+i, 10+i, i%2==0?"男":"女"));
			
		}
		arrayList.stream().filter((s)->{
			return s.getAge()>50;
		}).sorted(Comparator.comparing(Person::getGender)).forEach((s)->{
			System.out.println(s);
		});
		
	}

}
