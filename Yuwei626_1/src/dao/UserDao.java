package dao;

import user.User;

public interface UserDao {
	void save(User user);      //����û�
	void delete(User user);    //ɾ���û�
	void update(User user);    //�޸��û���Ϣ
	User findById(int id);     //�����û���ʶ����ָ���û�

}
