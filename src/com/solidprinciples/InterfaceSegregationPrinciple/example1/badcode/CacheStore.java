package com.solidprinciples.InterfaceSegregationPrinciple.example1.badcode;

public class CacheStore implements Store{
    @Override
    public void save() {
        //not needed for CacheStore
    }

    @Override
    public void delete() {
        //not needed for CacheStore
    }

    @Override
    public void update() {
        //not needed for CacheStore
    }

    @Override
    public void fetch() {
        //not needed for CacheStore
    }

    @Override
    public void addKey() {
     System.out.println("Key added to the cache store.");
    }

    @Override
    public void removeKey() {
        System.out.println("Key removed from the cache store.");
    }

    @Override
    public void evict() {
        System.out.println("Cache store evicted.");
    }
}
