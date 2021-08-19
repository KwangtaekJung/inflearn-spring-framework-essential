package com.example.inflearnspringframeworkessential;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

//@Component // 빈으로 바로 등록해서 사용 가능
public class EventFormatter implements Formatter<Event> {

    // MessageSource를 통해 locale 정보를 받아서 처리도 가능하지만 예제에서는 사용하지는 않는다.
    @Autowired
    MessageSource messageSource;

    @Override
    public Event parse(String s, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(s));
    }

    @Override
    public String print(Event event, Locale locale) {
        return event.getId().toString();
    }
}
