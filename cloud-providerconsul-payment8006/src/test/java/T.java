import lombok.Data;
import org.springframework.cglib.beans.BeanMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author wangyh2
 * @version v1.0
 * @since 2020-12-10 17:05
 */
public class T {
    private static final Map<Integer, String> INT_STRING = new HashMap<>();

    static {
        INT_STRING.put(0, "name");
        INT_STRING.put(1, "age");
        INT_STRING.put(2, "idCard");
    }

    public static void main(String[] args) {
        String str = "11-222-3333-4444";
        String[] splitStr = str.split("-");
        Person person = new Person();
        BeanMap beanMap = BeanMap.create(person);
        LongAdder longAdder = new LongAdder();
        List<String> arr = Arrays.stream(splitStr)
                .filter(s -> INT_STRING.containsKey(longAdder.intValue()))
                .map(s -> {
                    beanMap.put(INT_STRING.get(longAdder.intValue()), s);
                    longAdder.increment();
                    return s;
                }).collect(Collectors.toList());
        System.out.println(person);
    }

    @Data
    static class Person {
        String name;
        String idCard;
    }
}
