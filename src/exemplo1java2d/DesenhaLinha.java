package exemplo1java2d;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhaLinha extends JPanel {

	// Método para pintar a tela um componente gráfico
	public void paintComponent(Graphics g) {
		
		// Chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		// Variáveis para o tamanho da linha
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total
		
		// Desenha uma linha usando o método drawLine da biblioteca Graphics
		g.drawLine(400, 10, 0, 0);
		
	}
	
}
