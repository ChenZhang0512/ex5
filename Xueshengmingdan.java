package Choose;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class Xueshengmingdan extends JFrame {

	public Xueshengmingdan() {
		intiComponent();
	}

	// ��ʼ���������
	private void intiComponent() {
		// ����JTable������
		String[] columnNames = { "ѧ��", "����", "רҵ", "�༶" };
		Object[][] obj = new Object[7][7];
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				switch (j) {
				case 0:
					obj[0][0] = "       2018311001";
					obj[0][1] = "             ����";
					obj[0][2] = "         ������";
					obj[0][3] = "                    2";
					break;
				case 1:
					obj[1][0] = "       2018311002";
					obj[1][1] = "            ����";
					obj[1][2] = "         �����";
					obj[1][3] = "                    2";
					break;
				case 2:
					obj[2][0] = "      2018311003";
					obj[2][1] = "            ����";
					obj[2][2] = "         ������";
					obj[2][3] = "                    2";
					break;
				case 3:
					obj[3][0] = "      2018311004";
					obj[3][1] = "            ����";
					obj[3][2] = "         ͨ�Ź���";
					obj[3][3] = "                    2";
					break;

				}
			}
		}

		JTable table = new JTable(obj, columnNames); // JTable������һ�ֹ��췽��
		TableColumn column = null; // ����JTable����Ĭ�ϵĿ��Ⱥ͸߶�
		int colunms = table.getColumnCount();
		for (int i = 0; i < colunms; i++) {
			column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth(100); // ��ÿһ�е�Ĭ�Ͽ�������Ϊ100
		}
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // ����JTable�Զ������б���״̬���˴�����Ϊ�ر�
		JScrollPane scroll = new JScrollPane(table); // ��JScrollPaneװ��JTable������������Χ���оͿ���ͨ�����������鿴
		scroll.setSize(300, 50);

		add(scroll);

		this.setLocation(450, 200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}

	public static void main(String[] args) {
		new Xueshengmingdan();
	}
}