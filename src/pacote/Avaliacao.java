package pacote;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Avaliacao extends JFrame {
	MaskFormatter frmttel = null;
	MaskFormatter frmttrg = null;
	MaskFormatter frmttcep = null;
	MaskFormatter frmttcpf = null;
	MaskFormatter frmttcel = null;
	
	JLabel nm = new JLabel("Nome: ");
	JTextField txtnm = new JTextField("");
	
	JLabel end = new JLabel("Endereço: ");
	JTextField txtend = new JTextField("");
	
	JLabel cid = new JLabel("Cidade: ");
	JTextField txtcid = new JTextField("");
	
	JLabel bai = new JLabel("Bairro: ");
	JTextField txtbai = new JTextField("");
	
	JLabel fone = new JLabel("Telefone: ");
	JFormattedTextField txtfone = null;
	
	JLabel rg = new JLabel("RG: ");
	JFormattedTextField txtrg = null;
	
	
	JLabel sex = new JLabel("Sexo: ");
	JRadioButton[] rdrbtn = new JRadioButton[2];
		ButtonGroup  grp = new ButtonGroup();
	
		JLabel cep = new JLabel("CEP: ");
		JFormattedTextField txtcep = null;
		
	JLabel est = new JLabel("Estado: ");	
	JComboBox cbest = new JComboBox();
	
	JLabel cel = new JLabel("Celular: ");
	JFormattedTextField txtcel = null;
			
	JLabel cpf = new JLabel("CPF: ");
	JFormattedTextField txtcpf = null;
	
	JButton salve = new JButton("Salvar");
	
	JButton impri = new JButton("Imprimir");
	
		public Avaliacao() {
			super("Cadastro PF");
			
			Container painel = this.getContentPane();
			painel.setLayout(null);
			
			painel.add(nm);
			nm.setBounds(20,10,40,30);
			painel.add(txtnm);
			txtnm.setBounds(90,10,180,30);
			
			painel.add(end);
			end.setBounds(20,50,60,30);
			painel.add(txtend);
			txtend.setBounds(90,50,180,30);
			
			painel.add(cid);
			cid.setBounds(20,90,60,30);
			painel.add(txtcid);
			txtcid.setBounds(90,90,180,30);
			
			painel.add(bai);
			bai.setBounds(20,130,60,30);
			painel.add(txtbai);
			txtbai.setBounds(90,130,180,30);
			
			painel.add(fone);
			fone.setBounds(20,170,60,30);
			
			try {
				frmttel = new MaskFormatter("(##)####-####");
					txtfone = new JFormattedTextField(frmttel);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			painel.add(txtfone);
			txtfone.setBounds(90,170,120,30);
			
			
			painel.add(rg);
			rg.setBounds(20,210,60,30);
			
			try {
				frmttrg = new MaskFormatter("##.###.###-#");
					txtrg = new JFormattedTextField(frmttrg);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			painel.add(txtrg);
			txtrg.setBounds(90,210,120,30);
			
			painel.add(sex);
			sex.setBounds(300,10,60,30);
			rdrbtn[0] = new JRadioButton("Masculino");
			rdrbtn[1] = new JRadioButton("Feminino");
				grp.add(rdrbtn[0]);
				grp.add(rdrbtn[1]);
			painel.add(rdrbtn[0]);
			rdrbtn[0].setBounds(350,10,90,30);
			painel.add(rdrbtn[1]);
			rdrbtn[1].setBounds(440,10,80,30);
			
			painel.add(cep);
			cep.setBounds(300,50,60,30);
			
			try {
				frmttcep = new MaskFormatter("#####-###");
					txtcep = new JFormattedTextField(frmttcep);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			painel.add(txtcep);
			txtcep.setBounds(350,50,120,30);
			
			painel.add(est);
			est.setBounds(300,90,60,30);
			painel.add(cbest);
			cbest.setBounds(350,90,60,30);
			cbest.addItem("AC");
			cbest.addItem("AL");
			cbest.addItem("AP");
			cbest.addItem("AM");
			cbest.addItem("BA");
			cbest.addItem("CE");
			cbest.addItem("DF");
			cbest.addItem("ES");
			cbest.addItem("GO");
			cbest.addItem("MA");
			cbest.addItem("MT");
			cbest.addItem("MS");
			cbest.addItem("MG");
			cbest.addItem("PA");
			cbest.addItem("PB");
			cbest.addItem("PR");
			cbest.addItem("PE");
			cbest.addItem("PI");
			cbest.addItem("RJ");
			cbest.addItem("RN");
			cbest.addItem("RS");
			cbest.addItem("RO");
			cbest.addItem("RR");
			cbest.addItem("SC");
			cbest.addItem("SP");
			cbest.addItem("SE");
			cbest.addItem("TO");
			
			painel.add(cel);
			cel.setBounds(300,130,60,30);
			
			try {
				frmttcel = new MaskFormatter("(##)#####-####");
					txtcel = new JFormattedTextField(frmttcel);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			painel.add(txtcel);
			txtcel.setBounds(350,130,160,30);
			
			
			painel.add(cpf);
			cpf.setBounds(300,170,60,30);
			
			try {
				frmttcpf = new MaskFormatter("###.###.###-##");
					txtcpf = new JFormattedTextField(frmttcpf);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			painel.add(txtcpf);
			txtcpf.setBounds(350,170,160,30);
			
			
			painel.add(salve);
			salve.setBounds(250, 250, 130, 30);
			
			painel.add(impri);
			impri.setBounds(400, 250, 130, 30);
			
			
			this.setVisible(true);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setSize(600,350);
		}
		
	public static void main(String[] args) {
		Avaliacao tela = new Avaliacao();

	}

}
