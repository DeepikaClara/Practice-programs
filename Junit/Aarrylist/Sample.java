package sample;

import java.util.ArrayList;
import java.util.List;

public class Sample  {
private List<String> school=new ArrayList<String>();
public void add(String name)
{
school.add(name);
}
public void remove(String name)
{
	school.remove(name);
}
public int size()
{
	return school.size();
}
public int get()
{
	school.get(0);
	return 0;
}
public void removeAll()
{
	school.clear();
}

}



