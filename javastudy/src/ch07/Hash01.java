package ch07;

import java.util.HashMap;

public class Hash01 {

	public static void main(String[] args) {
		//해쉬맵은 key,value 로 값을 입력할 수있음
		//찾을때는 key 값으로 찾을수있음.
		HashMap<String,String> hash = new HashMap<>();
		
		hash.put("name","홍길동");
		hash.put("username", "ssar");
		hash.put("phone","010111111");
		
		System.out.println(hash.get("Phone"));
		System.out.println(hash.containsKey("name"));
		System.out.println(hash.containsValue("홍길동"));
	}

}
