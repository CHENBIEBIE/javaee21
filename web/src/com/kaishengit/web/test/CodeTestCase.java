package com.kaishengit.web.test;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

public class CodeTestCase {

    @Test
    public void testMd5(){
        String password ="123123";

        String salt ="dsjhj@##$@#%";
        password = DigestUtils.md5Hex(password);

        System.out.print(password);
    }
    @Test
    public void testSha(){
        String password ="123123";

        //String salt ="dsjhj@##$@#%";
        password = DigestUtils.sha1Hex(password);

        System.out.print(password);
    }
}
