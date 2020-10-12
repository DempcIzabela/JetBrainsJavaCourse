package com.Excercises.Polymorphism.Excercise3;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
class FieldGetter {

    public String[] getPublicFields(Object object) {

        Class itemClass = object.getClass();
        Field[] fields = itemClass.getDeclaredFields();
        List<String> list = new ArrayList<>();
        int i=0;
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                list.add(field.getName());
                i++;
            }
        }
        return list.toArray(new String[0]);
    }
}
