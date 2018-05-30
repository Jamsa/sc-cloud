package com.github.jamsa.sc.base.entity;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;


public class BaseEntity implements Serializable{
    private Set<String> changedProperties = null;
    public Set<String> getChangedProperties(){
        synchronized(this){
            if(changedProperties ==null){
                changedProperties = new HashSet();
            }
        }
        return changedProperties;
    }
}
