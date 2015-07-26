package com.superheizai.session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Created by superheizai on 15/7/26.
 */
public enum SessionsFactory {

    INSTANCE;

    SqlSessionFactory sessionFactory;

     SessionsFactory(){
         String resource = "mybatis/configuration.xml";

         try {
                sessionFactory = new SqlSessionFactoryBuilder().build(Resources
                     .getResourceAsReader(resource));
         } catch (IOException e) {
             e.printStackTrace();
         }
    }


    public SqlSessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
