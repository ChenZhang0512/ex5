package Choose;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import javax.swing.JButton;
import Choose.DlUI;  
@SuppressWarnings("serial")
public class TdlUI extends JFrame implements ActionListener  
{   
    JButton jb1,jb2=null;  
    JPanel jp1,jp2,jp3,jp4=null;  
    JLabel jlb1,jlb2,jlb3,jlb5,jlb6=null;  

    @SuppressWarnings("unused")
	public static void main(String[] args) {            
      TdlUI  ui=new TdlUI();  
    }    
    public  TdlUI()  
    {  
        //�������  
        jb1=new JButton("�γ̹���");
        jb1.setForeground(Color.BLUE);
        jb2=new JButton("ѧ������");  
        jb2.setForeground(Color.BLUE);

        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  

        jlb1=new JLabel("������");  
        jlb2=new JLabel("���ţ�");  
        jlb3=new JLabel("------��ӭʹ��ѧ��ѡ��ϵͳ-------"); 
        jlb3.setForeground(Color.red);
       
        jlb5=new JLabel(new DlUI().tea_name);
        jlb6=new JLabel(new DlUI().tea_num);

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
        this.setLayout(new GridLayout(4,3,50,50));  //���ò��ֹ�����  
        this.setTitle("ѧ��ѡ��ϵͳ");  
        this.setSize(400,300);  
        this.setLocation(200, 200);       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);            
        jb1.addActionListener(this);
        jb2.addActionListener(this);

    jb1.addActionListener(new ActionListener() {
		//����Ҫ��ת�İ�ť���ϼ�����
		@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub\
			closeThis();
				new Kechengguanli ();
			//���뵽�鿴�γ̰��Ž���
			}
			private void closeThis() {
			// TODO Auto-generated method stub
			}
    });
   jb2.addActionListener(new ActionListener() {
		//����Ҫ��ת�İ�ť���ϼ�����
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub\
			closeThis();
				new Xueshengmingdan();
			//���뵽�鿴ѧ����������
			}
			private void closeThis() {
			// TODO Auto-generated method stub
			}
    });
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

} 