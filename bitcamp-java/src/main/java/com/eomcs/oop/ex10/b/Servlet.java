// 인터페이스 문법을 사용하여 호출 규칙 정의
package com.eomcs.oop.ex10.b;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public interface Servlet {
  void service(ObjectInputStream in, ObjectOutputStream out) throws Exception;
}
