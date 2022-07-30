package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {


    private Person person;
    private List<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for(int i =0; i< personList.size(); i++){
            if(personList.get(i).getId()==id){
                return (E) personList.get(i);
            }
        }
        return (E) personList;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        for(int i = 0; i<this.personList.size(); i++){
            if(this.personList.get(i).getId() == id) {
                this.personList.remove(i);
            }
        }
    }

    public void removeAll() {
        personList.removeAll(personList);
    }

    abstract public E toArray();

    public Integer count() {
        return this.personList.size();
    }

    @Override
    public Iterator<E> iterator() {
         return (Iterator<E>) personList.iterator();
    }
}

