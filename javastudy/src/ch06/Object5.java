package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //���ͼ���,toString
@AllArgsConstructor //Ǯ ������
@NoArgsConstructor //����Ʈ ������
class User3{
	private int id;
	private String username;
}



public class Object5 {

	public static void main(String[] args) {
		User3 user = new User3(1,"ssar");
		System.out.println(user.toString());

	}

}