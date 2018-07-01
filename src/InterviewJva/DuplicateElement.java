package InterviewJva;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {

     String names[]={"java","c++","Script","c","ruby","java","c++"};
     for(int i=0;i<=names.length;i++)
     {
    	 for(int j=i+1;j<names.length;j++)
    	 {
    		 if(names[i]==names[j])
    		 {
    			 System.out.println("Duplicate value is:-" +names[j]);
    		 }
    	 }
     }
     
     //using hashSet: java collection it store unique value
     
     Set<String> store=new HashSet<String>();
     
     for(String name :names)
     {
    	 if(store.add(name)==false)
    	 {
    		 System.out.println("duplicate value is:" + name);
    	 }
     }
     
     //using HashMap
     Map<String,Integer> storemap=new HashMap<String,Integer>();
     for(String name:names)
     {
    	 Integer count=storemap.get(name);
    	 if(count==null)
    	 {
    		 storemap.put(name, 1);
    	 }
    	 else
    	 {
    		 storemap.put(name, ++count);
    	 }
     }
    	 Set<Entry<String,Integer>> entryset=storemap.entrySet();
    	 for(Entry<String,Integer> entry : entryset)
    	 {
    		 if(entry.getValue()>1)
    		 {
    			 System.out.println("Duplicate value is:-" +entry.getKey());
    		 }
    	 }

	}

}
