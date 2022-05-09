package app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import dao.StudentDao;
import frame.Dao;
import vo.StudentVo;

public class UI {
	java.util.List<StudentVo> clist;

	Dao<Integer, StudentVo> dao;
	Frame f;
	Button b1, b2;
	Panel p1, p2;
	Panel main;
	TextField tf1, tf2, tf3;
	TextField maintf;
	List list = null;

	public UI() {
		dao = new StudentDao();
		init();
		make();
		addEvent();
	}

	public void init() {
		f = new Frame("Exam result");
		b1 = new Button("Enter");
		b2 = new Button("Select all");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField("Input ID ...");
		tf2 = new TextField();
		tf3 = new TextField();
		list = new List();
	}

	public void make() {
		p1.setBackground(Color.black);
		p2.setBackground(Color.gray);

		p1.setLayout(new GridLayout(4, 1));
		p1.add(tf1);
		p1.add(b1);
		p1.add(tf2);
		p1.add(tf3);

		p2.setLayout(new BorderLayout());
		p2.add(list, "Center");
		p2.add(b2, "South");

		main.setLayout(new GridLayout(1, 2));
		main.add(p1);
		main.add(p2);

		f.add(main, "Center");
		f.add(maintf, "South");

		f.setSize(500, 500);
		f.setVisible(true);
	}

	public void addEvent() {

		list.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int t = list.getSelectedIndex();
				StudentVo std = clist.get(t);
				String s = String.valueOf(std.getScore());
				if (std.getScore() >= 80) {
					maintf.setText(s + ": Pass");
				} else {
					maintf.setText(s + ": Fail");
				}
			}
		});

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sid = tf1.getText();
				int id = Integer.parseInt(sid);

				StudentVo std = null;

				try {
					std = dao.select(id);
					tf1.setText("");
					tf2.setText("NAME : " + std.getName());
					tf3.setText(String.valueOf("SCORE : " + std.getScore()));
					if (std.getScore() >= 80) {
						maintf.setText(std.getName() + ": Pass. Congratulation!");
					} else {
						maintf.setText(std.getName() + ": Fail ...");
					}
				} catch (Exception e1) {
					tf2.setText("");
					tf3.setText("");
					maintf.setText("ID Error : Plese Check your ID");
				}

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					clist = dao.select();
					for (StudentVo std : clist) {
						String str = std.getId() + "  " + std.getName();
						list.add(str);
						maintf.setText(clist.size() + ": Completed");
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
