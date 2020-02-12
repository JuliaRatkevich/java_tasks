package com.julia.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OurHashSet<E> implements OurSet<E> {

    private final static Object INSTANCE = new Object();
    private Map<E, Object> source;

    public OurHashSet() {
        this.source = new HashMap<>();
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public boolean add(E elt) {
        return source.put(elt, INSTANCE) == null;
    }

    @Override
    public boolean remove(E elt) {
        return source.remove(elt) != null;
    }

    @Override
    public boolean contains(E elt) {
        return source.containsKey(elt);
    }

    @Override //сделано в классе
    public boolean addAll(OurSet<E> other) {
        OurHashSet<E> narrowedOther = (OurHashSet<E>) other;

        boolean res = false;
        for (E elt : narrowedOther.source.keySet()) {
            res |= this.add(elt);
//            res =  this.add(elt) | res;
        }

        return res;
    }

    @Override
    public boolean removeAll(OurSet<E> other) {
        OurHashSet<E> narrowedOther = (OurHashSet<E>) other;

        boolean res = false;
        for (E elt : narrowedOther.source.keySet()) {
            res |= this.remove(elt);
        }
        return res;
    }

//    @Override
//    public boolean retainAll(OurSet<E> other) {
//        OurHashSet<E> narrowedOther = (OurHashSet<E>) other;
//        boolean res = false;
//        for (E elt : this.source.keySet()) {
//            if (narrowedOther.contains(elt)) {
//                continue;
//            } else {
//                this.remove(elt);
//                res = true;
//            }
//        }
//
//        return res;
//    }

    @Override
    public boolean retainAll(OurSet<E> other) {
        boolean res = false;
        OurSet<E> thisMinusOther = new OurHashSet<>();

        for (E elt : this) {
            if (!other.contains(elt))
                thisMinusOther.add(elt);
        }

        return this.removeAll(thisMinusOther);
    }

    @Override
    public Iterator<E> iterator() {           //что бы OurHashSet стал iterable
        return source.keySet().iterator();
    }
}



