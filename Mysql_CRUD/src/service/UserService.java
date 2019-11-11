package service;


public interface UserService {
	public void createUserTable();
	public void registerUser(String id, String pw);
	public int login(String id, String pw);
}
