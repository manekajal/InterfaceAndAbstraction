package org.gernricinterface;

public class MyClass<T extends Comparable<T> >
        implements MinMax<T>
{
    // Member variable of 'MyClass' class
    T[] values;
    // Constructor of 'MyClass' class
    MyClass(T[] obj) { values = obj; }


    @Override
    public T min() {
        T obj = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(obj) < 0)
                obj = values[i];


        return obj;
    }

    @Override
    public T max() {
        T obj = values[0];
        for (int i = 1; i < values.length; i++)
            if (values[i].compareTo(obj) > 0)
                obj = values[i];


        return obj;

    }
}
