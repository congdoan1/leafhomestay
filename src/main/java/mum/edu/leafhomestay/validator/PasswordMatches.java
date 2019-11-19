package mum.edu.leafhomestay.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;

@Documented
@Constraint(validatedBy = PasswordMatchesValidator.class)
@Target({TYPE,ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatches {
    String message() default "Passwords does not match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
