package 数组.合并两个有序数组;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zx
 * @date 2023/12/28 16:59
 */
public class Quiz88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //法一，双指针+临时数组拷贝
//        if (n == 0) return;
//        else if (m == 0) {
//            for (int i = 0; i < n; i++) {
//                nums1[i] = nums2[i];
//            }
//            return;
//        }
//        int[] ans = new int[m + n];
//        int i = 0, j = 0;
//        int pos = 0;
//        while (i < m || j < n) {
//            if (i == m) ans[pos++] = nums2[j++];
//            else if (j == n) ans[pos++] = nums1[i++];
//            else if (nums1[i] > nums2[j]) ans[pos++] = nums2[j++];
//            else ans[pos++] = nums1[i++];
//        }
//        for (int k = 0; k < m + n; k++) {
//            nums1[k] = ans[k];
//        }
        //法二：双指针逆向插入
        if (n == 0) return;
        else if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int i = m - 1, j = n - 1;
        int pos = m + n - 1;
        while (i >= 0 || j >= 0) {
            if (i < 0) nums1[pos--] = nums2[j--];
            else if (j < 0) nums1[pos--] = nums1[i--];
            else if (nums1[i] >= nums2[j]) nums1[pos--] = nums1[i--];
            else nums1[pos--] = nums2[j--];
        }
    }
}
