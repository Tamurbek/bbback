package com.example.bbback.template;

import java.util.UUID;

public class Functions {
    public static String txtToUuid(String txt){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}
