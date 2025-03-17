package frame; /** Package qui contient les éléments sur l'interface graphique. */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import frame.SignUpFrame;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

/** 
 * Classe pour consrtuire l'interface utilisateur.
 * */
public class Frames extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginUserField;
	private JPasswordField passwordField;

	/**
	 * Constructeur qui permet de créer notre interfce utilisateur pour se connecter.
	 */
	public Frames() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel titleLabel = new JLabel("LOGIN PAGE");
		titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel loginLabel = new JLabel("Login User :");
		loginLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		loginUserField = new JTextField();
		loginUserField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		loginUserField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton connexionButton = new JButton("connexion"); /** Boutton qui pour se connecter*/
		connexionButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JLabel redirectionLabel = new JLabel("Pas encore de comptes? Inscris-toi ici");
		redirectionLabel.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		
		JButton signUpButton = new JButton("S'inscrire"); /** Boutton pour être redirigé vers l'interface d'inscription */
		signUpButton.addActionListener(event -> redirectSignUp());
		signUpButton.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(loginLabel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(passwordField)
								.addComponent(loginUserField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
								.addComponent(connexionButton)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(57)
							.addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addComponent(redirectionLabel, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(signUpButton)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(46)
					.addComponent(titleLabel)
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(loginLabel)
						.addComponent(loginUserField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordLabel)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(connexionButton)
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(redirectionLabel)
						.addComponent(signUpButton))
					.addContainerGap(191, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	/**
	 * Methode pour rediriger l'utilisateur à s'inscrire avant de se connecter
	 * */
	private void redirectSignUp() {
		new SignUpFrame().setVisible(true);
		this.setVisible(false);
	}
}
