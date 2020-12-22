package Test;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class CheckID_new extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static int c1;
	private static int c2;
	private static int total;
	private static JTextField txtInputID;
	private static JLabel lblMsg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			CheckID_new dialog = new CheckID_new();
			dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CheckID_new() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtInputID = new JTextField();
			txtInputID.setBounds(190, 88, 156, 27);
			contentPanel.add(txtInputID);
			txtInputID.setColumns(10);
		}
		{
			JLabel lbl_ID = new JLabel("身分證字號");
			lbl_ID.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_ID.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
			lbl_ID.setBounds(56, 88, 116, 27);
			contentPanel.add(lbl_ID);
		}
		{
			// label 字串 用來提示結果如何
			lblMsg = new JLabel("New label");
			lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
			lblMsg.setVerticalAlignment(SwingConstants.TOP);
			lblMsg.setFont(new Font("微軟正黑體", Font.PLAIN, 18));
			lblMsg.setBounds(89, 150, 257, 34);
			contentPanel.add(lblMsg);
		}

		JLabel lblTitle = new JLabel("驗證身分證");
		lblTitle.setFont(new Font("微軟正黑體", Font.PLAIN, 20));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(137, 26, 142, 27);
		contentPanel.add(lblTitle);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("檢查");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// try抓到格式有問題時，會到catch區算帳
						try {
							checkToID();	//去檢查身分證~		
						} catch (NumberFormatException err) {
							lblMsg.setText("身分證有問題!!");
						}catch(Exception err){
							lblMsg.setText("身分證格式不對!!");
						}						
					}
				});
			}
			{
				JButton cancelButton = new JButton("取消");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	// 驗證身分證是否正確的方法
	private static void checkToID() {
		String strName, strID, chkid = "0123456789ABCDEFGHJKLMNPQRSTUVXYWZIO";
		strID = txtInputID.getText(); // 得到 inputBox 的值
		// 身分證字數不到10個
		if (strID.length() != 10) {
			lblMsg.setText("長度不正確！");			
		}

		strID = strID.toUpperCase();
		c1 = chkid.indexOf(strID.charAt(0));
		c2 = chkid.indexOf(strID.charAt(1));

		if (c1 < 10) 	
			lblMsg.setText("首字字元不正確！");				

		if (c2 < 1 || c2 > 2) 			
			lblMsg.setText("性別欄不正確！");		

		// 檢查第3~第10個字元
		for (int y = 2; y < 9; ++y) {
			if (!Character.isDigit(strID.charAt(y))) 			
				lblMsg.setText("身分證字號-數字錯誤");	
		}
		
		int n = chkid.indexOf(strID.charAt(0));
		// 首字字元的加權值
		total = n / 10 + (n % 10) * 9;
		// total=total+其他字元的加權值
		for (int z = 1; z <= 8; z++)
			total += Integer.parseInt(strID.substring(z, z + 1)) * (9 - z);
		total = total + Integer.parseInt(strID.substring(9, 10));

		if (total % 10 != 0) 
			lblMsg.setText("無此身分證字號");			
		 else 
			// 跳出視窗 說成功
			lblMsg.setText("有此身分證字號");					
	}
}
