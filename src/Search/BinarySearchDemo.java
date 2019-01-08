package Search;

import java.util.*;

public class BinarySearchDemo {

	int[] arr;

	public BinarySearchDemo(int[] tArr) {
		arr = tArr;
	}

	/**����ĳ������λ��
	 * @param item
	 * @return
	 */
	public int IndexOf(int item) {

		int l = 0, r = arr.length - 1;
		while (l <= r) {
			int m =l+ (r-1) / 2;
			if (arr[m] == item)
				return m;
			// ����������м�ֵ���������
			if (item > arr[m])
				l = m + 1;
			if (item < arr[m])
				r = m - 1;
		} 
		
		return -1;
	}

	/**
	 * �����Ƿ����ĳԪ��
	 * 
	 * @param key
	 * @return
	 */
	public boolean Contain(int key) {
		int min = 0, max = arr.length - 1, high = max / 2;

		if (key > max || key < min) {
			System.out.println("������û���ҵ�Ԫ�� :" + key);
			return false;
		}
		boolean exsist = false;
		while (max > min) {
			high = max / 2; // ����λ�ü�¼

			if (key > arr[high]) {
				min = high;
				continue;
			}
			if (key < arr[high]) {
				max = high;
				continue;
			}
			if (key == arr[high]) {
				exsist = true;
				break;
			}
		}
		return exsist;
	}

	/**
	 * ���ҵ�һ��Ԫ�ص����� List<Integer> strings = new ArrayList<Integer>();
	 * 
	 * @param item ��ѯԪ��
	 * @return ����
	 */
	public int First(int item) {

		return -1;
	}

}
