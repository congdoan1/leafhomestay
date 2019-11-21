package mum.edu.leafhomestay.formatter;

import mum.edu.leafhomestay.domain.BedType;
import mum.edu.leafhomestay.service.BedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

public class BedTypeFormatter implements Formatter<BedType> {

    @Autowired
    BedTypeService bedTypeService;

    @Override
    public BedType parse(String text, Locale locale) throws ParseException {
        long id = Long.valueOf(text);

        return bedTypeService.getBedType(id);
    }

    @Override
    public String print(BedType object, Locale locale) {
        return String.valueOf(object.getId());
    }
}
