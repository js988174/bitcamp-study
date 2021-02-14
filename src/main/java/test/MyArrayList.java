package test;

public class MyArrayList {
  static Object[] elementDate = new Object[5];
  static int size;

  static public boolean add(Object e) {
    if (size == elementDate.length) {
      grow();
    }
    elementDate[size++] = e;
    return true;
  }

  static private void grow() {
    System.out.println("배열 늘리기");
    Object[] newArray = new Object[elementDate.length + (elementDate.length >>1)];
    for (int i = 0; i < elementDate.length; i++) {
      newArray[i] = elementDate[i];
    }
    elementDate = newArray;
  }

  static public void add (int index, Object element) {
    if (size == elementDate.length) {
      grow();
    }
    if (index < 0 || index > size) {
      throw new ArrayIndexOutOfBoundsException("인덱스 x");
    }
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
