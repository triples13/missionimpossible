package com.learning.DistributedStore.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyStore<T> {

    private  Map<String,AttributeStore > dataStore;
    private  AttributeStore<T> attributeStore;
    private  Map<String,List<T>> attributes;

     KeyStore(String key,String atrributeKey,T value)
     {

         this.attributes = new HashMap<>();
         this.attributeStore = new AttributeStore<>(attributes);
         init(key,atrributeKey,value);

     }

     private void init(String key,String attributeKey,T Value){


         if(dataStore==null)
             dataStore= new HashMap<>();
         else
         {

             if(dataStore.containsKey(key)){
                 if(checkIfAttributeKeyIsPresent(attributeKey)){
                     // first entry for an attribute


                 }
                 else{


                     if(checkIfFirstEntry(attributeKey))
                     {
                    //     attributeStore.getDocument().put(attributeKey,Value);
                     }
                 }
             }
             else{



             }
         }
     }

     private Object checkDataType(AttributeStore<T> attributeStore,T value){



         if(value.getClass()==Integer.class)
             return (Object) Integer.class;

         else if(value.getClass() == Float.class)
             return (Object)Float.class;
         else if (value.getClass() == Double.class)
             return (Object) Double.class;
         else if( value.getClass() == String.class)
              return (Object)String.class;
         else
             throw new IllegalArgumentException("data type not withing bound");
     }

     private boolean checkIfAttributeKeyIsPresent(String attributeKey){

         return attributeStore.getDocument().containsKey(attributeKey);
     }

     private boolean checkIfFirstEntry(String attributeKey){

         List<T> attributeProperties = attributeStore.getDocument().get(attributeKey);

         if(attributeProperties==null)
             return true;

         return false;
     }
}
