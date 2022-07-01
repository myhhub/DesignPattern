package com.mayaha.dp.memento;

//原发器创建一个备忘录,用以记录当前时刻它的内部状态。 使用备忘录恢复内部状态.。
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}