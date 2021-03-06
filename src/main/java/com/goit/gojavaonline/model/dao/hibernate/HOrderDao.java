package com.goit.gojavaonline.model.dao.hibernate;

import com.goit.gojavaonline.model.Order;
import com.goit.gojavaonline.model.dao.OrderDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class HOrderDao implements OrderDao{
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    @Transactional
    public void insertDishInOrder(int orderId, int dishId) {

    }

    @Override
    @Transactional
    public void deleteDishFromOrder(int orderId, int dishId) {

    }

    @Override
    @Transactional
    public void deleteOrder(int id) {

    }

    @Override
    @Transactional
    public void closeOrder(int id) {

    }

    @Override
    @Transactional
    public List<Order> getOrders(boolean closed) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select o from Order o").list();
    }

    @Override
    @Transactional
    public Order getOrderById(int id) {
        Order result = sessionFactory.getCurrentSession().load(Order.class, id);
        if(result == null) {
            throw new RuntimeException("Cannot find Employee by id: "+ id);
        }
        return result;
    }

    @Override
    @Transactional
    public void removeAll() {
        sessionFactory.getCurrentSession().createQuery("delete from Order").executeUpdate();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
