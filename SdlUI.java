package Choose;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SdlUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
//定义组件  
	JButton jb1 = new JButton("课程表");
	JButton jb2 = new JButton("选课");
	JPanel jp1, jp2, jp3, jp4 = null;
	JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlb6 = null;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		SdlUI ui = new SdlUI();
	}

	// 构造函数
	public SdlUI() // 不能申明为void!!!!!否则弹不出新界面
	{

		// 创建组件
		jb1 = new JButton("选择课程");
		jb1.setForeground(Color.BLUE);
		jb2 = new JButton("课程表");
		jb2.setForeground(Color.BLUE);

		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();

		jlb1 = new JLabel("姓名：");
		jlb2 = new JLabel("学号：");
		jlb3 = new JLabel("-----欢迎进入课程信息系统-----");
		jlb3.setForeground(Color.black);
		jlb5 = new JLabel(new DlUI().stu_name);
		jlb6 = new JLabel(new DlUI().stu_num);

		jp1.add(jlb1);
		jp1.add(jlb5);
		jp1.add(jlb2);
		jp1.add(jlb6);

		jp2.add(jb1);
		jp2.add(jb2);
		jp3.add(jlb3);

		this.add(jp1);
		this.add(jp2);
		this.add(jp3);

		// 设置布局管理器
		this.setLayout(new GridLayout(4, 3, 50, 50));
		this.setTitle("学生成绩管理系统");
		this.setSize(400, 300);
		this.setLocation(200, 200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
		jb1.addActionListener(this);
		jb2.addActionListener(this);

		jb1.addActionListener(new ActionListener() {
			// 给需要跳转的按钮加上监听。
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub\
				closeThis();
				new CourseSelectionFrame();
				// 进入到选课界面
			}

			private void closeThis() {
				// TODO Auto-generated method stub

			}

		});

		jb2.addActionListener(new ActionListener() {
			// 给需要跳转的按钮加上监听。
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub\
				closeThis();
				new Kechengbiao();
				// 进入到课程表
			}

			private void closeThis() {

				// TODO Auto-generated method stub

			}

		});
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}