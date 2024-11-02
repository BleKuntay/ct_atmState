package com.statemachinepattern;

public interface ATMState {
    void insertCard();
    void enterPin(int pinNumber);
    void requestMoney(int amount);
    void ejectCard();
}
