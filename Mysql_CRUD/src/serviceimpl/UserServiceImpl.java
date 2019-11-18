package serviceimpl;

import dao.UserDAO;
import service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO dao = null;

	public UserServiceImpl(UserDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void createUserTable() {
		dao.createUserTable();
	}

	@Override
	public void registerUser(String id, String pw) {
		dao.registerUser(id, pw);
	}

	@Override
	public int login(String id, String pw) {
		return login(id, pw);
	}
	
	
}
