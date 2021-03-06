/*
 * Copyright (c) 2006 - 2012 LinogistiX GmbH
 * 
 *  www.linogistix.com
 *  
 *  Project myWMS-LOS
 */
package de.linogistix.wmsprocesses.processes.goodsreceipt.gui.gui_builder;

import de.linogistix.wmsprocesses.res.WMSProcessesBundleResolver;

/**
 *
 * @author  trautm
 */
public abstract class AbstractPositionWizardQMPanelUI extends javax.swing.JPanel {

    
    /** Creates new form AbstractPositionWizardULPanel */
    public AbstractPositionWizardQMPanelUI() {
        initComponents();
        postInit();
    }

    private void postInit() {

    }
    
    public void clear(){
        
    }
   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lockLabel = new javax.swing.JLabel();
        lockComboBox = new javax.swing.JComboBox();
        hintLabel = new javax.swing.JLabel();
        hintTextArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        lockLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "lock")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(lockLabel, gridBagConstraints);

        lockComboBox.setMinimumSize(new java.awt.Dimension(150, 22));
        lockComboBox.setPreferredSize(new java.awt.Dimension(150, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(lockComboBox, gridBagConstraints);

        hintLabel.setText(org.openide.util.NbBundle.getMessage(WMSProcessesBundleResolver.class, "info")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        add(hintLabel, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setMinimumSize(new java.awt.Dimension(150, 90));
        jTextArea1.setPreferredSize(new java.awt.Dimension(150, 90));
        hintTextArea.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(hintTextArea, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hintLabel;
    private javax.swing.JScrollPane hintTextArea;
    protected javax.swing.JTextArea jTextArea1;
    protected javax.swing.JComboBox lockComboBox;
    protected javax.swing.JLabel lockLabel;
    // End of variables declaration//GEN-END:variables

    
}
