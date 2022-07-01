package com.mayaha.dp.memento;

import java.util.ArrayList;
import java.util.List;

// 负责保存好备忘录。 不能对备忘录的内容进行操作或检查。
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}