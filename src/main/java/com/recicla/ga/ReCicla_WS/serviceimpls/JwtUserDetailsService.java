package com.recicla.ga.ReCicla_WS.serviceimpls;

import java.util.ArrayList;

import com.recicla.ga.ReCicla_WS.entities.AdminUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.recicla.ga.ReCicla_WS.repositories.IAdminUserDAO;
@Service
public class JwtUserDetailsService implements UserDetailsService {
    private final IAdminUserDAO adminUserDAO;

    public JwtUserDetailsService(IAdminUserDAO adminUserDAO) {
        this.adminUserDAO = adminUserDAO;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //Aqui lógica para buscar el usuario en BD
        //Usuario defecto sebas:sebas
        AdminUser adminAccount = adminUserDAO.findByUsername(username);
        if (adminAccount == null) {
            throw new UsernameNotFoundException("User not found with username: " + username );
        }
        return new AdminUserServiceImpl(adminAccount);


    }
}
