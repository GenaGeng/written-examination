package Interview.Lecode2;

/**
 * @author Gena
 * @description
 * @date 2020/7/21 0021
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Twonumsadd {
    public ListNode getTwonumsum(ListNode l1,ListNode l2) {
//        ListNode pre = new ListNode(0);
//        ListNode cur = pre;
//        ListNode p = l1;
//        ListNode q = l2;
//        int carry = 0;;
//        while (p!=null || q!=null){
//            int x = p!=null ? p.val : 0;
//            int y = q!=null ? q.val : 0;
//
//            int sum = x + y + carry;
//            carry = sum / 10;
//            sum = sum % 10;
//
//            cur.next = new ListNode(sum);
//            cur = cur.next;
//
//            if (p!=null){
//                p = p.next;
//            }
//            if (q!=null){
//                q=q.next;
//            }
//        }
//
//        if(carry == 1){
//            cur.next = new ListNode(1);
//        }
//
//        return pre.next;
//    }
        ListNode sum = new ListNode(0);
        ListNode curr = sum;
        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        while (p1!=null || p2!=null){
            int x = p1!=null ? p1.val : 0;
            int y = p2!=null ? p2.val : 0;

            int z = x + y + carry;
            carry = z / 10;
            z = z % 10;

            curr.next = new ListNode(z);
            curr = curr.next;

            if (p1 != null){
                p1 = p1.next;
            }
            if (p2 != null){
                p2 = p2.next;
            }

        }
        if (carry == 1){
            curr.next = new ListNode(1);
        }
        return sum.next;
    }
}
