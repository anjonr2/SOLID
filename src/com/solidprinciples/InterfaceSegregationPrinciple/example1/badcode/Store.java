package com.solidprinciples.InterfaceSegregationPrinciple.example1.badcode;

public interface Store {
    public void save();
    public void delete();
    public void update();
    public void fetch();
    public void addKey();
    public void removeKey();
    public void evict();
}
