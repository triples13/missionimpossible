package com.learning.DistributedStore.Model;

import java.util.List;
import java.util.Map;

public class AttributeStore<T> {

   private final Map<String, List<T>> document;

    AttributeStore( Map<String, List<T>> document){
        this.document=document;
    }

    public Map<String, List<T>> getDocument() {
        return document;
    }
}
