/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.flamenco.web;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author lauraflamenco
 */
public class WebApp extends 
        AbstractAnnotationConfigDispatcherServletInitializer
{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
       
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class<?>[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // declaracion de forma anonima
        
        return new String [] {"/servicios/*"};
        
        // declaraccion de forma normal
        // string mapeos []={"/servicios/*"}:
    }
    
}
