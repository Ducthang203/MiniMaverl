/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.KHOO.model;

import javax.swing.Icon;


public class ModelMenu {

    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * @return the menuName
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName the menuName to set
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return the Submenu
     */
    public String getSubmenu() {
        return Submenu;
    }

    /**
     * @param Submenu the Submenu to set
     */
    public void setSubmenu(String Submenu) {
        this.Submenu = Submenu;
    }
    private Icon icon;
    private String menuName;
    private String Submenu;

    public Iterable<String> getSubmenu(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
