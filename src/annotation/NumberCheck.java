package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // INTERVIEW QUESTION! Where the annotation will be seen (in RunTime, while the program is running)
public @interface NumberCheck {
    int min();
    int max();
}
