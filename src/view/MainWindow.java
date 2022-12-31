/**
 * Desenvolvido por:
 * Bruno de Santana Carvalho
 * Cleyan Sampaio dos Santos
 * Elber Luiz Batista Costa
 * Kaylan Santos da Silva
 */

package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.Serial;
import java.text.DecimalFormat;

public class MainWindow extends JFrame {
	/***************************************************************************
	|*+---------------------------+| Attributes |+---------------------------+*|
	***************************************************************************/
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	/*-| Icones e imagens |--------------------------------------------------*/

	// Icones
	private ImageIcon icon_app = new ImageIcon("src/images/icons/app512x512.png");
	private ImageIcon icon_info = new ImageIcon("src/images/icons/info16x16.png");
	private ImageIcon icon_deletar = new ImageIcon("src/images/icons/deletar24x24.png");
	private ImageIcon icon_calcular = new ImageIcon("src/images/icons/calcular16x16.png");
	private ImageIcon icon_limpar = new ImageIcon("src/images/icons/limpar16x16.png");
			
	// Imagens
	private ImageIcon img_imc_1 = new ImageIcon("src/images/imc_1.png");
	private ImageIcon img_imc_2 = new ImageIcon("src/images/imc_2.png");
	private ImageIcon img_imc_3 = new ImageIcon("src/images/imc_3.png");
	private ImageIcon img_imc_4 = new ImageIcon("src/images/imc_4.png");
	private ImageIcon img_imc_5 = new ImageIcon("src/images/imc_5.png");
	private ImageIcon img_imc_table = new ImageIcon("src/images/imc_table.png");
	
	/*-| Título |------------------------------------------------------------*/
	
	private JPanel panel_titulo = new JPanel();
	
	private JLabel lb_titulo = new JLabel();
		
	/*-| NumberPad |---------------------------------------------------------*/
	
	private JPanel panel_numberPad = new JPanel();
	
	private JLabel lb_info = new JLabel();
	
	private JButton btn_1 = new JButton();
	private JButton btn_2 = new JButton();
	private JButton btn_3 = new JButton();
	private JButton btn_4 = new JButton();
	private JButton btn_5 = new JButton();
	private JButton btn_6 = new JButton();
	private JButton btn_7 = new JButton();
	private JButton btn_8 = new JButton();
	private JButton btn_9 = new JButton();
	private JButton btn_0 = new JButton();
	private JButton btn_ponto = new JButton();
	private JButton btn_deletar = new JButton();
	
	/*-| Altura e peso |------------------------------------------------------*/
	
	private JPanel panel_alturaPeso = new JPanel();
	
	private JLabel lb_altura = new JLabel();
	private JLabel lb_peso = new JLabel();
	
	private JTextField tf_altura = new JTextField();
	private JTextField tf_peso = new JTextField();	
	
	/*-| Calcular e Limpar |-------------------------------------------------*/
	
	private JPanel panel_calcularLimpar = new JPanel();
	
	private JButton btn_calcular = new JButton();
	private JButton btn_limpar = new JButton();
		
	/*-| Tabela |------------------------------------------------------------*/
	
	private JPanel panel_tabela = new JPanel();
	
	/*-| Resultado |---------------------------------------------------------*/
	
	private JPanel panel_resultado = new JPanel();
	
	private JTextField tf_seuImc = new JTextField();
	private JTextField tf_classificacao = new JTextField();
	
	private JLabel lb_imc_1 = new JLabel(img_imc_1);
	private JLabel lb_imc_2 = new JLabel(img_imc_2);
	private JLabel lb_imc_3 = new JLabel(img_imc_3);
	private JLabel lb_imc_4 = new JLabel(img_imc_4);
	private JLabel lb_imc_5 = new JLabel(img_imc_5);
	private JLabel lb_imc_table = new JLabel(img_imc_table);
	
	/**************************************************************************
	|*+--------------------------+| Constructor |+--------------------------+*|
	**************************************************************************/
	
