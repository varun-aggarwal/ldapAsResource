package com.ldapAsResource.example.listerner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.ldap.LdapContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author varun
 */
public class AppContextListener implements ServletContextListener {

    private LdapContext ldapContext;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            Context initialContext = new InitialContext();
            ldapContext = (LdapContext)
                    initialContext.lookup("java:comp/env/ldap/LdapResource");
            System.out.println(ldapContext.getEnvironment());
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ldapContext = null;
    }
}
