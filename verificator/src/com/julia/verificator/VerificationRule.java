package com.julia.verificator;

public interface VerificationRule<E> {

    public void matches(E o) throws VerificationException;
}
