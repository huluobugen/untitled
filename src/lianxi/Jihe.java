package lianxi;

import java.util.*;

public class Jihe {
//    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(2021);
//        list.add("�ӳ�ѧԺ");
//        list.add(1088);
//        list.add(38);
//        list.add(true);
//
//
//        for (int i = 0; i < list.size(); i++){
//            System.out.println("��ǰ������ǣ�"+ list.get(i));
//        }
//    }
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(2020);
        set.add("����ѧԺ");
        set.add("1088");
        set.add(38);
        set.add(1);
        set.add(38);

        //Set�������Ԫ��������ģ�������get()������ȡ����������Ԫ�أ�������Ҫ�õ�������
        Iterator iterator = set.iterator();


        for (int i = 0 ; i < set.size(); i++){
            while(iterator.hasNext()){             //���Ƿ�����һ��Ԫ��Ϊ�ж�����
                System.out.println(iterator.next());
            }
        }
    }
}
