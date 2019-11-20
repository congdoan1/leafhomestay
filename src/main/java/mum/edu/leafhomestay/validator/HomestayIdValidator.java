package mum.edu.leafhomestay.validator;

import mum.edu.leafhomestay.domain.Homestay;
import mum.edu.leafhomestay.exception.HomestayNotFoundException;
import mum.edu.leafhomestay.service.HomestayService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HomestayIdValidator implements ConstraintValidator<HomestayId, Long> {

    @Autowired
    private HomestayService homestayService;

    public void initialize(HomestayId constraintAnnotation) {
        //  intentionally left blank; this is the place to initialize the constraint annotation for any sensible default values.
    }

    public boolean isValid(Long value, ConstraintValidatorContext context) {
        Homestay homestay;
        try {
            homestay = homestayService.getHomestayById(value);

        } catch (HomestayNotFoundException e) {
            return true;
        }

        if (homestay != null) {
            return false;
        }

        return true;
    }

}
