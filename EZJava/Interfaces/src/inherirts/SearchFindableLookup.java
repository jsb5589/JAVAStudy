package inherirts;

public class SearchFindableLookup implements SearchFindable2 {

	@Override
	public void search(String url) {
		System.out.printf("SearchFindableLookup:search(%d)=n", url);

	}

	@Override
	public void find(String text) {
		System.out.printf("SearchFindableLookup:find(%d)=n", text);

	}

	@Override
	public void lookup(String topic) {
		System.out.printf("SearchFindableLookup:lookup(%d)=n", topic);
	}

}
