package Choose;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.JTextComponent;

import java.io.*;

public class CourseSelectionFrame extends JFrame {
    // �������
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField tfName,tfNum,allInfo;
    private JRadioButton rb1,rb2;
    private JCheckBox cb1,cb2,cb3;
    private JComboBox<String > t1,t2,t3;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    CourseSelectionFrame frame=new CourseSelectionFrame();     // ����һ������
                    frame.setVisible(true);                                    // �øô���ʵ���ɼ�
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    CourseSelectionFrame frame=new CourseSelectionFrame();
      frame.setVisible(true);
    }

    public CourseSelectionFrame(){
        setTitle("ѡ��ing......");                           // ����
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // ���ùر�ʱ�Ƴ�JVM
        setSize(500,400);                                   // ���ô��ڴ�С
        setLocationRelativeTo(null);                        // ���ô������
        contentPane=new JPanel();                           // �������
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));      // ���ò���
        setContentPane(contentPane);
        JPanel panel=new JPanel(new GridLayout(5, 1,5,10));  // 5��1�еı�񲼾�
        panel.setBorder(new TitledBorder(null,"",TitledBorder.LEADING ,TitledBorder.TOP,null,null));
        contentPane.add(panel,BorderLayout.CENTER);          // ��panel��ӱ߿�
      
        // ��һ��
        JPanel panel_2=new JPanel();
        panel.add(panel_2);
        cb1=new JCheckBox("�ߵ���ѧ");
        panel_2.add(cb1);
        t1=new JComboBox<String >();
        t1.setModel(new DefaultComboBoxModel<String>(new String[]{"����ʦ","����ʦ","����ʦ"}));
        panel_2.add(t1);
        // �ڶ���
        JPanel panel_3=new JPanel();
        panel.add(panel_3);
        cb2=new JCheckBox("���Դ���");
        panel_3.add(cb2);
        t2=new JComboBox<String >();
        t2.setModel(new DefaultComboBoxModel<String >(new String[]{"����ʦ","����ʦ"}));
        panel_3.add(t2);
        //������
        JPanel panel_4=new JPanel();
        panel.add(panel_4);
        cb3=new JCheckBox("Java");
        panel_4.add(cb3);
        t3=new JComboBox<String >();
        t3.setModel(new DefaultComboBoxModel<String>(new String[]{"����ʦ","����ʦ"}));
        panel_4.add(t3);
        // ������
        JPanel panel_5=new JPanel();
        panel.add(panel_5);
        JButton jbOk=new JButton("ȷ��");
        panel_5.add(jbOk);
        JButton jbRest=new JButton("����");
        panel_5.add(jbRest);
        // ���ѡ����Ϣ
        JPanel panelSouth=new JPanel();
        contentPane.add(panelSouth,BorderLayout.SOUTH);
        JLabel labe=new JLabel("ѡ����Ϣ");
        labe.setHorizontalAlignment(SwingConstants.LEFT);
        panelSouth.add(labe);
        allInfo=new JTextField();
        allInfo.setColumns(30);
        panelSouth.add(allInfo);
        //��ӱ���
        JPanel panelNorth=new JPanel();
        contentPane.add(panelNorth,BorderLayout.NORTH);
        JLabel labelTitle=new JLabel("ѧ��ѡ��ϵͳ");
        labelTitle.setForeground(Color.DARK_GRAY);
        labelTitle.setFont(new Font("����", Font.BOLD, 20));
        panelNorth.add(labelTitle);

        // ȷ�� 
        jbOk.addActionListener(new ActionListener() {           
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder info=new StringBuilder();
               
                if(cb1.isSelected()){
                    String c=cb1.getText();
                    String t=t1.getSelectedItem().toString();
                    info.append(":"+c+t);
                }
                if(cb2.isSelected()){
                    String c=cb2.getText();
                    String t=t2.getSelectedItem().toString();
                    info.append(","+c+t);
                }
                if(cb3.isSelected()){
                    String c=cb3.getText();
                    String t=t3.getSelectedItem().toString();
                    info.append(","+c+t);
                }
                allInfo.setText(info.toString()); // ��ѧ����Ϣ��ѡ����Ϣ�ŵ��ı�����               
            }
        });

        
        // ���� 
        jbRest.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tfName.setText("");
                tfNum.setText("");
                rb1.setSelected(true);
                cb1.setSelected(false);
                t1.setSelectedIndex(0);
                cb2.setSelected(false);
                t2.setSelectedIndex(0);
                allInfo.setText("");
            }
        });
    }

}
