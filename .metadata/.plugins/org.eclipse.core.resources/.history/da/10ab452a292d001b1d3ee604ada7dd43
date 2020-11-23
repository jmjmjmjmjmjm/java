package dh07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class ResponseDto<K> {
	private int statusCode; // 200(성공),300(다시요청해),400(잘못된요청)
	private K data;
}

class Dog{
	String name = "안녕";
}


public class Generic01 {

	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());
		
		
		if (dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
		
	}
	
	
}
