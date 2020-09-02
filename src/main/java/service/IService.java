package service;

public interface IService<Type, ID> {

    Type create(Type t);
    Type read(Integer myID);
    Type update(Type t);
    boolean delete(Integer myID);
}
