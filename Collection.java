import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collection {

	public Collection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList values=new ArrayList();
values.add(4);
values.add(5);
values.add(7);

java.util.Iterator i=values.iterator();

while(i.hasNext())
{
System.out.println(i.next());
}
}}