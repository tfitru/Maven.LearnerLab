package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People<E> implements Iterable<E> {

    private Person person;

    private List<Person> personList = new ArrayList<>();

    public void add() {
        personList.add(person);
    }

    public Long findById(long id){
        return person.getId();
    }

    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        } else
            return false;
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(id);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }


    @Override
    public Iterator<E> iterator() {
        Iterator<Person> listIterator = personList.listIterator();
        return null;
    }
}
