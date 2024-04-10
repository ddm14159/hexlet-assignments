package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// BEGIN
public class Validator {
    public static List<String> validate(Object object) {
        var result = new ArrayList<String>();

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            NotNull notNull = field.getAnnotation(NotNull.class);

            if (notNull != null) {
                try {
                    if (field.get(object) == null) {
                        result.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return result;
    }

    public static Map<String, List<String>> advancedValidate(Object object) {
        var result = new HashMap<String, List<String>>();

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            NotNull notNull = field.getAnnotation(NotNull.class);

            if (notNull != null) {
                try {
                    if (field.get(object) == null) {
                        var list = result.getOrDefault(field.getName(), new ArrayList<>());
                        list.add("can not be null");
                        result.put(field.getName(), list);
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }

            MinLength minLength = field.getAnnotation(MinLength.class);

            if (minLength != null) {
                try {
                    if (field.get(object).toString().length() < minLength.minLength()) {
                        var list = result.getOrDefault(field.getName(), new ArrayList<>());
                        list.add("length less than " + minLength.minLength());
                        result.put(field.getName(), list);
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        return result;
    }
}
// END
