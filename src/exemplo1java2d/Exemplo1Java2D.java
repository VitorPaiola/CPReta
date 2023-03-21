package exemplo1java2d;

import javax.swing.JFrame;

public class Exemplo1Java2D {

	public static void main(String[] args) {
		
		// Instanciando um objeto da classe DesenhaLinha
		DesenhaLinha dl = new DesenhaLinha();
		
		// Cria uma janela - GUI (Interface Gráfica)
		JFrame jf = new JFrame();
		
		// Configura o frame para ser encerrado quando ele é fechado
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Adiciona o objeto da classe DesenhaLinha ao frame
		jf.add(dl);
		
		// Tamanho da janela
		jf.setSize(300, 300);
		
		jf.setVisible(true);

	}

}
