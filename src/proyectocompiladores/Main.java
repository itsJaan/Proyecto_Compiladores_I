/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author willi
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String ruta_lexico = "C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/Analizador_Lexico.flex";
        String ruta_sintactico = "C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/Analizador_Sintactico.flex";
        String[] sintaxis = {"-parser", "Sintax", "C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/Analizador_Sintactico.cup"};
        lexer(ruta_lexico, ruta_sintactico, sintaxis);
        
        
        
    }
    
    public static void lexer(String ruta_lexico, String ruta_sintactico, String[] sintaxis) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta_lexico);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta_sintactico);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(sintaxis);
        
        Path rutaSym = Paths.get("C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/sym.java");
        if (Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(Paths.get("C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/sym.java"),
                   Paths.get("C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/sym.java")
        );
        
        Path rutaSintax = Paths.get("C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/Sintax.java");
        if (Files.exists(rutaSintax)){
            Files.delete(rutaSintax);
        }
        Files.move(Paths.get("C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/Sintax.java"),
                   Paths.get("C:/Users/willi/OneDrive/Documents/NetBeansProjects/Proyecto_Compiladores_I-master/src/proyectocompiladores/Sintax.java")
        );
    }
}
