package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

// DTO = Data Transfer Object = ��ſ��� ���� ����.
class UserDto {
	private int id;
	private String name;
}

public class String01 {

	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿";
		String s[] = data.split(","); // �и�
		String ss[] = s[0].split(":");


		UserDto setting = new UserDto(); // Ŭ����ȣ��

		int number = Integer.parseInt(ss[1]); // ���ڷ�

		setting.setId(number); // ����
		setting.setName(s[1]); // ����
		System.out.println("id:" + setting.getId()); // ���
		System.out.println(setting.getName());

		System.out.println();

		// �Ľ� parsing (�����м�)
//		UserDto dto = new UserDto();
//		dto.setId(1);
//		dto.setName("ȫ�浿");
//		System.out.println(dto);

	}

}