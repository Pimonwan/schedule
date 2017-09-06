//Pimonwan  Sutmee  5810405207
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddEventPage extends JPanel{
	private Calendar cal;
	
	private JPanel panel, topicPanel, datePanel, timePanel, placePanel, addBtnPanel, canBtnPanel, btnPanel;
	private JLabel titleText, topicText, dateOfEventText, timeText, toTimeText, placeText;
	
	private JTextField topicField, placeField;
	
	private JComboBox daysChoice, monthChoice, yearChoice, startHourChoice, startMinChoice, startAmPmChoice
				,endHourChoice, endMinChoice, endAmPmChoice;
	
	private JButton addBtn, cancleBtn;
	
	public AddEventPage() {
		this.cal = new GregorianCalendar();
		
		this.panel = new JPanel();
		this.topicPanel = new JPanel();
		this.datePanel = new JPanel();
		this.timePanel = new JPanel();
		this.placePanel = new JPanel();
		this.addBtnPanel = new JPanel();
		this.canBtnPanel = new JPanel();
		this.btnPanel = new JPanel();
		
		
		this.titleText = new JLabel("*****  Add Event  *****");
		
		this.topicText = new JLabel("Topic : ");
		this.topicField = new JTextField(20);
		
		String[] days = {"1","2","3","4","5","6","7","8","9","10","11"
				,"12","13","14","15","16","17","18","19","20","21","22"
				,"23","24","25","26","27","28","29","30","31"};
		String[] months = { "January", "February", "March", "April", "May", "June",
			      "July", "August", "September", "October", "November", "December" }; 
		
		this.dateOfEventText = new JLabel("Date : ");
		this.daysChoice = new JComboBox(days);
		daysChoice.setSelectedItem(cal.get(Calendar.DAY_OF_MONTH)+"");
		
		this.monthChoice = new JComboBox(months);
		monthChoice.setSelectedItem(months[cal.get(Calendar.MONTH)]);
		
		this.yearChoice = new JComboBox();
		for(int i = cal.get(Calendar.YEAR)-10 ; i <= cal.get(Calendar.YEAR)+10 ;i = i + 1) {
			yearChoice.addItem(Integer.toString(i));
		}
		yearChoice.setSelectedItem(cal.get(Calendar.YEAR)+"");
		
		this.timeText = new JLabel("Time : ");
		this.toTimeText = new JLabel("  to  ");
		
		String[] hours =  {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String[] amPm = {"AM","PM"};
		this.startHourChoice = new JComboBox(hours);
		this.endHourChoice = new JComboBox(hours);
		startHourChoice.setSelectedItem(cal.get(Calendar.HOUR)+"");
		endHourChoice.setSelectedItem(cal.get(Calendar.HOUR)+"");

		
		this.startMinChoice = new JComboBox();
		this.endMinChoice = new JComboBox();
		for(int i = 1 ; i <= 60 ; i++) {
			this.startMinChoice.addItem(Integer.toString(i));
			this.endMinChoice.addItem(Integer.toString(i));
		}
		startMinChoice.setSelectedItem(cal.get(Calendar.MINUTE)+"");
		endMinChoice.setSelectedItem(cal.get(Calendar.MINUTE)+"");
		
		this.startAmPmChoice = new JComboBox(amPm);
		this.endAmPmChoice = new JComboBox(amPm);
		startAmPmChoice.setSelectedItem(amPm[cal.get(Calendar.AM_PM)]);
		endAmPmChoice.setSelectedItem(amPm[cal.get(Calendar.AM_PM)]);
				
		this.placeText = new JLabel("Place : ");
		this.placeField = new JTextField(20);
		
		this.setAddBtn(new JButton("Add"));
		getAddBtn().setBackground(Color.green);
		this.setCancleBtn(new JButton("Cancle"));
		getCancleBtn().setBackground(Color.red);
		
	}
	
	public void render() {
		panel.add(titleText);
		
		topicPanel.add(topicText);
		topicPanel.add(topicField);
		
		datePanel.add(dateOfEventText);
		datePanel.add(daysChoice);
		datePanel.add(monthChoice);
		datePanel.add(yearChoice);
		
		timePanel.add(timeText);
		timePanel.add(startHourChoice);
		timePanel.add(startMinChoice);
		timePanel.add(startAmPmChoice);
		timePanel.add(toTimeText);
		timePanel.add(endHourChoice);
		timePanel.add(endMinChoice);
		timePanel.add(endAmPmChoice);
		
		placePanel.add(placeText);
		placePanel.add(placeField);
		
		btnPanel.setLayout(new GridLayout(1,2,0,0));
		addBtnPanel.add(getAddBtn());
		canBtnPanel.add(getCancleBtn());
		
		btnPanel.add(addBtnPanel);
		btnPanel.add(canBtnPanel);
		
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setLayout(new GridLayout(6,1,10,10));
		this.add(panel);
		this.add(topicPanel);
		this.add(datePanel);
		this.add(timePanel);
		this.add(placePanel);
		this.add(btnPanel);

	}

	public JButton getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(JButton addBtn) {
		this.addBtn = addBtn;
	}

	public JButton getCancleBtn() {
		return cancleBtn;
	}

	public void setCancleBtn(JButton cancleBtn) {
		this.cancleBtn = cancleBtn;
	}

}
