package homework.week10;

import java.util.Date;

/**
 * 다음의 리턴
 * @author user
 *
 */
public class Test2 {
	   private String name;
	   private int id;
	   private Date dob;

	   @Override
	   public boolean equals(Object other){
	   	
	       if(this == other){
	    	   return (A);
	       }
	      
	       if(other == null || (this.getClass() != other.getClass())){
	           return (B);
	       }
	      
	       Test2 guest = (Test2) other;
	       
	       if(	(this.id == guest.id) &&
	    		(this.name != null && name.equals(guest.name)) &&    
	    		(this.dob != null && dob.equals(guest.dob))  
		      ){
	    	   return (C);
	       }
	       
	       return (D);
	   }
} 
