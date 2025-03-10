package org.example.streamAPIS;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Introduction {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,23,13,4,2424,45);
        list.forEach(n -> System.out.println(n));

        Stream<Integer> listStream=list.stream();
          // long count= listStream.count();
           //System.out.println(count);
       // listStream.forEach(n -> System.out.println(n));
       // listStream.forEach(n -> System.out.println(n));//Streams once used can't consume again : Stream has already been operated upon or close

        //Stream<Integer> mapData=listStream.map(n->n *2);

        //mapData.forEach(n -> System.out.println(n));

        //Double the values in the list

        Predicate<Integer> predi=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==1;
            }
        };

       list.stream().filter(predi).sorted().map(n-> n*2).forEach(n-> System.out.println(n));

    }
}
