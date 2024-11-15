package view;
import controller.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaDeMenuView extends JFrame {
    private final JMenu cadastroMenu;
    private final JLabel lblNomeDaTela;
    private final JMenuBar menuBar;
    private final JMenuItem novoItem;
    private final JMenuItem pesquisarItem;
    private final JMenuItem atualizarItem;
    private final JMenuItem removerItem;

    public TelaDeMenuView() {
        super("Tela de Menu");

        cadastroMenu = new JMenu("Cadastro");
        lblNomeDaTela = new JLabel("Tela de Menu", SwingConstants.CENTER);
        menuBar = new JMenuBar();

        novoItem = new JMenuItem("Novo");
        pesquisarItem = new JMenuItem("Pesquisar");
        atualizarItem = new JMenuItem("Atualizar");
        removerItem = new JMenuItem("Remover");

        cadastroMenu.add(novoItem);
        cadastroMenu.add(pesquisarItem);
        cadastroMenu.add(atualizarItem);
        cadastroMenu.add(removerItem);

        menuBar.add(cadastroMenu);

        setJMenuBar(menuBar);

        add(lblNomeDaTela, BorderLayout.CENTER);

        novoItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );

        pesquisarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );

        atualizarItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );

        removerItem.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JOptionPane.showMessageDialog(null,"Você clicou no menu: " + event.getActionCommand());
                }
            }
        );
    }

    public static TelaDeMenuView appTelaDeMenuView;
    public static void main(String[] args) {
        appTelaDeMenuView = new TelaDeMenuView();
        appTelaDeMenuView.setDefaultCloseOperation(EXIT_ON_CLOSE);
        appTelaDeMenuView.setSize(200,200);
        appTelaDeMenuView.setVisible(true);
    }
}
