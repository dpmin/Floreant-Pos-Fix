/*
 * TicketView.java
 *
 * Created on August 4, 2006, 3:42 PM
 */

package com.floreantpos.ui.views.order;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import com.floreantpos.IconFactory;
import com.floreantpos.main.Application;
import com.floreantpos.model.Ticket;
import com.floreantpos.model.TicketItem;
import com.floreantpos.model.TicketItemModifierGroup;

/**
 *
 * @author  MShahriar
 */
public class TicketForSplitView extends com.floreantpos.swing.TransparentPanel implements TableModelListener {
	private Ticket ticket;
	private DecimalFormat numberFormat = new DecimalFormat("0.00");

	public final static String VIEW_NAME = "TICKET_FOR_SPLIT_VIEW";

	private TicketForSplitView ticketView1;
	private TicketForSplitView ticketView2;
	private TicketForSplitView ticketView3;

	private int viewNumber = 1;

	public TicketForSplitView() {
		initComponents();

		TableColumnModel columnModel = ticketViewerTable.getColumnModel();
		TableColumn column = null;

		column = columnModel.getColumn(0);
		column.setPreferredWidth(35);
		column.setMaxWidth(35);
		column.setMinWidth(35);

		column = columnModel.getColumn(1);
		column.setPreferredWidth(60);
		column.setMaxWidth(60);
		column.setMinWidth(60);

		ticket = new Ticket();
		ticket.setTerminal(Application.getInstance().getTerminal());
		ticket.setOwner(Application.getCurrentUser());
		ticket.setShift(Application.getInstance().getCurrentShift());

		Calendar currentTime = Calendar.getInstance();
		ticket.setCreateDate(currentTime.getTime());
		ticket.setCreationHour(currentTime.get(Calendar.HOUR_OF_DAY));

		setOpaque(true);
		setTicket(ticket);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new com.floreantpos.swing.TransparentPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new com.floreantpos.swing.TransparentPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        tfSubtotal = new javax.swing.JTextField();
        tfTax = new javax.swing.JTextField();
        tfDiscount = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        jPanel5 = new com.floreantpos.swing.TransparentPanel();
        btnScrollUp = new com.floreantpos.swing.PosButton();
        btnScrollDown = new com.floreantpos.swing.PosButton();
        btnTransferToTicket1 = new com.floreantpos.swing.PosButton();
        btnTransferToTicket2 = new com.floreantpos.swing.PosButton();
        btnTransferToTicket3 = new com.floreantpos.swing.PosButton();
        jPanel2 = new com.floreantpos.swing.TransparentPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticketViewerTable = new com.floreantpos.ui.ticket.TicketViewerTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ticket", 2, 0));
        setPreferredSize(new java.awt.Dimension(280, 463));
        setLayout(new java.awt.BorderLayout(5, 5));

        jPanel1.setLayout(new java.awt.BorderLayout(5, 5));
        jPanel1.add(jSeparator1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Subtotal:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 0, 0);
        jPanel3.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 3, 0);
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Discount:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel3.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tax:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        jPanel3.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jSeparator3, gridBagConstraints);

        tfSubtotal.setEditable(false);
        tfSubtotal.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 0, 5);
        jPanel3.add(tfSubtotal, gridBagConstraints);

        tfTax.setEditable(false);
        tfTax.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 0, 5);
        jPanel3.add(tfTax, gridBagConstraints);

        tfDiscount.setEditable(false);
        tfDiscount.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 0, 5);
        jPanel3.add(tfDiscount, gridBagConstraints);

        tfTotal.setEditable(false);
        tfTotal.setFont(new java.awt.Font("Simsum", 1, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 5, 3, 5);
        jPanel3.add(tfTotal, gridBagConstraints);

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.GridBagLayout());

        btnScrollUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up_32.png"))); // NOI18N
        btnScrollUp.setPreferredSize(new java.awt.Dimension(50, 45));
        btnScrollUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doScrollUp(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
        jPanel5.add(btnScrollUp, gridBagConstraints);

        btnScrollDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down_32.png"))); // NOI18N
        btnScrollDown.setPreferredSize(new java.awt.Dimension(50, 45));
        btnScrollDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doScrollDown(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 0);
        jPanel5.add(btnScrollDown, gridBagConstraints);

        btnTransferToTicket1.setText("1");
        btnTransferToTicket1.setPreferredSize(new java.awt.Dimension(60, 45));
        btnTransferToTicket1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferToTicket1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 2);
        jPanel5.add(btnTransferToTicket1, gridBagConstraints);

        btnTransferToTicket2.setText("2");
        btnTransferToTicket2.setPreferredSize(new java.awt.Dimension(60, 45));
        btnTransferToTicket2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferToTicket2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel5.add(btnTransferToTicket2, gridBagConstraints);

        btnTransferToTicket3.setText("3");
        btnTransferToTicket3.setPreferredSize(new java.awt.Dimension(60, 45));
        btnTransferToTicket3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferToTicket3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 0);
        jPanel5.add(btnTransferToTicket3, gridBagConstraints);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(ticketViewerTable);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

	private void btnTransferToTicket3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferToTicket3ActionPerformed
		if (ticketView3 != null && ticketView3.isVisible()) {
			int selectedRow = ticketViewerTable.getSelectedRow();
			Object object = ticketViewerTable.get(selectedRow);

			if (object instanceof TicketItem) {
				transferTicketItem((TicketItem) object, ticketView3);
			}
		}
	}//GEN-LAST:event_btnTransferToTicket3ActionPerformed

	private void btnTransferToTicket2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferToTicket2ActionPerformed
		if (ticketView2 != null && ticketView2.isVisible()) {
			int selectedRow = ticketViewerTable.getSelectedRow();
			Object object = ticketViewerTable.get(selectedRow);

			if (object instanceof TicketItem) {
				transferTicketItem((TicketItem) object, ticketView2);
			}
		}
	}//GEN-LAST:event_btnTransferToTicket2ActionPerformed

	private void btnTransferToTicket1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferToTicket1ActionPerformed
		if (ticketView1 != null && ticketView1.isVisible()) {
			int selectedRow = ticketViewerTable.getSelectedRow();
			Object object = ticketViewerTable.get(selectedRow);

			if (object instanceof TicketItem) {
				transferTicketItem((TicketItem) object, ticketView1);
			}
		}
	}//GEN-LAST:event_btnTransferToTicket1ActionPerformed

	private void doScrollDown(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doScrollDown
		ticketViewerTable.scrollDown();
	}//GEN-LAST:event_doScrollDown

	private void doScrollUp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doScrollUp
		ticketViewerTable.scrollUp();
	}//GEN-LAST:event_doScrollUp

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.floreantpos.swing.PosButton btnScrollDown;
    private com.floreantpos.swing.PosButton btnScrollUp;
    private com.floreantpos.swing.PosButton btnTransferToTicket1;
    private com.floreantpos.swing.PosButton btnTransferToTicket2;
    private com.floreantpos.swing.PosButton btnTransferToTicket3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.floreantpos.swing.TransparentPanel jPanel1;
    private com.floreantpos.swing.TransparentPanel jPanel2;
    private com.floreantpos.swing.TransparentPanel jPanel3;
    private com.floreantpos.swing.TransparentPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField tfDiscount;
    private javax.swing.JTextField tfSubtotal;
    private javax.swing.JTextField tfTax;
    private javax.swing.JTextField tfTotal;
    private com.floreantpos.ui.ticket.TicketViewerTable ticketViewerTable;
    // End of variables declaration//GEN-END:variables

	public void updateModel() {
		ticket.calculatePrice();

		/*
		 double calculatedSubtotalPrice = ticket.calculateSubtotalAmount();
		 double calculatedTax = ticket.getCalculatedTax();
		 double calculatedTotalPrice = ticket.getCalculatedTotalPrice();

		 ticket.setSubtotalAmount(calculatedSubtotalPrice);
		 ticket.setTaxAmount(calculatedTax);
		 ticket.setTotalAmount(calculatedTotalPrice);
		 */
	}

	public void updateView() {
		if (ticket == null || ticket.getTicketItems() == null || ticket.getTicketItems().size() <= 0) {
			tfSubtotal.setText("");
			tfDiscount.setText("");
			tfTax.setText("");
			tfTotal.setText("");

			return;
		}

		ticket.calculatePrice();

		tfSubtotal.setText(numberFormat.format(ticket.getSubtotalAmount()));
		tfDiscount.setText(numberFormat.format(ticket.getDiscountAmount()));
		tfTax.setText(numberFormat.format(ticket.getTaxAmount()));
		tfTotal.setText(numberFormat.format(ticket.getTotalAmount()));
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket _ticket) {
		this.ticket = _ticket;

		ticketViewerTable.setTicket(_ticket);

		updateView();
	}

	public void transferTicketItem(TicketItem ticketItem, TicketForSplitView toTicketView) {
		TicketItem newTicketItem = new TicketItem();
		newTicketItem.setItemCount(1);
		newTicketItem.setItemId(ticketItem.getItemId());
		newTicketItem.setHasModifiers(ticketItem.isHasModifiers());
		newTicketItem.setTicketItemModifierGroups(new ArrayList<TicketItemModifierGroup>(ticketItem.getTicketItemModifierGroups()));
		newTicketItem.setName(ticketItem.getName());
		newTicketItem.setGroupName(ticketItem.getGroupName());
		newTicketItem.setCategoryName(ticketItem.getCategoryName());
		newTicketItem.setUnitPrice(ticketItem.getUnitPrice());
		newTicketItem.setDiscountRate(ticketItem.getDiscountRate());
		newTicketItem.setTaxRate(ticketItem.getTaxRate());
		newTicketItem.setBeverage(ticketItem.isBeverage());
		newTicketItem.setShouldPrintToKitchen(ticketItem.isShouldPrintToKitchen());
		
		int itemCount = ticketItem.getItemCount();

		toTicketView.ticketViewerTable.addTicketItem(newTicketItem);
		if (itemCount > 1) {
			ticketItem.setItemCount(--itemCount);
		}
		else {
			ticketViewerTable.delete(ticketItem.getTableRowNum());
		}
		repaint();
		toTicketView.repaint();
		updateView();
		toTicketView.updateView();
	}

	public void transferAllTicketItem(TicketItem ticketItem, TicketForSplitView toTicketView) {
		TicketItem newTicketItem = new TicketItem();
		newTicketItem.setItemId(ticketItem.getItemId());
		newTicketItem.setItemCount(ticketItem.getItemCount());
		newTicketItem.setHasModifiers(ticketItem.isHasModifiers());
		newTicketItem.setTicketItemModifierGroups(new ArrayList<TicketItemModifierGroup>(ticketItem.getTicketItemModifierGroups()));
		newTicketItem.setName(ticketItem.getName());
		newTicketItem.setGroupName(ticketItem.getGroupName());
		newTicketItem.setCategoryName(ticketItem.getCategoryName());
		newTicketItem.setUnitPrice(ticketItem.getUnitPrice());
		newTicketItem.setDiscountRate(ticketItem.getDiscountRate());
		newTicketItem.setTaxRate(ticketItem.getTaxRate());
		newTicketItem.setBeverage(ticketItem.isBeverage());
		newTicketItem.setShouldPrintToKitchen(ticketItem.isShouldPrintToKitchen());
		
		toTicketView.ticketViewerTable.addAllTicketItem(newTicketItem);
		ticketViewerTable.delete(ticketItem.getTableRowNum());
		repaint();
		toTicketView.repaint();
		updateView();
		toTicketView.updateView();
	}

	public void tableChanged(TableModelEvent e) {
		if (ticket == null || ticket.getTicketItems() == null || ticket.getTicketItems().size() <= 0) {
			tfSubtotal.setText("");
			tfDiscount.setText("");
			tfTax.setText("");
			tfTotal.setText("");

			return;
		}

		ticket.calculatePrice();

		tfSubtotal.setText(numberFormat.format(ticket.getSubtotalAmount()));
		tfDiscount.setText(numberFormat.format(ticket.getDiscountAmount()));
		tfTax.setText(numberFormat.format(ticket.getTaxAmount()));
		tfTotal.setText(numberFormat.format(ticket.getTotalAmount()));
	}

	public TicketForSplitView getTicketView1() {
		return ticketView1;
	}

	public void setTicketView1(TicketForSplitView ticketView1) {
		this.ticketView1 = ticketView1;
	}

	public TicketForSplitView getTicketView2() {
		return ticketView2;
	}

	public void setTicketView2(TicketForSplitView ticketView2) {
		this.ticketView2 = ticketView2;
	}

	public TicketForSplitView getTicketView3() {
		return ticketView3;
	}

	public void setTicketView3(TicketForSplitView ticketView3) {
		this.ticketView3 = ticketView3;
	}

	public int getViewNumber() {
		return viewNumber;
	}

	public void setViewNumber(int viewNumber) {
		this.viewNumber = viewNumber;

		TitledBorder titledBorder = new TitledBorder("Ticket " + viewNumber);
		titledBorder.setTitleJustification(TitledBorder.CENTER);

		setBorder(titledBorder);

		switch (viewNumber) {
			case 1:
				btnTransferToTicket1.setIcon(IconFactory.getIcon("next_32.png"));
				btnTransferToTicket1.setText("2");
				btnTransferToTicket2.setIcon(IconFactory.getIcon("next_32.png"));
				btnTransferToTicket2.setText("3");
				btnTransferToTicket3.setIcon(IconFactory.getIcon("next_32.png"));
				btnTransferToTicket3.setText("4");
				break;

			case 2:
				btnTransferToTicket1.setIcon(IconFactory.getIcon("previous_32.png"));
				btnTransferToTicket1.setText("1");
				btnTransferToTicket2.setIcon(IconFactory.getIcon("next_32.png"));
				btnTransferToTicket2.setText("3");
				btnTransferToTicket3.setIcon(IconFactory.getIcon("next_32.png"));
				btnTransferToTicket3.setText("4");
				break;

			case 3:
				btnTransferToTicket1.setIcon(IconFactory.getIcon("previous_32.png"));
				btnTransferToTicket1.setText("1");
				btnTransferToTicket2.setIcon(IconFactory.getIcon("previous_32.png"));
				btnTransferToTicket2.setText("2");
				btnTransferToTicket3.setIcon(IconFactory.getIcon("next_32.png"));
				btnTransferToTicket3.setText("4");

				break;

			case 4:
				btnTransferToTicket1.setIcon(IconFactory.getIcon("previous_32.png"));
				btnTransferToTicket1.setText("1");
				btnTransferToTicket2.setIcon(IconFactory.getIcon("previous_32.png"));
				btnTransferToTicket2.setText("2");
				btnTransferToTicket3.setIcon(IconFactory.getIcon("previous_32.png"));
				btnTransferToTicket3.setText("3");
				break;

			default:
				throw new RuntimeException("Invalid viewNumber");
		}
	}
}
