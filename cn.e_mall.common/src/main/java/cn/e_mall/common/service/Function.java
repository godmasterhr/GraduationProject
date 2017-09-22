package cn.e_mall.common.service;

public interface Function<E, T> {

    public T execute(E e);

}