	public MainWindow() {
		getContentPane().setLayout(null);
		setTitle("Calculadora de IMC");
		setBounds(600, 100, 490, 552);
		getContentPane().setBackground(new Color(255, 255, 255));
		setIconImage(icon_app.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
        
		titulo();
		number_pad();
		altura_peso();
		calcular_limpar();
		tabela();
		resultado();
	}
	
	/**************************************************************************
	|*+----------------------------+| Methods |+----------------------------+*|
	**************************************************************************/

	public void titulo() {
		panel_titulo.setLayout(null);
		panel_titulo.setBounds(0, 0, 474, 81);
		panel_titulo.setBackground(new Color(51, 153, 255));
		getContentPane().add(panel_titulo);
		
		lb_titulo.setText("Calculadora de IMC");
		lb_titulo.setBounds(112, 25, 249, 31);
		lb_titulo.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lb_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		lb_titulo.setForeground(Color.WHITE);
		lb_titulo.setFocusable(false);
		
		panel_titulo.add(lb_titulo);
	}

	public void number_pad() {
		final int BTN_WIDTH = 65;
		final int BTN_HEIGHT = 45;
		
		panel_numberPad.setLayout(null);
		panel_numberPad.setBounds(263, 92, 196, 210);
		panel_numberPad.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_numberPad);
		
		lb_info.setText("Digite apenas usando esse teclado");
		lb_info.setBounds(6, 0, 184, 24);
		lb_info.setFont(new Font("Segoe UI", Font.BOLD, 10));		
		lb_info.setForeground(new Color(153, 0, 0));
		lb_info.setHorizontalAlignment(SwingConstants.CENTER);
		lb_info.setIcon(icon_info);
		
		btn_0.setText("0");
		btn_0.setBounds(0, 163, BTN_WIDTH, BTN_HEIGHT);
		btn_0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_0.setForeground(new Color(0, 0, 0));
		btn_0.setBackground(new Color(244, 244, 244));
		btn_0.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_0.setFocusable(false);
		
		btn_1.setText("1");
		btn_1.setBounds(0, 118, BTN_WIDTH, BTN_HEIGHT);
		btn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_1.setForeground(new Color(0, 0, 0));
		btn_1.setBackground(new Color(244, 244, 244));
		btn_1.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_1.setFocusable(false);		
		
		btn_2.setText("2");
		btn_2.setBounds(65, 118, BTN_WIDTH, BTN_HEIGHT);
		btn_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_2.setForeground(new Color(0, 0, 0));
		btn_2.setBackground(new Color(244, 244, 244));
		btn_2.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_2.setFocusable(false);
		
		btn_3.setText("3");
		btn_3.setBounds(130, 118, BTN_WIDTH, BTN_HEIGHT);
		btn_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_3.setForeground(new Color(0, 0, 0));
		btn_3.setBackground(new Color(244, 244, 244));
		btn_3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_3.setFocusable(false);
		
		btn_4.setText("4");
		btn_4.setBounds(0, 73, BTN_WIDTH, BTN_HEIGHT);
		btn_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_4.setForeground(new Color(0, 0, 0));
		btn_4.setBackground(new Color(244, 244, 244));
		btn_4.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_4.setFocusable(false);
		
		btn_5.setText("5");
		btn_5.setBounds(65, 73, BTN_WIDTH, BTN_HEIGHT);
		btn_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_5.setForeground(new Color(0, 0, 0));
		btn_5.setBackground(new Color(244, 244, 244));
		btn_5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_5.setFocusable(false);
		
		btn_6.setText("6");
		btn_6.setBounds(130, 73, BTN_WIDTH, BTN_HEIGHT);
		btn_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_6.setForeground(new Color(0, 0, 0));
		btn_6.setBackground(new Color(244, 244, 244));
		btn_6.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_6.setFocusable(false);
		
		btn_7.setText("7");
		btn_7.setBounds(0, 28, BTN_WIDTH, BTN_HEIGHT);
		btn_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_7.setForeground(new Color(0, 0, 0));
		btn_7.setBackground(new Color(244, 244, 244));
		btn_7.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_7.setFocusable(false);
		
		btn_8.setText("8");
		btn_8.setBounds(65, 28, BTN_WIDTH, BTN_HEIGHT);
		btn_8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_8.setForeground(new Color(0, 0, 0));
		btn_8.setBackground(new Color(244, 244, 244));
		btn_8.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_8.setFocusable(false);
		
		btn_9.setText("9");
		btn_9.setBounds(130, 28, BTN_WIDTH, BTN_HEIGHT);
		btn_9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_9.setForeground(new Color(0, 0, 0));
		btn_9.setBackground(new Color(244, 244, 244));
		btn_9.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_9.setFocusable(false);				
		
		btn_ponto.setText(".");
		btn_ponto.setBounds(65, 163, BTN_WIDTH, BTN_HEIGHT);
		btn_ponto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_ponto.setForeground(new Color(0, 0, 0));
		btn_ponto.setBackground(new Color(244, 244, 244));
		btn_ponto.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_ponto.setFocusable(false);		
		
		btn_deletar.setBounds(130, 163, BTN_WIDTH, BTN_HEIGHT);
		btn_deletar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_deletar.setForeground(new Color(0, 0, 0));
		btn_deletar.setBackground(new Color(244, 244, 244));
		btn_deletar.setFont(new Font("Segoe UI", Font.PLAIN, 25));
		btn_deletar.setIcon(icon_deletar);
		btn_deletar.setFocusable(false);
		
		panel_numberPad.add(lb_info);
		panel_numberPad.add(btn_0);
		panel_numberPad.add(btn_1);
		panel_numberPad.add(btn_2);
		panel_numberPad.add(btn_3);
		panel_numberPad.add(btn_4);
		panel_numberPad.add(btn_5);
		panel_numberPad.add(btn_6);
		panel_numberPad.add(btn_7);
		panel_numberPad.add(btn_8);
		panel_numberPad.add(btn_9);
		panel_numberPad.add(btn_ponto);
		panel_numberPad.add(btn_deletar);
		
		final int LIMITE_TF_ALTURA = 4;
		final int LIMITE_TF_PESO = 6;
		
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '0', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '0', tf_peso);
			}
		});
		
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '1', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '1', tf_peso);
			}
		});
		
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '2', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '2', tf_peso);
			}
		});
		
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '3', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '3', tf_peso);
			}
		});
		
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '4', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '4', tf_peso);
			}
		});
		
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '5', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '5', tf_peso);
			}
		});
		
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '6', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '6', tf_peso);
			}
		});	
		
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '7', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '7', tf_peso);
			}
		});
		
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '8', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '8', tf_peso);
			}
		});
		
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '9', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '9', tf_peso);
			}
		});
		
		btn_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limitarTexfField(LIMITE_TF_ALTURA, '.', tf_altura);
				limitarTexfField(LIMITE_TF_PESO, '.', tf_peso);
			}
		});
		
		btn_deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField tf_focoAtual = (JTextField) getFocusOwner();
				String text = tf_focoAtual.getText();
				
				if (text.length() > 0)
					text = text.substring(0, text.length() - 1);
				
				tf_focoAtual.setText(text);
			}
		});		
	}

	public void altura_peso() {
		panel_alturaPeso.setLayout(null);
		panel_alturaPeso.setBounds(19, 92, 237, 81);
		panel_alturaPeso.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_alturaPeso);
		
		lb_altura.setText("Altura (ex.: 1.70)");
		lb_altura.setBounds(0, 0, 114, 30);
		lb_altura.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lb_altura.setHorizontalAlignment(SwingConstants.CENTER);
        lb_altura.setForeground(new Color(51, 153, 255));
        
        lb_peso.setText("Peso (ex.: 74.24)");
        lb_peso.setBounds(123, 0, 114, 30);
        lb_peso.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lb_peso.setHorizontalAlignment(SwingConstants.CENTER);   
        lb_peso.setForeground(new Color(51, 153, 255));
        
        tf_altura.setBounds(0, 32, 114, 49);
        tf_altura.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf_altura.setHorizontalAlignment(SwingConstants.CENTER);
        tf_altura.setColumns(10);
        
        tf_peso.setBounds(123, 32, 114, 49);
        tf_peso.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf_peso.setHorizontalAlignment(SwingConstants.CENTER);
        tf_peso.setColumns(10);
        
        panel_alturaPeso.add(lb_altura);
        panel_alturaPeso.add(lb_peso);
        panel_alturaPeso.add(tf_altura);
        panel_alturaPeso.add(tf_peso);
        
        tf_altura.addKeyListener(new KeyAdapter() {
        	public void keyTyped(KeyEvent e) {
				if (Character.isDefined(e.getKeyChar()))
					e.consume();
        	}
        });
        
        tf_peso.addKeyListener(new KeyAdapter() {
        	public void keyTyped(KeyEvent e) {
        		if (Character.isDefined(e.getKeyChar()))
					e.consume();
        	}
        });
	}

	public void calcular_limpar() {
		panel_calcularLimpar.setLayout(null);
		panel_calcularLimpar.setBounds(19, 184, 237, 118);
		panel_calcularLimpar.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_calcularLimpar);
		
		btn_calcular.setText("Calcular");
		btn_calcular.setBounds(0, 0, 237, 56);
		btn_calcular.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_calcular.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn_calcular.setBackground(new Color(198, 255, 198));
		btn_calcular.setForeground(new Color(51, 51, 51));
		btn_calcular.setIcon(icon_calcular);
		btn_calcular.setFocusable(false);
		
		btn_limpar.setText("Limpar campos");
		btn_limpar.setBounds(0, 60, 237, 56);
		btn_limpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_limpar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn_limpar.setBackground(new Color(255, 213, 213));
		btn_limpar.setForeground(new Color(51, 51, 51));
		btn_limpar.setIcon(icon_limpar);
		btn_limpar.setFocusable(false);
		
		panel_calcularLimpar.add(btn_limpar);
		panel_calcularLimpar.add(btn_calcular);
		
		btn_calcular.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        double altura, peso, resultado;
		        
		        altura = Double.parseDouble(tf_altura.getText());
	        	peso = Double.parseDouble(tf_peso.getText());
	        	
	        	resultado = peso / (altura * altura);
				
	        	lb_imc_1.setVisible(false);
	        	lb_imc_2.setVisible(false);
	        	lb_imc_3.setVisible(false);
	        	lb_imc_4.setVisible(false);
	        	lb_imc_5.setVisible(false);
	        	
	        	verificarIMC(resultado);
	        	
	        	setSize(490, 665);
		    }
		});
		    
		btn_limpar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        tf_altura.setText("");
		        tf_peso.setText("");
		        
		        tf_seuImc.setText("");
		        tf_classificacao.setText("");
		        
		        lb_imc_1.setVisible(false);
				lb_imc_2.setVisible(false);
				lb_imc_3.setVisible(false);
				lb_imc_4.setVisible(false);
				lb_imc_5.setVisible(false);
				tf_seuImc.setVisible(false);
		        tf_classificacao.setVisible(false);
				
				setSize(490, 552);
		    }
		});
	}

	public void tabela() {
		panel_tabela.setLayout(null);
		panel_tabela.setBounds(19, 320, 440, 180);
		panel_tabela.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_tabela);
		
		lb_imc_table.setSize(440, 180);
		lb_imc_table.setLocation(0, 0);
		lb_imc_table.setVisible(true);
		
		panel_tabela.add(lb_imc_table);
	}

	public void resultado() {
		final int LB_WIDTH = 63;
		final int LB_HEIGHT = 106;
		final int LB_X = 411;
		final int LB_Y = 0;
		
		panel_resultado.setLayout(null);
		panel_resultado.setBounds(0, 520, 474, 106);
		panel_resultado.setBackground(new Color(51, 153, 255));
		getContentPane().add(panel_resultado);
		
		tf_seuImc.setBounds(-2, -2, 411, 57);
		tf_seuImc.setFont(new Font("Segoe UI", Font.BOLD, 23));
		tf_seuImc.setHorizontalAlignment(SwingConstants.CENTER);
		tf_seuImc.setForeground(new Color(255, 255, 255));
		tf_seuImc.setBackground(new Color(0, 0, 0));
		tf_seuImc.setColumns(10);
		tf_seuImc.setVisible(true);
		tf_seuImc.setEditable(false);
		tf_seuImc.setFocusable(false);
		
		tf_classificacao.setBounds(-2, 53, 411, 57);
		tf_classificacao.setFont(new Font("Segoe UI", Font.BOLD, 23));
		tf_classificacao.setHorizontalAlignment(SwingConstants.CENTER);
		tf_classificacao.setForeground(new Color(255, 255, 255));
		tf_classificacao.setBackground(new Color(0, 0, 0));
		tf_classificacao.setColumns(10);
		tf_classificacao.setVisible(true);		
		tf_classificacao.setEditable(false);
		tf_classificacao.setFocusable(false);
		
		lb_imc_1.setSize(LB_WIDTH, LB_HEIGHT);
		lb_imc_1.setLocation(LB_X, LB_Y);
		lb_imc_1.setVisible(false);
		
		lb_imc_2.setSize(LB_WIDTH, LB_HEIGHT);		
		lb_imc_2.setLocation(LB_X, LB_Y);
		lb_imc_2.setVisible(false);	
		
		lb_imc_3.setSize(LB_WIDTH, LB_HEIGHT);
		lb_imc_3.setLocation(LB_X, LB_Y);
		lb_imc_3.setVisible(false);		
		
		lb_imc_4.setSize(LB_WIDTH, LB_HEIGHT);
		lb_imc_4.setLocation(LB_X, LB_Y);
		lb_imc_4.setVisible(false);		
		
		lb_imc_5.setSize(LB_WIDTH, LB_HEIGHT);
		lb_imc_5.setLocation(LB_X, LB_Y);
		lb_imc_5.setVisible(false);
				
		panel_resultado.add(lb_imc_1);
		panel_resultado.add(lb_imc_2);
		panel_resultado.add(lb_imc_3);
		panel_resultado.add(lb_imc_4);		
		panel_resultado.add(lb_imc_5);
		panel_resultado.add(tf_seuImc);
		panel_resultado.add(tf_classificacao);
	}

	public void verificarIMC (double imc) {
        tf_classificacao.setVisible(true);
        tf_seuImc.setVisible(true);
        
        DecimalFormat df = new DecimalFormat("#.##");
        
		if (imc < 18.5) {
			tf_seuImc.setText("SEU IMC É " + df.format(imc));
			tf_classificacao.setText("Você está abaixo do peso");
			lb_imc_1.setVisible(true);
		}
		
		else if (imc >= 18.5 && imc <= 24.9) {
			tf_seuImc.setText("SEU IMC É " + df.format(imc));
			tf_classificacao.setText("Você está no peso ideal");
			lb_imc_2.setVisible(true);
		}
		
		else if (imc >= 25 && imc <= 29.9) {
			tf_seuImc.setText("SEU IMC É " + df.format(imc));
			tf_classificacao.setText("Você está com Obesidade Grau I");
			lb_imc_3.setVisible(true);
		}
		
		else if (imc >= 30 && imc <= 39.9) {
			tf_seuImc.setText("SEU IMC É " + df.format(imc));
			tf_classificacao.setText("Você está com Obesidade Grau II");
			lb_imc_4.setVisible(true);
		}
		
		else if (imc >= 40) {
			tf_seuImc.setText("SEU IMC É " + df.format(imc));
			tf_classificacao.setText("Você está com Obesidade Grau III");
			lb_imc_5.setVisible(true);
		}
	}	

	public void limitarTexfField(int max, char c, JTextField tf) {
		if (tf.isFocusOwner()) {
			if (tf.getText().length() < max) {
				tf.setText(tf.getText() + c);
			}
		}
	}
	
	/**************************************************************************
	**************************************************************************/
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow jframe = new MainWindow();
					jframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}