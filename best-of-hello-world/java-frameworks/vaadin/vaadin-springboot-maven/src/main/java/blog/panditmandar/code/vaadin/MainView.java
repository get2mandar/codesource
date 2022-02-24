package blog.panditmandar.code.vaadin;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	private static final long serialVersionUID = 1L;

	public MainView() {
		add(new Text("Hello, Welcome to MainView in Vaadin!!"));
	}

}
