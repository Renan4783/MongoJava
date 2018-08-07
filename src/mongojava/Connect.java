/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mongojava;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Renan
 */
public class Connect {
    
    private static Connect connect = new Connect();
    private MongoClient mongoClient = new MongoClient();
    private MongoDatabase db = mongoClient.getDatabase("test");
    
    private Connect(){
    
    }
    
    public MongoDatabase getDatabase(){
        return db;
    }
    
    public static Connect getConnect(){
        return connect;
    }
}
