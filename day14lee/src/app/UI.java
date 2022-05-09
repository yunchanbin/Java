package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import dao.CustDao;
import frame.Dao;
import vo.CustVo;

public class UI {
	java.util.List<CustVo> clist;
	
	Dao<String, CustVo> dao;
	Frame f;
	Button b1, b2;
	Panel p1, p2;
	Panel main;
	TextField tf1, tf2, tf3;
	TextField maintf;
	List list = null;//java.awt안에 있는 List
	
	public UI() {
		dao = new CustDao();
		init();
		make();
		addEvent();
	}
	
	public void init() {
		f= new Frame("My Frame");
		b1 = new Button("ADD");
		b2 = new Button("SELECT");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		list = new List();
		
	}
	
	public void make() {
		p1.setBackground(Color.red);
		p2.setBackground(Color.blue);
		
		p2.setLayout(new BorderLayout());
		p2.add(list,"Center");
		p2.add(b2,"South");
		
		
		p1.setLayout(new GridLayout(6, 1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b1);
		
		
		main.setLayout(new GridLayout(1, 2));
		main.add(p1);
		main.add(p2);
		
		f.add(main,"Center");
		f.add(maintf,"South");
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	
	public void addEvent() {
		
		list.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				CustVo cust = clist.get(t);
				String s = cust.getId()+" "+cust.getPwd()+" "+cust.getName();
				maintf.setText(s);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tf1.getText();
				String pwd = tf2.getText();
				String name = tf3.getText();
				CustVo c = new CustVo(id, pwd, name);
				try {
					dao.insert(c);
					tf1.setText("");
					tf2.setText("");
					tf3.setText("");
					maintf.setText(id+"  Insert OK");
				} catch (Exception e1) {
					maintf.setText("Insert Error ....");
				}
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					clist = dao.select();
					for (CustVo c : clist) {
						String str = c.getId()+" "+c.getName();
						list.add(str);
						maintf.setText(clist.size()+": Completed");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	
}
