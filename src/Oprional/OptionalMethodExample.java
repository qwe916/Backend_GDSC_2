package Oprional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalMethodExample {
    public static void main(String[] args) {
        MyData lee = new MyData();
        lee.setMyAge(24);
        lee.setMyName("Lee");

        //filter
        Optional<MyData> leeOpt = Optional.of(lee);
        System.out.println(leeOpt.filter(a -> a.getMyAge() == 24));
        //Map
        System.out.println(leeOpt.map(s -> s.getMyName().toUpperCase()));
        //Get
        System.out.println(leeOpt.map(s -> s.getMyName().toUpperCase()).get());
        //isPresent
        System.out.println(leeOpt.isPresent());
        //ifPresent
        leeOpt.ifPresent(System.out::println);

    }
}
