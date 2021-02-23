package test;

import java.util.Arrays;

<<<<<<< HEAD

static public boolean add(Object e) {

  public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elementDate;
    private int size;

    public MyArrayList() {
      elementDate = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapcity) {
      if (initialCapcity < DEFAULT_CAPACITY) {
        elementDate = new Object[DEFAULT_CAPACITY];
      } else {
        elementDate = new Object[initialCapcity];
      }    
    }

    public boolean add(Object e) {

      if (size == elementDate.length) {
        grow();
      }
      elementDate[size++] = e;
      return true;
=======
public class MyArrayList<E> {
  private static final int D = 5;
  private Object[] elementDate;
  private int size;

  public MyArrayList() {
    elementDate = new Object[D];
  }

  public MyArrayList(int initialCapacity) {
    if (initialCapacity < D) {
      elementDate = new Object[D];
    } else {
      elementDate = new Object[initialCapacity];
    } 
  }

  public boolean add(E e) {
    if (size == elementDate.length) {
      grow();
    }
    elementDate[size++] = e;
    return true;
  }

  private void grow() {
    System.out.println("배열 증가");
    int newCapacity = elementDate.length + (elementDate.length >> 1);
    elementDate = Arrays.copyOf(elementDate, newCapacity);
  }

  public void add(int index, E element) {
    if (size == elementDate.length) {
      grow();
    }
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스 유효하지 않다.");
    }
    for (int i = size; i > index; i--) {
      elementDate[i] = elementDate[i - 1];
    }
    elementDate[index] = element;
    size++;
  }


  @SuppressWarnings("unchecked")
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException("인덱스 유효하지 않다.");
>>>>>>> 70ae14bb96566658d5a4454f69b8e0ab0bbcdc85
    }

    static private void grow() {
      System.out.println("배열 늘리기");
      Object[] newArray = new Object[elementDate.length + (elementDate.length >>1)];
      for (int i = 0; i < elementDate.length; i++) {
        newArray[i] = elementDate[i];
      }
      elementDate = newArray;
    }
<<<<<<< HEAD

    static public void add (int index, Object element) {
      if (size == elementDate.length) {
        grow();
      }
      if (index < 0 || index > size) {
        throw new ArrayIndexOutOfBoundsException("인덱스 x");

        private void grow() {

          int newCapacity = elementDate.length + (elementDate.length >> 1);
          elementDate = Arrays.copyOf(elementDate, newCapacity); 
        }
        public void add (int index, Object element) {
          if (size == elementDate.length) {
            grow();
          }  
          if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("인덱스가 유효x");

          }
          for (int i = size; i > index; i--) {
            elementDate[i] = elementDate[i-1];
          }
          elementDate[index] = element;
          size++;
        }

        @suppressWarnings("unchecked") 
        public E get(int index) {
          if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("인덱스 유효 x");
          }
          return (E) elementDate[index];
        }

        @SuppressWarnings("unchecked")
        public E set(int index, E element) {
          if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("인덱스가 유효하지 않습니다.");
          }
          Object old = elementDate[index];
          elementDate[index] = element;
          return (E) old;
        }

        @SuppressWarnings("unchecked")
        public E remove(int index) {
          Object old = elementDate[index];

          System.arraycopy(
              elementDate, // 복사 대상
              index + 1, // 복사할 항목의 시작 인덱스
              elementDate, // 목적지
              index, // 복사 목적지 인덱스
              this.size - (index + 1) // 복사할 항목의 개수
              );

          size --;
          elementDate[size] = null;
          return (E) old;
        }
        public int size() {
          return this.size;
        }

        public Object[] toArray() {
          Object[] arr = Arrays.copyOf(elementDate, this.size);

          return arr;
        }
      }
=======
    Object old = elementDate[index];
    elementDate[index] = element;
    return (E) old;
  }

  @SuppressWarnings("unchecked")
  public E remove(int index) {

    Object old = elementDate[index];

    System.arraycopy(
        elementDate,
        index +1,
        elementDate,
        index,
        this.size - (index +1)
        );

    size--;
    elementDate[size] = null;

    return (E) old;
  }

  public int size() {
    return this.size;
  }

  public Object[] toArray() {
    Object[] arr = Arrays.copyOf(elementDate, this.size);
    return arr;

  }
  public E[] toArray(E[] arr) {
    if (arr.length < size) {
      return (E[]) Arrays.copyOf(this.elementDate, this.size, arr.getClass());
    }

    System.arraycopy(elementDate, 0, arr, 0, size);

    return arr;
  }
}
>>>>>>> 70ae14bb96566658d5a4454f69b8e0ab0bbcdc85
