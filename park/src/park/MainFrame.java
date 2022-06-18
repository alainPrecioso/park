package park;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import net.miginfocom.swing.MigLayout;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1111, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		

		Park park = new Park(20, "parking du coin", "125 rue random");
		ArrayList<Vehicle> arrlist = new ArrayList<Vehicle>();
		
		for (int i = 0 ; i< 20 ; i++) {
			arrlist.add(Vehicle.vehicle());
		}
		
		
		
		
		
		JList parkJList = new JList(park.getPark());
		//JList parkJList = new JList(arrlist.toArray());
		contentPane.add(parkJList, BorderLayout.WEST);
		
		
		JList carsJList = new JList(arrlist.toArray());
		//JList<Vehicle> carsJList = new JList<Vehicle>();
		contentPane.add(carsJList, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new MigLayout("", "[1087px]", "[21px]"));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("<<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int spot = (int) comboBox.getSelectedItem() - 1;
				
				
				
				park.parkAdd(spot, carsJList.getSelectedValuesList().get(0));
				arrlist.remove(spot);
				carsJList.setListData(arrlist.toArray());
				parkJList.setListData(park.getPark());
				
				
				
			}
		});
		panel_1.add(btnNewButton, BorderLayout.NORTH);
		
		
		Integer[] combo = new Integer[park.getPark().length];
		for (int i = 1; i <= combo.length; i++) {
			combo[i-1] = i;
		}
		
		
		comboBox = new JComboBox(combo);
		panel_1.add(comboBox, BorderLayout.SOUTH);
		
	}

}
