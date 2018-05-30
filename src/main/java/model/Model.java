package model;

public abstract class Model extends Object {
  public abstract Integer getId();

  public Boolean equals(Model object) {
    return this.toString().equals(object.toString());
  }

  public abstract String toString();
}
