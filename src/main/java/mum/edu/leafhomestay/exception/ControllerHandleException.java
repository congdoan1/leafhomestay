package mum.edu.leafhomestay.exception;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Component
@ControllerAdvice
public class ControllerHandleException {

    public static final String DEFAULT_ERROR_VIEW = "404";
    public static final String DEFAULT_ACCESS_DENIED = "forbidden";


    @ExceptionHandler(value = AccessDeniedException.class)
    public String accessDenied() {
        return DEFAULT_ACCESS_DENIED;
    }

    @ExceptionHandler(HomestayNotFoundException.class)
    public ModelAndView handleError(HttpServletRequest req, HomestayNotFoundException exception) {
        ModelAndView mav = new ModelAndView();
        System.out.println("handle homestay not found");
//        mav.addObject("invalidHomestayId", exception.getFullMessage());
        mav.setViewName("404");
        return mav;
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception ex) throws Exception {

        if (AnnotationUtils.findAnnotation(ex.getClass(), ResponseStatus.class) != null) {
            throw ex;
        }

        ModelAndView mow = new ModelAndView();
        mow.addObject("exception", ex);
        mow.addObject("url", request.getRequestURI());
        mow.setViewName(DEFAULT_ERROR_VIEW);

        return mow;
    }
}
