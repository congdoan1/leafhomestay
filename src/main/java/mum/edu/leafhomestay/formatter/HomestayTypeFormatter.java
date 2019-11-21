package mum.edu.leafhomestay.formatter;

import mum.edu.leafhomestay.domain.HomestayType;
import mum.edu.leafhomestay.service.HomestayTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class HomestayTypeFormatter implements Formatter<HomestayType> {

    @Autowired
    HomestayTypeService homestayTypeService;

    @Override
    public HomestayType parse(String text, Locale locale) throws ParseException {
        return homestayTypeService.getHomestayType(Long.valueOf(text));
    }

    @Override
    public String print(HomestayType object, Locale locale) {
        return String.valueOf(object.getId());
    }
}
