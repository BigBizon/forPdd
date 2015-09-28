package superFrame;

import java.util.ArrayList;

public class Logic {
	ArrayList<String> listAll = new ArrayList<String>();
	int i;

	public void going() {
		// ArrayList<String> list = new ArrayList<String>();
		// ArrayList<String> listAll = new ArrayList<String>();
		listAll.add(0, "who is it?");
		listAll.add(1, "it is bro");
		listAll.add(2, "it is broser");

		for (i = 0; i < listAll.size(); i++) {

			i = (int) (Math.random() * 3);
			

			if (i == 1) {
				System.out.println("true 1" + " " + listAll.get(i));
				
				new JframeClass().go();
				break;
			} else if (i == 2) {
				System.out.println("true 2"+ " " + listAll.get(i));
				new JframeClass().go();
				break;
			} else {
				System.out.println("true 0"+ " " + listAll.get(i));
				new JframeClass().go();
				break;
			}

			// System.out.println(i);

		}
	}
}
