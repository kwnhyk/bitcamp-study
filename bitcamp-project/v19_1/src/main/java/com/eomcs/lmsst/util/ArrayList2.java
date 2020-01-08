package com.eomcs.lmsst.util;

import java.util.Arrays;

public class ArrayList2<E>{
    Object[] elementDate;
    private static final int DEFAULT_CAPACITY=10;
    int size;



public ArrayList2(){
this.elementDate = new Object[DEFAULT_CAPACITY];

}
public ArrayList2(int init){
    if(init <DEFAULT_CAPACITY){
    this.elementDate = new Object[DEFAULT_CAPACITY];
    }else{

    this.elementDate = new Object[init];
    }




}
public void add(E e){
    if(this.size ==this.elementDate.length){
        int oldCapacity = this.elementDate.length;
        int newCapacity = oldCapacity+(oldCapacity >>1);

        Object[] arr = new Object[newCapacity];
        for(int i = 0; i<this.size; i++){

            arr[i]=this.elementDate[i];
        
        }

    }
this.elementDate[this.size++] =e;


}
public E get(int index){
    if(index <0 || index>=this.size){
        return null;
    }
    return (E)this.elementDate[index];

}
public E set(int index ,E e){
    if(index<0|| index>=this.size){
        return null;
    }
    E old = (E)this.elementDate[index];

    this.elementDate[index] = e;

    return old;

}
public E remove(int index){
    if(index <0 || index>this.size){
        return null;
    }

    E old = (E)this.elementDate[index];
    System.arraycopy(this.elementDate, index+1 ,this.elementDate
    , index,this.size-(index+1));

/*
for(int i =index+1 ; i <this.size;i++){

    this.elementDate[i-1]= this.elementDate[i];

}
*/
this.size--;
return old;
}
public Object[] toArray(){

return Arrays.copyOf(this.elementDate, this.size);
/*
Object[] arr = new Object[this.size];
for(int i =0; i<this.size;i++){
    arr[i] = this.elementDate[i];

}
return arr;
*/
}
public E[] toArray(E[] arr){
    if(arr.length < this.size){
        return (E[])Arrays.copyOf(this.elementDate,this.size,arr.getClass());

    }
    
  System.arraycopy(this.elementDate, 0 , arr, 0, this.size);

return arr;

    }




public int size(){
    return this.size;
}
}