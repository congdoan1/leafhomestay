package mum.edu.leafhomestay.exception;

import org.springframework.stereotype.Component;

@Component
public class HomestayNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -694354952032299587L;

    private Long homestayId;
    private String message = "Homestay Not Found for this ID ";

//	@Autowired
//	private ReloadableResourceBundleMessageSource messages;

////	@Autowired
//	public void setMessageSource(MessageSource messageSource) {
//	  this.messageSource = (ReloadableResourceBundleMessageSource((DelegatingMessageSource)messageSource).getParentMessageSource();
//	}

//	@Autowired
//	MessageSource messages;

    public HomestayNotFoundException() {
    }

    public HomestayNotFoundException(Long homestayId, String message) {
        this.homestayId = homestayId;
        Object[] parameters = {homestayId};

        if (message != null) this.message = message;

//		String exMessage = this.messages.getMessage(message, parameters,  null);		

    }

    public String getFullMessage() {
        return (message + homestayId);
    }

    public Long getHomestayId() {
        return homestayId;
    }

}
