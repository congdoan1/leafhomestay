package mum.edu.leafhomestay.configuration;

import mum.edu.leafhomestay.formatter.AmenityFormatter;
import mum.edu.leafhomestay.formatter.BedTypeFormatter;
import mum.edu.leafhomestay.formatter.HomestayTypeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"mum.edu.leafhomestay.controller","mum.edu.leafhomestay.exception"})
@PropertySource(value = "classpath:application.properties")
public class Dispatcher extends WebMvcConfigurerAdapter {

    @Autowired
    Environment environment;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(environment.getProperty("staticResourceAlias"))
                .addResourceLocations(environment.getProperty("staticResourceLocation"));
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix(environment.getProperty("viewResolver.prefix"));
        bean.setSuffix(environment.getProperty("viewResolver.suffix"));
        return bean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("language");
        registry.addInterceptor(localeChangeInterceptor);
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver resolver = new SessionLocaleResolver();
        resolver.setDefaultLocale(new Locale("en"));
        return resolver;
    }

    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasenames("classpath:messages", "classpath:errorMessages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }

    @Bean(name = "validator")
    public LocalValidatorFactoryBean validator() {
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    @Override
    public Validator getValidator() {
        return validator();
    }



    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter( bedTypeFormatter());
        registry.addFormatter(homestayTypeFormatter());
        registry.addFormatter(amenityFormatter());
    }

    @Bean
    public BedTypeFormatter bedTypeFormatter() {
        return new BedTypeFormatter();
    }

    @Bean
    public HomestayTypeFormatter homestayTypeFormatter(){return new HomestayTypeFormatter();}

    @Bean
    public AmenityFormatter amenityFormatter(){return new AmenityFormatter();}

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver createMultipartResolver() {
        CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        resolver.setDefaultEncoding("utf-8");
        return resolver;
    }
}
