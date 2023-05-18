package assignment4;

import assignment4.Course;
import assignment4.Gender;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static assignment4.app.reduceL;

public class Assignment4 {
    static Student[] students = new Student[]{
            Student.of("Ahmad", 20, Gender.MALE, true, Course.MATH, Course.CHEMISTRY, Course.JAVA),
            Student.of("Mohammad", 25, Gender.MALE, true, Course.MATH, Course.JAVA),
            Student.of("ESA", 27, Gender.MALE, false, Course.MATH, Course.JAVA),
            Student.of("ESRA", 19, Gender.FEMALE, true, Course.MATH, Course.ENGLISH),
            Student.of("DANA", 40, Gender.FEMALE, true, Course.MATH, Course.ENGLISH, Course.PHYSICS),
            Student.of("RUBA", 22, Gender.FEMALE, true, Course.MATH, Course.PHYSICS)

    };

    public static void main(String[] args) {

        // 1
        List<Integer> ages = Stream.of(students)
                .map(Student::getAge)
                .collect(Collectors.toList());

        System.out.println("ages are:" + ages);

        //2
        Map<Boolean, List<Student>> collect1 = Stream.of(students).collect(groupingBy(s -> s.getAge() >= 20));

        System.out.println("Students with age equal or greater than 20\n" + collect1.get(true));
        System.out.println("Students with age less than 20\n" + collect1.get(false));


        //3
        List<String> strings = toList("abood", "mohammad");
        System.out.println(strings);
        List<Integer> integers = toList(1, 3, 4, 5, 6);
        System.out.println(integers);

        //4
        Map agesMap = groupArray(students,s-> s.getAge() >=20, s->s.getAge());
        System.out.println(agesMap);


  }


    //3
    public static <T> List<T> toList(T... data) {

        return reduceL(new ArrayList<T>(),
                acc -> e -> {
            acc.add(e);
            return acc;
        }, data);
    }


    //4
    public static <T, Key, Value> Map<Key, List<Value>> groupArray(T[] array, Function<T, Key> keyExtractor,
                                                                   Function<T, Value> valueExtractor) {
        Map<Key, List<Value>> resultMap = new HashMap<>();
        for (T item : array) {
            Key key = keyExtractor.apply(item);
            Value value = valueExtractor.apply(item);
            resultMap.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        }
        return resultMap;
    }
}