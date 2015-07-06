package zjj.dp.proxy.dynamicproxy.example;

public class DocumentDao implements IDocumentDao {

	@Override
	public Boolean findDocumentById(String docid) {
		if(docid.equals("001")) {
			System.out.println("查询"+docid+"信息成功");
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteDocumentById(String docid) {
		if(docid.equals("002")) {
			System.out.println("成功删除"+docid+"信息");
			return true;
		}
		return false;
	}

}
