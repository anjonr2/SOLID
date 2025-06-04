package com.solidprinciples.InterfaceSegregationPrinciple.example1.badcode;

public class DBStore implements Store {

    @Override
    public void save() {
        // Implementation for saving data to the database
        System.out.println("Data saved to the database.");
    }

    @Override
    public void delete() {
        // Implementation for deleting data from the database
        System.out.println("Data deleted from the database.");
    }

    @Override
    public void update() {
        // Implementation for updating data in the database
        System.out.println("Data updated in the database.");
    }

    @Override
    public void fetch() {
        // Implementation for fetching data from the database
        System.out.println("Data fetched from the database.");
    }

    @Override
    public void addKey() {
        // Implementation for adding a key to the database
        System.out.println("Key added to the database.");
    }

    @Override
    public void removeKey() {

    }

    @Override
    public void evict() {

    }
}
