// 애노테이션 중복 사용  - 중복해서 사용할 애노테이션을 지정한다.
package com.eomcs.annotation.ex7;

// 반복에 대한 정보를 정의한 애노테이션을 지정해야 한다.

public @interface Employees {
  Employee[] value();
}


