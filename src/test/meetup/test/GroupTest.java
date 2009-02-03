
package meetup.test;

import meetup.*;
import java.util.*;

public class GroupTest extends AbstractClientTest
{
	 
	
	public void testGetGroupsByZipCode() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setZipCode("97203");
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}
	
	public void testGetGroupsBoston() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setCity("Boston");
		crit.setState("MA");
		crit.setCountry("US");
		
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}
	
	public void testGetGroupsLondon() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setCity("London");
		crit.setCountry("UK");
		
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}


	public void testGetGroupsBrazil() throws Exception
	{
		GroupSearchCriteria crit = new GroupSearchCriteria();
		
		crit.setCountry("Brazil");
		
		List<Group> groups = getClient().getGroups(crit);
		
		assertGroups(groups);
		
	}
}
