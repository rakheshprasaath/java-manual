	import javax.swing.*;  
	public class Table {  
	    JFrame f;  
	Table(){  
	    f=new JFrame();  
	      
	    String data[][]={ {"101","Sharma","670000"}, {"102","vijay","780000"},{"101","Rakhesh","700000"}};  
	    String column[]={"ID","NAME","SALARY"};  
	    JTable jt=new JTable(data,column);
	    jt.setBounds(30,40,200,300);
            f.add(jt);  
	    f.setSize(300,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
	public static void main(String[] args) {  
	    new Table();  
	}  
	}  
