package com.userDao;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
 
import com.userDao.Model.User;
 
@Repository
public class userDao {
 
    @Autowired
    private HibernateTemplate hibernateTemplate;
    
    @Transactional
    public void insertUser(User user) {
        
        this.hibernateTemplate.save(user);
    }
    @Transactional
    public void updateUser(User user) {
        
        this.hibernateTemplate.update(user);
    }
    
    public List<User> getAllUsers(){
        
        List<User> list=this.hibernateTemplate.loadAll(User.class);
        return list;
    }
    public User getUserById(int id){
        
        User u=this.hibernateTemplate.get(User.class, id);
        return u;
    }
    @Transactional
    public void delete(int id) {
        User u=this.hibernateTemplate.get(User.class, id);
        this.hibernateTemplate.delete(u);
    }
}
 