
package com.KHOO.swing;

import com.KHOO.event.EventMenu;
import com.KHOO.model.ModelMenu;
import com.KHOO.event.EventMenuSelected;
import com.sale.swing.MenuButton;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import net.miginfocom.swing.MigLayout;


public final class MenuItem extends javax.swing.JPanel {

    private final EventMenuSelected evenSelected;
    private final MenuButton firstItem;
    private PopupMenu item;

    /**
     * @return the alpha
     */
    public float getAlpha() {
        return alpha;
    }

    /**
     * @param alpha the alpha to set
     */
    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    /**
     * @return the menu
     */
    public ModelMenu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(ModelMenu menu) {
        this.menu = menu;
    }

    /**
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * @return the eventMenuSelected
     */
    public EventMenuSelected getEventMenuSelected() {
        return eventMenuSelected;
    }

    /**
     * @param eventMenuSelected the eventMenuSelected to set
     */
    public void setEventMenuSelected(EventMenuSelected eventMenuSelected) {
        this.eventMenuSelected = eventMenuSelected;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    private float alpha;
    private  ModelMenu menu;
    private boolean open;
    private EventMenuSelected eventMenuSelected;
    private int index;

  
    
    public MenuItem(ModelMenu menu, EventMenu event, EventMenuSelected eventselected, int index, com.sale.swing.MenuButton firstItem1) {
    initComponents();
    this.menu = menu;
    this.evenSelected = eventselected;
    this.index = index;
    setOpaque(false);
    setLayout(new MigLayout("wrap,fillx,inset 0", "[fill]", "[fill, 40!]0[fill,35!]"));

    // Sửa lỗi khi khởi tạo MenuButton
    MenuButton firstItem = new MenuButton(menu.getIcon(), menu.getMenuName());
    firstItem.addActionListener((ActionEvent e) -> {
        if (menu.getSubmenu().length() > 0) {
            System.out.println("click first item");
        }
    });

    // Thêm firstItem vào MenuItem
    add(firstItem);

    int subMenuIndex = -1;
        for (var st : menu.getSubmenu(1)) {
            MenuButton item;
            item = new MenuButton(st);
            item.setIndex(++subMenuIndex);
            item.addActionListener((ActionEvent ae) -> {
                eventselected.menuSelected(index, item.getIndex());
            });
            add(item);
        }

    // Sửa lỗi gán giá trị cho firstItem
    this.firstItem = firstItem1;
}



   

       
        
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
