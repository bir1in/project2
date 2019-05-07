package com.revature.repository;

import java.util.List;
import org.apache.log4j.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.User;

@Repository("userRepository")
@Transactional
public class UserRepositoryHibernate implements UserRepository {

	private static Logger logger = Logger.getLogger(UserRepositoryHibernate.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserRepositoryHibernate() {
		logger.trace("Inject session factory bean");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public User findByName(String username) {
		try {
			return (User) sessionFactory.getCurrentSession().createCriteria(User.class)
				.add(Restrictions.like("username", username))
				.list()
				.get(0);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

}
