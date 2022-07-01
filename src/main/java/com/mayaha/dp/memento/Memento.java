package com.mayaha.dp.memento;

//备忘录存储原发器对象的内部状态
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}