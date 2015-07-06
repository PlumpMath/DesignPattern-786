package zjj.dp.builder.universal;

import java.util.ArrayList;

public class ProductBBuilder extends Builder {
	private SubModelB subModelB = new SubModelB();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.subModelB.setSequence(sequence);
	}

	@Override
	public ParentModel getModel() {
		return this.subModelB;
	}
}
