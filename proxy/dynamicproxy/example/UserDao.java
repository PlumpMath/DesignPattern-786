package zjj.dp.proxy.dynamicproxy.example;

public class UserDao implements IUserDao {

	@Override
	public Boolean findUserById(String userid) {
		if(userid.equals("zjj")) {
			System.out.println("��ѯ"+userid+"��Ϣ�ɹ�");
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteUserById(String userid) {
		if(userid.equals("zzz")) {
			System.out.println("�ɹ�ɾ��"+userid+"��Ϣ");
			return true;
		}
		return false;
	}

}
