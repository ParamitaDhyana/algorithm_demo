package Search;

/**  
 * ClassName: Exercises  
 * @author ��������
 * @version 1.0 
 * Create Time: 2019/01/18 19:11  
 * Description: TODO ���ʵ������ 
 */ 
public class Exercises {

	/**
	 * 852. Peak Index in a Mountain Array
	 * ��ĿURL�� https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/
	 * @param A
	 * @return
	 */
	public int peakIndexInMountainArray(int[] A) {
		int l = 0, r = A.length, m = r;

		while (l <= r) {

			m = (l + r) / 2;

			if (A[m - 1] < A[m] && A[m] > A[m + 1])
				return m;

			if (A[m - 1] > A[m]) {
				r = m;
			} else {
				l = m;
			}
		}

		return 0;
	}
}
