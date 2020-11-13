package com.PassioneCourier.group2.repository;
@Deprecated
public interface  IRepository<Type, ID> {

    Type create(Type t);
    Type read(ID myID);
    Type update(Type t);
    boolean delete(Integer myID);

}
