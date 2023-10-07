package org.mycode.entities.state;

import org.mycode.entities.Phone;

public class MenuOpenedState implements State {
    private Phone phone;

    @Override
    public void pressPowerBtn() {
        System.out.println("Phone Now In Powered Off..");
        phone.setState(new PowerOffState());
    }

    @Override
    public void pressHomeBtn() {
        System.out.println("Phone Now On Desktop..");
        phone.setState(new PowerOnState());
    }

    @Override
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
}
