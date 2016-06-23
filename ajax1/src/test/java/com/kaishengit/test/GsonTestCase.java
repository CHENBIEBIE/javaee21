package com.kaishengit.test;

import com.google.gson.Gson;
import com.kaishengit.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/23.
 */
public class GsonTestCase {

    @Test
    public void testToObject(){

        User user = new User(2,"jack","Uk",99F);

        //Object对象转成json是也是转成对象，不是数组

        Gson gson = new Gson();
        String json =gson.toJson(user);
        System.out.println(json);

    }

    @Test
    public void testMapToObject(){

        Map<String,Object> map = new HashMap<>();
        //map对象转成json也是对象，因map本身就是键值对，
        // 输出时无序 因为map 。。无序
        map.put("id",110);
        map.put("message","hello json");

        String json = new Gson().toJson(map);

        System.out.println(json);
    }



    @Test
    public void testArrayTOJosn(){

        //对象数组转成的还是数组
        User[] user =new  User[3];
        user[0] = new User(1,"jack","USA",99f);
        user[1] = new User(2,"jack1","UK",99f);
        user[2] = new User(3,"jack2","Ufo",99f);

        String json = new Gson().toJson(user);
        System.out.println(json);
    }

    @Test
    public void testListToJson(){

        List<User> userList = new ArrayList<>();

        userList.add(new User(1,"jack","USA",99f));
        userList.add(new User(2,"jack1","UK",99f));
        userList.add(new User(3,"jack2","Ufo",99f));

        String json = new Gson().toJson(userList);
        System.out.println(json);
    }

    @Test
    public void otherToJson(){

        List<User> userList = new ArrayList<>();

        userList.add(new User(1,"jack","USA",99f));
        userList.add(new User(2,"jack1","UK",99f));
        userList.add(new User(3,"jack2","Ufo",99f));

        Map<String,Object> map = new HashMap<>();
        map.put("result","success");
        map.put("data",userList);

        String json = new Gson().toJson(map);
        System.out.println(json);
    }
}
