package com.Excercises.Polymorphism.Excercise4;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class FieldGetter {

    public List<String> getPrivateFields(Object object) {

        Class itemClass = object.getClass();
        Field[] fields = itemClass.getDeclaredFields();
        List<String> list = new ArrayList<>();
        int i=0;
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPrivate(modifiers)) {
                list.add(field.getName());
                i++;
            }
        }
        Collections.sort(list);
        return list;
    }



}
