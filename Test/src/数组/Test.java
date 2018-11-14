package 数组;

import java.util.Arrays;
import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		test1();
	}
	//复制数组 数组初始化的时候大小就指定了，不能改变
	public static void test() {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[4];
		System.arraycopy(a, 0, b, 0, 3);
		System.out.println(Arrays.toString(b));
	}
	
	// 测试删除重复元素
	public static void test1() {
		int[] a = new int[] {1,2,2,3,4,5,6,7,8,9,10,10,10,10};
		HashSet<Object> hashSet = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hashSet.add(a[i]);
		}
		Object[] array = hashSet.toArray();
		System.out.println(Arrays.toString(array));
	}
}
