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
        //创建组件  
        jb1=new JButton("课程管理");
        jb1.setForeground(Color.BLUE);
        jb2=new JButton("学生名单");  
        jb2.setForeground(Color.BLUE);

        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  

        jlb1=new JLabel("姓名：");  
        jlb2=new JLabel("工号：");  
        jlb3=new JLabel("------欢迎使用学生选课系统-------"); 
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
        this.setLayout(new GridLayout(4,3,50,50));  //设置布局管理器  
        this.setTitle("学生选课系统");  
        this.setSize(400,300);  
        this.setLocation(200, 200);       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setVisible(true);            
        jb1.addActionListener(this);
        jb2.addActionListener(this);

    jb1.addActionListener(new ActionListener() {
		//给需要跳转的按钮加上监听。
		@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub\
			closeThis();
				new Kechengguanli ();
			//进入到查看课程安排界面
			}
			private void closeThis() {
			// TODO Auto-generated method stub
			}
    });
   jb2.addActionListener(new ActionListener() {
		//给需要跳转的按钮加上监听。
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub\
			closeThis();
				new Xueshengmingdan();
			//进入到查看学生名单界面
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