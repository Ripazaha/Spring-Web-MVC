package ru.netology.model;

public class Post {
  private long id;
  private boolean removed;

  public Post() {
  }

  public Post(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public boolean isRemoved() {
    return removed;
  }

  public void setRemoved(boolean removed) {
    this.removed = removed;
  }
}
