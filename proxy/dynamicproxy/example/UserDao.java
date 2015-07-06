package zjj.dp.proxy.dynamicproxy.example;

public class UserDao implements IUserDao {

	@Override
	public Boolean findUserById(String userid) {
		if(userid.equals("zjj")) {
			System.out.println("查询"+userid+"信息成功");
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteUserById(String userid) {
		if(userid.equals("zzz")) {
			System.out.println("成功删除"+userid+"信息");
			return true;
		}
		return false;
	}

}
