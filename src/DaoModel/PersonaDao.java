/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoModel;

import Modelos.Persona;

/**
 *
 * @author antony
 */
public interface PersonaDao {
    boolean Registro(Persona per);
    boolean InicioSession();
}
