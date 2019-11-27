package cn.test.module;




import java.util.ArrayList;

public class HelloJava {
    public static void main(String[] args){
        System.out.println("hello java!" );
        ArrayList list = new ArrayList();
//        arraylist list1 = new arraylist();
        System.out.println("OK");
        int num = 1;
        System.out.println(num);

        String[] strs = new String[]{"aaa", "bbb", "ccc"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
        for (String str : strs) {
            System.out.println(str);
        }
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

        }
        System.out.println(num);
        ArrayList list11 = new ArrayList();
        list.add("aa");
        list.add(1);
        list.add(1.2);
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (Object o : list) {
            
        }


    }

    public static void func(){

    }

}
