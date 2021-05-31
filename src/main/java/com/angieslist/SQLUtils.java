package com.angieslist;

public class SQLUtils {
    public static String buildClause(String[] values) {
        StringBuilder sb = new StringBuilder(100);

        sb.append("(");
        for (int i = 0; i < values.length; i++) {
            if (i > 0) {
                sb.append(", '").append(values[i]).append("'");
            }
            else {
            	sb.append("'").append(values[i]).append("'");            	
            }
        }
        if(values.length == 0) {
        	sb.append("null");
        }
        sb.append(")");

        return sb.toString();
    }
}
