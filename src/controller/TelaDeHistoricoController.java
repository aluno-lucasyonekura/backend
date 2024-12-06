package controller;

import view.*;
import model.*;

public class TelaDeHistoricoController extends TelaDeHistoricoView {
    public static String[] preencherHistorico() {
        String[] historicos = TelaDeHistoricoModel.capturarHistorico();
        return historicos;
    }
}