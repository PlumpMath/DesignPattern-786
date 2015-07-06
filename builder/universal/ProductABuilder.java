package zjj.dp.builder.universal;

import java.util.ArrayList;

public class ProductABuilder extends Builder {
	private SubModelA subModelA = new SubModelA();
	@Override
	public void setSequence(ArrayList<String> sequence) {
		this.subModelA.setSequence(sequence);
	}

	@Override
	public ParentModel getModel() {
		return this.subModelA;
	}


}
