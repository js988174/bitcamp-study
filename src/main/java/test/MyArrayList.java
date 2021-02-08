package test;

public class MyArrayList {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    elementDate[size++] = e;
    return true;
  }

  static public void add (int index, Object element) {
    for (int i = size; i > index; i--) {
      elementDate[i] = elementDate[i-1];
    }
    elementDate[index] = element;
    size++;
  }

  static public Object get(int index) {
    return elementDate[index];
  }

  static public Object set(int index, Object element) {
    Object old = elementDate[index];
    elementDate[index] = element;
    return old;
  }

  static public Object remove(int index) {
    Object old = elementDate[index];

    for (int i = index; i < size -1; i++) {
      elementDate[i] = elementDate[i + 1];
    }
    size --;
    return old;
  }
}
