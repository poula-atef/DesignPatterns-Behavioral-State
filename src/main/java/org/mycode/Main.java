package org.mycode;

import org.mycode.entities.Phone;
import org.mycode.entities.state.PowerOffState;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setState(new PowerOffState());

        // power on the phone using home button
        phone.pressHomeBtn();
        // open menu
        phone.pressHomeBtn();
        // close menu
        phone.pressHomeBtn();
        // power off the phone
        phone.pressPowerBtn();
        // power on the phone using power button
        phone.pressPowerBtn();

    }
}