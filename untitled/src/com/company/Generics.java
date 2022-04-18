package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Generics {




    class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode pre=null;
        while(fast!=null&&fast.next!=null){
            ListNode temp=slow.next;
            slow.next=pre;
            pre=slow;
            slow=temp;
            fast=fast.next.next;
        }
        if(fast.next!=null){
            slow=slow.next;
        }
        while(pre!=null&&slow!=null){
            if(pre.val!=slow.val){
                return false;
            }
            pre = pre.next;
            slow = slow.next;
        }
        return true;

    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
         ListNode a=null;
         ListNode b=null;
        System.out.println(a==b);
//        List<Integer> list = new ArrayList<>();
//
//        list.add(12);
//        //这里直接添加会报错
//        list.add("a");
//        Class<? extends List> clazz = list.getClass();
//        Method add = clazz.getDeclaredMethod("add", Object.class);
//        //但是通过反射添加是可以的
//        //这就说明在运行期间所有的泛型信息都会被擦掉
//        add.invoke(list, "kl");
//        System.out.println(list);
    }

}
