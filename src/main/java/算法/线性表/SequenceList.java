package 算法.线性表;

import java.util.Iterator;

public class SequenceList<T> implements Iterable {
    private T[] eles;
    private int N;

    public SequenceList(int capacity){
        this.eles=(T[])new Object[capacity];
        this.N=0;
    }
    public void clear(){
        this.N=0;
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int length(){
        return N;
    }
    public T get(int i){
        return eles[i];
    }
    public void insert(T t){
        if (N==eles.length){
            resize(eles.length*2);
        }
     eles[N++]=t;
    }
    public void insert(int i,T t){
        if (N==eles.length){
            resize(eles.length*2);
        }
        N++;
        for (int index = N; index >i; index--) {
            eles[index]=eles[index-1];
        }
        eles[i]=t;
    }
    public T remove(int i){
     T current=eles[i];
        for (int index = i; index <= N - 1; index++) {
            eles[index]=eles[index+1];
        }
        N--;
        if (N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }
    public void resize(int newSize){
     T[] temp=eles;
     eles=(T[]) new Object[newSize];
        for (int i = 0; i < N; i++) {
            eles[i]=temp[i];
        }
    }
    public int indexOf(T t){
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new Siterator();
    }
    private class Siterator implements Iterator{
        private int cusor;
        public void SIterator(){
            this.cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }
        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
}
