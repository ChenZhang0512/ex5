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
//�������  
	JButton jb1 = new JButton("�γ̱�");
	JButton jb2 = new JButton("ѡ��");
	JPanel jp1, jp2, jp3, jp4 = null;
	JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlb6 = null;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		SdlUI ui = new SdlUI();
	}

	// ���캯��
	public SdlUI() // ��������Ϊvoid!!!!!���򵯲����½���
	{

		// �������
		jb1 = new JButton("ѡ��γ�");
		jb1.setForeground(Color.BLUE);
		jb2 = new JButton("�γ̱�");
		jb2.setForeground(Color.BLUE);

		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();

		jlb1 = new JLabel("������");
		jlb2 = new JLabel("ѧ�ţ�");
		jlb3 = new JLabel("-----��ӭ����γ���Ϣϵͳ-----");
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

		// ���ò��ֹ�����
		this.setLayout(new GridLayout(4, 3, 50, 50));
		this.setTitle("ѧ���ɼ�����ϵͳ");
		this.setSize(400, 300);
		this.setLocation(200, 200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);
		jb1.addActionListener(this);
		jb2.addActionListener(this);

		jb1.addActionListener(new ActionListener() {
			// ����Ҫ��ת�İ�ť���ϼ�����
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub\
				closeThis();
				new CourseSelectionFrame();
				// ���뵽ѡ�ν���
			}

			private void closeThis() {
				// TODO Auto-generated method stub

			}

		});

		jb2.addActionListener(new ActionListener() {
			// ����Ҫ��ת�İ�ť���ϼ�����
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub\
				closeThis();
				new Kechengbiao();
				// ���뵽�γ̱�
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