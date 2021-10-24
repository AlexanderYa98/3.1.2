package com.example311.dao;

import com.example311.model.Role;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImp implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(Role role) {
        entityManager.persist(role);
    }

    @Override
    public void update(Role role) {
        entityManager.merge(role);
    }

    @Override
    public void delete(Long id) {
        entityManager.createQuery("DELETE FROM Role role WHERE role.id = :id")
                .setParameter("id", id).executeUpdate();
    }

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("SELECT role FROM Role role", Role.class).getResultList();
    }

    @Override
    public Role getRoleByName(String role) {
        return entityManager.createQuery("select role from Role role where role.role=:role",
                Role.class).setParameter("role", role).getSingleResult();

    }
}
