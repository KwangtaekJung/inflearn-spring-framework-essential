package com.example.inflearnspringframeworkessential;


import org.springframework.core.convert.converter.Converter;

public class EventConverter {

    //@Component // 빈으로 바로 등록해서 사용 가능
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String s) {
            return new Event(Integer.parseInt(s));
        }
    }

    //@Component // 빈으로 바로 등록해서 사용 가능
    public static class EventToString implements Converter<Event, String> {
        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
