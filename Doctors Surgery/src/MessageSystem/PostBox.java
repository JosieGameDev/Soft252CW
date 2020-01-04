/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageSystem;

import java.util.ArrayList;

/**
 *
 * @author jwood20
 */
public class PostBox {
    // each system user has a postbox with all their messages in 
    public ArrayList<Message> postBox;

    public PostBox() {
        postBox = new ArrayList<>(0);
    }
    
    
    
}
