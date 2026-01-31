package package1;

import com.myapp.utils.Date;

public class Main {
	public static void main(String[] args) {

        Date utilDate = new Date("28.01.26");

        com.myapp.model.Date modelDate = new com.myapp.model.Date(5);

        System.out.println("utils.Date: " + utilDate.eventDate);
        System.out.println("model.Date: " + modelDate.timestamp);
    }
}
