package term2.prøveeksamen.navigation;

public class NavigationItem extends NavigationComponent {
	private String link;

	public NavigationItem(String name, String link) {
		super(name);
		this.link = link;
	}

	@Override
	public String getLink() {
		return link;
	}

	@Override
	public void printComponent(int space) {
		System.out.println(" ".repeat(space) + getName() + " - " + getLink());
	}
}
