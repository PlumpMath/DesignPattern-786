package zjj.dp.proxy.dynamicproxy.example;

public class DocumentDao implements IDocumentDao {

	@Override
	public Boolean findDocumentById(String docid) {
		if(docid.equals("001")) {
			System.out.println("��ѯ"+docid+"��Ϣ�ɹ�");
			return true;
		}
		return false;
	}

	@Override
	public Boolean deleteDocumentById(String docid) {
		if(docid.equals("002")) {
			System.out.println("�ɹ�ɾ��"+docid+"��Ϣ");
			return true;
		}
		return false;
	}

}
