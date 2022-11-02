package lamda;

import java.util.*;

public class LamdaWithCollection {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("C");

        /*
        * 역순으로 정렬..
        Collections.sort(myList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        */

        /*
        * 람다 형식으로 불필요한 코드를 제거하여 간결하게 코드 작성
        Collections.sort(myList,(s1,s2) -> s2.compareTo(s1));
        * */

        //참조 표현으로 교체(사전순)
        Collections.sort(myList,String::compareTo);
        for (String s : myList
        ) {
            System.out.println("s = " + s);
        }
    }
}
