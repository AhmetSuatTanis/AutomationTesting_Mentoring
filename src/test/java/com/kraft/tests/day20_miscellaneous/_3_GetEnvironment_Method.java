package com.kraft.tests.day20_miscellaneous;

import org.apache.commons.exec.OS;
import org.testng.annotations.Test;

public class _3_GetEnvironment_Method {

    @Test
    public void test1(){
        /**
         * environment variables'da bulunan değişkenlere erişmek için kullanılır.
         * örnek olarak şirket bir bilgisayar verir ve onun içindeki environment kısmında
         * password ve value yani şifre kısmı oluştururuz . böylece şirketin verdiği iş üzerinde çalışırken
         * sistemimizde olan şifreyi path yolunu vererek ulaşıp gücvenlik kısmının aşıp işimize devam ederiz
         * bunun sebebi işe tanımlanan kişi dışında ulaşılmasını engellemektir.
         */

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String os = System.getenv("OS");
        System.out.println("os = " + os);
    }





}
