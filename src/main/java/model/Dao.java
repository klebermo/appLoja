package model;

import java.util.List;
import java.util.ArrayList;

public abstract class Dao<E> {
  private Class<E> entityClass;

  public Dao(Class<E> entityClass) {
    this.entityClass = entityClass;
  }

  public Class<E> getEntityClass() {
    return entityClass;
  }

  public void insert(E object) {
    //
  }

  public void update(E object) {
    //
  }

  public void delete(E object) {
    //
  }

  public List selectAll() {
    return new ArrayList<E>();
  }

  public List selectBy(String key, Object value) {
    return new ArrayList<E>();
  }
}
