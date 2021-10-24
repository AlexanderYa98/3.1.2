package com.example311.service;




import com.example311.model.Role;

import java.util.List;

public interface RoleService {

    void saveRole(Role role);

    void updateRole(Role role);

    void deleteRoleById(Long id);

    List<Role> allRoles();

    Role getRoleByName(String role);
}
