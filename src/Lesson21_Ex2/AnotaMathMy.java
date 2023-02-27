package Lesson21_Ex2;

import java.lang.annotation.Documented;

@Documented
public @interface AnotaMathMy {
    int first() default 0;
    int second() default 0;
}
