package App;

import service.UserService;
import dao.UserDAO;
import serviceimpl.UserServiceImpl;
import vo.UserVO;

public class UserAPP {

	public static void main(String[] args) {

		UserDAO dao = new UserDAO();
		UserService service = new UserServiceImpl(dao);
		System.out.println("START");
		// 테이블 생성
//		dao.createUserTable();

		// 회원 등록
//		dao.registerUser("root", "1234");
//
		if (dao.login("root", "1234") == 1) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		System.out.println("END");
	}
}
