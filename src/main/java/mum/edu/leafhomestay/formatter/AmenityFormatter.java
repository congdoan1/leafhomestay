package mum.edu.leafhomestay.formatter;

import mum.edu.leafhomestay.domain.Amenity;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class AmenityFormatter implements Formatter<Amenity> {
    @Override
    public Amenity parse(String text, Locale locale) throws ParseException {

        System.out.println("text " + text);
        return null;
    }

    @Override
    public String print(Amenity object, Locale locale) {
        return null;
    }
}
