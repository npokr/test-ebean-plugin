package ru.pokr;

import org.slf4j.Logger;
import org.testng.annotations.Test;

import java.lang.reflect.Field;

public class FourthTest {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FourthTest.class);

    @Test
    public static void testMeta() throws Exception {
        Class<?> clazz = Fourth.class;
        while (!clazz.equals(Object.class)) {
            Field field = clazz.getField("_ebean_props");
            String[] props = (String[]) field.get(null);
            StringBuilder sb = new StringBuilder(clazz.getName());
            sb.append(": ");
            for (int i = 0; i < props.length; i++) {
                sb.append(props[i]);
                sb.append(", ");
            }
            log.info(sb.toString());
            clazz = clazz.getSuperclass();
        }
    }
}