
package dao;

import java.util.ArrayList;
import java.util.List;


public class DataUtility {
private List <String> licensenumber ; 
public boolean getLicense(String licensenumber)
{DataUtility du = new DataUtility();
du.loadData();
if(du.licensenumber.indexOf(licensenumber)!=-1)
{   
    return true;
}    
return false;
}

public void loadData(){
licensenumber = new ArrayList<>();   
licensenumber.add("abc");
licensenumber.add("efg2");
licensenumber.add("xyz");
licensenumber.add("ghi");
licensenumber.add("jkl");
}
}
