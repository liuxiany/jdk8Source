package cn.liuxiany.test.arraylist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liuxiany
 * @date 2020/04/02
 */
public class test {
    public static void main( String[] args ) {


        Map<String,Double> hashMap = new HashMap<>();

        hashMap.put( "k1", 0.1 );
        hashMap.put( "k2", 0.2 );
        hashMap.put( "k3", 0.3 );
        hashMap.put( "k4", 0.4 );

        for ( Map.Entry<String,Double> entry : hashMap.entrySet() ) {
            System.out.println( entry.getKey() +"：" + entry.getValue());
        }

    }
}
