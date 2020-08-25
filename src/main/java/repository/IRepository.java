package repository;

public interface IRepository<Type, ID> {

    Type create(Type t);
    Type read(ID myID);
    Type update(Type t);
    void delete(ID myID);

}
