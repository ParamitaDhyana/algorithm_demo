package Search;

import java.util.*;

/**
 * @author ��������
 *
 */
public class BinarySearchDemo {

	int[] arr;

	public BinarySearchDemo(int[] tArr) {
		arr = tArr;
	}

	/**
	 * ����ĳ������λ��
	 * 
	 * @param item
	 * @return
	 */
	public int IndexOf(int item) {

		int l = 0, r = arr.length - 1;

		while (l < r) {
			int m = (l + r) / 2;
			if (item == arr[m])
				return m;
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
			if (key == arr[high]) {
				exsist = true;
				break;
			}
			if (key > arr[high]) {
				min = high;
			} else if (key < arr[high]) {
				max = high; 
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
	public int FirstOfIndex(int item) {
		int l = 0, r = arr.length - 1;
		int first = -1;
		if (item == arr[l])
			return l;

		while (l < r) {
			int m = (l + r) / 2;
			// �ҵ��ˣ�Ҫ����ǰ���Ƿ�����ͬ��ֵ
			if (item == arr[m]) {
				first = m;
				l = m + 1;
			}
			// ��m ֮ǰ�����ݶ�Ҫ�󣬶���[l,m]������
			if (item > arr[m])
				l = m + 1;
			else
				r = m - 1;
		}

		return first;
	}

}
