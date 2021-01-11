package lianxi;

import java.util.*;

public class Jihe {
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2021);
//        list.add("河池学院");
//        list.add(1088);
//        list.add(38);
//        list.add(true);
//
//
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("当前输出的是："+ list.get(i));
//        }
//    }
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(2020);
        set.add("梧州学院");
        set.add("1088");
        set.add(38);
        set.add(1);
        set.add(38);

        //Set集合里的元素是无序的，不能用get()方法获取输出集合里的元素，所以需要用到迭代器
        Iterator iterator = set.iterator();


        for (int i = 0 ; i < set.size(); i++){
            while(iterator.hasNext()){             //以是否有下一个元素为判断条件
                System.out.println(iterator.next());
            }
        }
    }
}
