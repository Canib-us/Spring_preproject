package app.model;

import org.springframework.stereotype.Component;

@Component("dog")
public class Dog extends Animal{

    public String toString(){
        return "I'm a Dog";
    }
}


