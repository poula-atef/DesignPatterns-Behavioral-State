package org.mycode.entities.state;

import org.mycode.entities.Phone;

public interface State {
    void pressPowerBtn();
    void pressHomeBtn();
    void setPhone(Phone phone);
}
