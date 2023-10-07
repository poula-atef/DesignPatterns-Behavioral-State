package org.mycode.entities;

import org.mycode.entities.state.State;

public class Phone {
    private State state;

    public void setState(State state) {
        this.state = state;
        state.setPhone(this);
    }

    public void pressPowerBtn() {
        state.pressPowerBtn();
    }

    public void pressHomeBtn() {
        state.pressHomeBtn();
    }
}
