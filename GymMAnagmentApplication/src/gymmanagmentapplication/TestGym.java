
package gymmanagmentapplication;

/**
 *
 * @author sara
 */
public class TestGym {
    
    public static void main(String args[])
            
    {
    
        Gym gym1 = new Gym("aaaaa");
        
        Trainer t1 = new Trainer(1, "aa1", "bb", "cc", "dd", "10/07/2001", 332501, "male");
        Trainer t2 = new Trainer(2, "aa2", "bb2", "cc2", "dd2", "10/07/1999", 332501, "male");
        Trainer t3 = new Trainer(3, "aa3", "bb", "cc", "dd", "10/07/2001", 332501, "female");
        Trainer t4 = new Trainer(2, "aa1", "bb", "cc", "dd", "10/07/2001", 332501, "male");
        
        Staff s1 = new Staff(1, "aa1", "bb", "cc", "dd", "10/07/2001", 332501, "male", "One", "INF");
        Staff s2 = new Staff(2, "aa2", "bb2", "cc2", "dd2", "10/07/1999", 332501, "male", "One", "INF");
        Staff s3 = new Staff(3, "aa3", "bb", "cc", "dd", "10/07/2001", 332501, "female", "One", "INF");
        Staff s4 = new Staff(2, "aa1", "bb", "cc", "dd", "10/07/2001", 332501, "male", "One", "INF");
        
        
        gym1.add_Trainer(t1);
        gym1.add_Trainer(t2);
        gym1.add_Trainer(t3);
        gym1.add_Trainer(t1);
        
        System.out.println(gym1.display_Trainer());
        
                
        
        gym1.add_Staff(s1);
        gym1.add_Staff(s2);
        gym1.add_Staff(s3);
        gym1.add_Staff(s1);
        
         System.out.println(gym1.display_Staff());
        
         gym1.saveGym();
        
        
    
    
    }
}
