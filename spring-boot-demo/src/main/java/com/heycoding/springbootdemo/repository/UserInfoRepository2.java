package com.heycoding.springbootdemo.repository;

import com.heycoding.springbootdemo.model.UserInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoRepository2 {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserInfo> getUserInfoByName(String name, String pwd) {
        String hql = "select new com.heycoding.springbootdemo.model.UserInfo(u.id,u.username,u.password) from UserInfo u where 1=1 ";
        if(StringUtils.isNotEmpty(name)) {
            hql += " and u.username = :username1 ";
        }
        if(StringUtils.isNotEmpty(pwd)) {
            hql += " and u.password = :pwd ";
        }
        TypedQuery<UserInfo> query = entityManager.createQuery(hql, UserInfo.class);

        if(StringUtils.isNotEmpty(name)) {
            query.setParameter("username1", name);
        }
        if(StringUtils.isNotEmpty(pwd)) {
            query.setParameter("pwd", pwd);
        }
        return query.getResultList();
    }

}
