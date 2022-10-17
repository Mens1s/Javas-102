package Z_Homeworks.Generic;

public class Array <T>{
    private T[] arr;
    private int idx = 0;
    private int capacity;

    public Array(){
        this.capacity = 10;
        this.arr = (T[])new Object[capacity];
    }

    public Array(int size){
        this.capacity = size + (10 - (size % 10));
        this.arr = (T[])new Object[capacity];
    }

    public int size(){return this.idx;}
    public int getCapacity(){ return this.capacity;}

    public void add(T data){
        if(this.idx == this.capacity){
            this.capacity += 10;
            T[] tempArr = (T[])new Object[this.capacity-10];
            tempArr = this.arr.clone();

            this.arr = (T[])new Object[this.capacity];

            int temp = 0;
            for(T item : tempArr){
                this.arr[temp] = item;
                temp += 1;
            }

            this.arr[this.idx]=data;
        }
        else
            this.arr[this.idx]=data;

        this.idx ++;
    }

    public T get(int index){
        if (this.idx > index){
            return this.arr[index];
        }
        return null;
    }

    public T remove(int index){
        if(index < this.idx){
            T t = this.arr[index];
            for(;index < this.idx ; index++)
                this.arr[index] = this.arr[index+1];

            this.idx --;
            return t;
        }
        return null;
    }

    public void set(int index, T data){
        if(this.idx > index)
            this.arr[index] = data;
    }

    @Override
    public String toString(){
        String res = "[";
        for(int idx = 0; idx < this.idx; idx++){
            if(idx == this.idx - 1){
                res += (this.arr[idx].toString());
            }
            else{
                res += (this.arr[idx].toString() + ",");
            }
        }

        res += "]";
        return res;
    }

    public int indexOf(T data){
        int idx = 0;
        for(T item:this.arr){
            if ( item == data)
                return idx;
            idx ++;
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for(int idx = this.idx-1; idx >= 0; idx--){
            if(this.arr[idx] == data)
                return idx;
        }
        return -1;
    }

    public boolean isEmpty(){
        return this.idx == 0;
    }

    public T[] toArray(){
        return this.arr.clone();
    }

    public void clear(){
        this.idx = 0;
        this.capacity = 10;
        this.arr = (T[]) new Object[this.capacity];
    }

    public Array<T> subList(int start, int finish){
        Array arr = new Array(finish-start+1);

        for(int idx = 0;start<=finish;start++, idx++){
            arr.add(this.arr[start]);
        }
        return arr;
    }

    public boolean contains(T data){
        return indexOf(data) != -1;
    }
}