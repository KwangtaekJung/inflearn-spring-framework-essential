package com.example.inflearnspringframeworkessential;

import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

//@Component  // Thread-safe 하지 않기 때문에 이렇게 빈으로 등록해서 사용하면 안된다!!!
public class EventEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Event event = (Event) getValue();
        return event.getId().toString();
    }

    // 문자열을 Event 객체로 변환하면 되므로 사실상 setAsText만 구현하면 된다.
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
