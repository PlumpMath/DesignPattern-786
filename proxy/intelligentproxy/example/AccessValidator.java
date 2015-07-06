package zjj.dp.proxy.intelligentproxy.example;

public class AccessValidator {
	public boolean validate(String userid,String password) {
		if(userid.equalsIgnoreCase("zjj")&&password.equals("111")) {
			return true;
		}else {
			return false;
		}
	}
}
