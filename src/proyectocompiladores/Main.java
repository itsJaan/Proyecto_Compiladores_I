/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import java.io.File;

/**
 *
 * @author willi
 */
public class Main {
    public static void main(String[] args) {
        String ruta = "C:/Users/ItsJaan/Documents/Docs Importantes/CLSS/ProyectoCompiladores/src/proyectocompiladores/Analizador_Lexico.flex";
        lexer(ruta);
        
        formPrincipal form = new formPrincipal();
        form.setVisible(true);
        form.show();
    }
    
    public static void lexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
