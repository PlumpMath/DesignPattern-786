package zjj.dp.builder.universal;

import java.util.ArrayList;
/*
 * author: zjj
 * date: 2015/4/18
 * func: 建造者,负责设置产品工艺和返回产品
 */
public abstract class Builder {
	public abstract void setSequence(ArrayList<String> sequence);
	public abstract ParentModel getModel();
}
