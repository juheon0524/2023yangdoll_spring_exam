package com.juheon.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieBox {
	private Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
	
	
	// JSP에서 요청객체를 넘겨주면서 쿠키박스를 생성해야 한다. => 해당 클라이언트의 모든 쿠키를 맵에 담는다.
	public CookieBox(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i < cookies.length; i+=1) {
				cookieMap.put(cookies[i].getName(), cookies[i]);
			}
		}
	}
	// 쿠키를 읽어 오는 메서드(인스턴스 메서드)
	public Cookie getCookie(String cookieName) {
		return cookieMap.get(cookieName);
	}
	// 쿠키 이름을 통해서 쿠키의 값만을 읽어오는 메서드(인스턴스 메서드)
	public String getValue(String cookieName) {
		Cookie cookie = cookieMap.get(cookieName);
		if(cookie != null) {
			return cookie.getValue();
		}
		return null;
	}
	// 쿠키 이름에 해당하는 쿠키의 존재 유무를 확인하는 메서드(인스턴스 메서드)
	public boolean exists(String cookieName) {
		return cookieMap.get(cookieName) != null;
	}
	// 쿠키이름 목록을 반환하는 메서드
	public /* Set<String> */ List<String> getCookieNames(){
		/* return cookieMap.keySet(); */
		return new ArrayList<String>(cookieMap.keySet());
		//List로 반환할 수도 있다. => return new ArrayList<String>(cookieMap.keySet());
	}
	
	// 쿠키를 만드는 기능의 정적 메서드들 ...
	public static Cookie createCookie(String cookieName, String cookieValue) {
		return new Cookie( cookieName, cookieValue );
	}
	
	public static Cookie createCookie(String cookieName, String cookieValue, int maxAge, String path) {
		Cookie cookie = new Cookie( cookieName, cookieValue );
		cookie.setMaxAge(maxAge);
		cookie.setPath(path);
		return cookie;
	}
	
	public static Cookie createCookie(String cookieName, String cookieValue, int maxAge, String path, String domain) {
		Cookie cookie = createCookie(cookieName, cookieValue, maxAge, path);
		cookie.setDomain(domain);
		return cookie;
	}
	
}
