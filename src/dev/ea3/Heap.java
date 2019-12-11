package dev.ea3;

public class Heap {
    private int [] heap;
    private int size;

    public Heap(int capacity){
        heap = new int[capacity];
    }

    public void insert (int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size ++] = value;
    }

    public boolean isFull(){
        return size == heap.length;
    }

    public int getParent (int index){
        return (index - 1) / 2;
    }

}
