package ifsantana.outbound.factories.interfaces;

public interface Factory<O, I> {
  O create(I input);
}
