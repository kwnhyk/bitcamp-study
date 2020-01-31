package com.eomcs.lmsst.context;

import java.util.Map;

public interface ApplicationContextListener {

	 // 애플리케이션이 시작될 때 호출된다.
	  void contextInitialized(Map<String,Object>context);

	  // 애플리케이션이 종료될 떄 호출된다.
	  void contextDestroyed(Map<String,Object>context);
	}