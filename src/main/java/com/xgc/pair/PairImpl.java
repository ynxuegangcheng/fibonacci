package com.xgc.pair;

public class PairImpl implements Pair<Integer, Integer>{

    private Integer first;
    private Integer second;

    public PairImpl(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public Integer getFirst() {
        return first;
    }

    @Override
    public Integer getSecond() {
        return second;
    }
}
