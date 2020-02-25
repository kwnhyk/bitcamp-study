package com.eomcs.lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;

import com.eomcs.lms.context.ApplicationContextListener;
import com.eomcs.lms.dao.mariadb.BoardDaoImpl;
import com.eomcs.lms.dao.mariadb.LessonDaoImpl;
import com.eomcs.lms.dao.mariadb.MemberDaoImpl;

// 애플리케이션이 시작되거나 종료될 때
// 데이터를 로딩하고 저장하는 일을 한다.
//
public class DataLoaderListener implements ApplicationContextListener {

  //List<Lesson> lessonList = new ArrayList<>();
 // List<Member> memberList = new ArrayList<>();
	public static Connection con;
  @Override
  public void contextInitialized(Map<String, Object> context) {
  

    // 애플리케이션이 시작되면 이 메서드가 호출될 것이고,
    // 이 메서드에서는 애플리케이션에서 사용할 데이터를 로딩하는 일을 한다.
   // loadLessonData();
   // loadMemberData();
    
    
    //애플리케이션의 데이터를 처리할 객체를 준비한다
   // LessonObjectFileDao lessonDao = new LessonObjectFileDao("./lesson.ser2");
    //MemberObjectFileDao memberDao = new MemberObjectFileDao("./member.ser2");
    // 데이터가 저장되어 있는 DAO 객체를 이 메서드를 호출한 쪽(App)에서
    // 사용할 수 있도록 Map 객체에 담아둔다.
    try {
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection( //
		    "jdbc:mariadb://localhost:3306/studydb", "study", "1111");
	

   
    context.put("boardDao", new BoardDaoImpl(con));
    context.put("lessonDao", new LessonDaoImpl(con));
    context.put("memberDao", new MemberDaoImpl(con));
	} catch (Exception e) {
		
		e.printStackTrace();
	}
  }

  @Override
  public void contextDestroyed(Map<String, Object> context) {
	  try {
		  con.close();
	  }catch(Exception e) {
		  
	  }
  //  System.out.println("데이터를 저장합니다.");

    // 애플리케이션이 종료되면 이 메서드가 호출될 것이고,
    // 이 메서드에서는 애플리케이션이 작업한 데이터를 저장하는 일을 한다.
   // saveLessonData();
   // saveMemberData();

  }

 
  /*@SuppressWarnings("unchecked")
  private void loadLessonData() {
    File file = new File("./lesson.ser2");

    try (ObjectInputStream in =
        new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      lessonList = (List<Lesson>) in.readObject();
      System.out.printf("총 %d 개의 수업 데이터를 로딩했습니다.\n", lessonList.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  private void saveLessonData() {
    File file = new File("./lesson.ser2");

    try (ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.writeObject(lessonList);
      System.out.printf("총 %d 개의 수업 데이터를 저장했습니다.\n", lessonList.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());
    }
  }

  @SuppressWarnings("unchecked")
  private void loadMemberData() {
    File file = new File("./member.ser2");

    try (ObjectInputStream in =
        new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      memberList = (List<Member>) in.readObject();
      System.out.printf("총 %d 개의 회원 데이터를 로딩했습니다.\n", memberList.size());

    } catch (Exception e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
    }
  }

  private void saveMemberData() {
    File file = new File("./member.ser2");

    try (ObjectOutputStream out =
        new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      out.writeObject(memberList);
      System.out.printf("총 %d 개의 회원 데이터를 저장했습니다.\n", memberList.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());
    }
  }

*/
 


}
