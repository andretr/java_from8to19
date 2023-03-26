package com.mitocode.sealed;

public abstract sealed class Car permits Subaru, Toyota{

    abstract void run();
}
