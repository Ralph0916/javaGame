package javashisxun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cs extends JFrame implements ActionListener{
	String imAddress[]={"d:\\01.jpg","d:\\02.jpg","d:\\03.jpg","d:\\04.jpg","d:\\05.jpg","d:\\06.jpg","d:\\07.jpg","d:\\08.jpg","d:\\09.jpg"};
	String idiom[]={"百_挑_","金_满_","满_经_","海_天_","珠_宝_","_虎藏_","花_公_","海_山_","高_流_"};
	String answ[]= {"百里挑一","金玉满堂","满腹经伦","海阔天空","珠光宝气","卧虎藏龙","花花公子","海誓山盟","高山流水"};
	int m=0,n=0;
	JButton sure;
	JButton cancel;
	JButton next;
	JLabel l1;
	JLabel l2;
	JLabel photo;
	JTextField t1;
	JPanel j1,j2;
	
	public cs() {
		  sure=new JButton("确定");
		  cancel=new JButton("取消");
		  next=new JButton("下一个");
		  t1=new JTextField(5);
		  photo=new JLabel();
		  photo.setIcon(new ImageIcon(imAddress[0]));
		  l1=new JLabel("请按照提示输入成语：");
		  l2=new JLabel(idiom[0]);
		  j1=new JPanel();
		  j2=new JPanel();
		  
		  j1.add(photo);
		  j1.add(l2);
		  j1.add(next);
		  j2.add(l1);
		  j2.add(t1);
		  j2.add(sure);
		  j2.add(cancel);
		  next.addActionListener(this);
		  sure.addActionListener(this);
		  cancel.addActionListener(this);
		  		  
		  this.setTitle("猜成语");
		  this.setSize(413, 320);
		  this.setLocationRelativeTo(null);  
		  this.add(photo,BorderLayout.NORTH);
		  this.add(j1,BorderLayout.CENTER);
		  this.add(j2,BorderLayout.SOUTH);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setResizable(false);
		  this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next){
			n=(n+1)%idiom.length;
			l2.setText(idiom[n]);
		}
		if(e.getSource()==cancel){
			t1.setText(null);
		}
		if(e.getSource()==sure){
			if(t1.getText().equals(answ[n])){
				t1.setText("");
				n=(n+1)%idiom.length;
				l2.setText(idiom[n]);
				m=(m+1)%imAddress.length;
		        photo.setIcon(new ImageIcon(imAddress[m]));
			}			
			else {			
				JOptionPane.showMessageDialog(null, "输入错误");
			}
		}		
	}
	public static void main(String[] args) {
		new cs();
	}
}
