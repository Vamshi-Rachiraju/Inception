package utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongodbUtils {
    public static MongoClient connect(String connectionString) {
        return MongoClients.create(connectionString);
    }
}
