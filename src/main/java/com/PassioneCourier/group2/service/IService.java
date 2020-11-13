package com.PassioneCourier.group2.service;

public interface IService<Type, ID> {

    Type create(Type t);
    Type read(String myID);
    Type update(Type t);
    boolean delete(Integer myID);
}
