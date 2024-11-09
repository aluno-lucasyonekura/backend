package controller;

import view.*;
import model.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TelaDeLoginController extends TelaDeLoginView {
    public static void logarController() {
        //aqui iremos chamar o método da model 
        ArrayList<String> resultados = new ArrayList<String>(TelaDeLoginModel.logarModel(txtLogin.getText(),String.valueOf(txtSenha.getPassword())));
    }
    
}
