package com.KHOO.component;

import com.sale.event.EventMenu;
import com.sale.event.EventMenuSelected;
import com.sale.event.EventShowPopupMenu;
import com.sale.model.ModelMenu;
import com.sale.swing.MenuItem;
import com.sale.swing.scrollbar.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;

public class Menu extends javax.swing.JPanel {

    public boolean isShowMenu() {
        return showMenu;
    }

    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void setEnableMenu(boolean enableMenu) {
        this.enableMenu = enableMenu;
    }

    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }

    public void addEventShowPopup(EventShowPopupMenu eventShowPopup) {
        this.eventmMenuSelected = eventShowPopup;
    }

    private final MigLayout layout;
    private EventMenuSelected event;
    private EventShowPopupMenu eventmMenuSelected;
    private boolean enableMenu = true;
    private boolean showMenu = true;

    public Menu() {
    initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        Panel.setLayout(layout);
    }

    public void initMenuItem() {
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/1.png")), "Dashboard", "Home", "Buttons", "Cards", "Tabs", "Accordions", "Modals"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/2.png")), "Charts", "Morris", "Flot", "Line"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/3.png")), "Report", "Income", "Expense", "Profit"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/4.png")), "Message", "Sender", "Inbox", "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/5.png")), "Staff", "Sender", "Inbox", "User"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/6.png")), "Student", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/7.png")), "Library", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/8.png")), "Holiday", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/9.png")), "Calendar", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/10.png")), "Chat App", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/11.png")), "Contace", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/12.png")), "File Manager", "Menu 001", "Menu 002", "Menu 003"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/13.png")), "Our Centres"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/com/raven/icon/14.png")), "Gallery"));
    }

    private void addMenu(ModelMenu menu) {
        Panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!");
    }

private EventMenu getEvenMenu() {
    return new EventMenu() {
        @Override
        public boolean menuPressed(Component com, boolean open) {
            System.out.println("Menu Press");
            return true;
        }
    };
}
public Menu(EventMenuSelected eventSelected, EventShowPopupMenu eventShowPopup, net.miginfocom.swing.MigLayout layout) {
        this.eventShowPopup = ;
    // Các công việc khác trong hàm tạo
        this.layout = layout;
}
EventMenuSelected eventSelected =
    // Thay thế bằng đối tượng thực tế của EventMenuSelected
     ...; EventShowPopupMenu eventShowPopup...; // Thay thế bằng đối tượng thực tế của EventShowPopupMenu
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    public void hideallMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
