package term2.prøveeksamen.navigation;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public abstract class NavigationComponent {
	private final ArrayList<NavigationComponent> children = new ArrayList<>();
	private final String name;

	public NavigationComponent(String name) {
		this.name = name;
	}

	public void addChild(NavigationComponent navigationComponent) {
		this.children.add(navigationComponent);
	}

	public ArrayList<NavigationComponent> getChildren() {
		return children;
	}

	public String getName() {
		return name;
	}

	public String getLink() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		if (children.size() > 0) {
			print(this, 0);
		}
	}

	public void printComponent(int space) {
		System.out.println(" ".repeat(space) + getName());
	}

	private void print(NavigationComponent component, int space) {
		component.printComponent(space);

		int newSpace = space;
		if (component.children.size() > 0) {
			newSpace += 4;
		}

		for (NavigationComponent child : component.getChildren()) {
			print(child, newSpace);
		}
	}
}
