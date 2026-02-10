package collections.list.demo1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) throws InterruptedException {
		List<String> list = new ArrayList();
		String str1Ref= new String("str1");
		String str2 = str1Ref;
		list.add(str1Ref);
		list.add("str1");
		list.add("str1");
		list.add(2,"str1");
//		System.out.println(list.get(0) == list.get(1));
		list.remove(2);
		list.remove(1);
//		list.remove(0);
		System.out.println(list.size());
		System.gc();
//		Thread.sleep(10000);
		System.out.println(str1Ref);
		System.out.println(list.contains(str2));
	}
}
