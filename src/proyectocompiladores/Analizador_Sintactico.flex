package proyectocompiladores;
import java_cup.runtime.Symbol;
%%
%public
%unicode
%class Analizador_Sintactico
%type java_cup.runtime.Symbol
%line
%char
%cup
%full


digitos = -?[0-9]+
id= [a-zA-Z|\_]+[a-zA-Z|\_|0-9]*
operadores_relacionales= [>=|<=|=|<|>]
moduler=Mod
operadores_aritmeticos = [\+|-|\*|\/|\^]
espacios= [ \t\r\n]+
textos = [\"].+[\"]
comentarios = [\'].+
caracteres_reservados = [\.|\"|\'|\(|\)|\{|\}|\,]
fin_de_linea = [\n]
continuacion_linea= [\&\_|\_]
Reservadas = [I|i][M|m][P|p][O|o][R|r][T|t][S|s]|
             [P|p][U|u][B|b][L|l][I|i][C|c]|
             [M|m][O|o][D|d][U|u][L|l][E|e]|
             [S|u][U|u][B|b]|
             [F|f][O|o][R|r]|
             [I|i][F|f]|
             [D|d][I|i][M|m]|
             [E|e][N|n][D|d]|
             [I|i][N|n][T|t][E|e][G|g][E|e][R|r]|
             [B|b][O|o][O|o][L|l][E|e][A|a][N|n]|
             [S|s][T|t][R|r][I|i][N|n][G|g]|
             [S|s][Y|y][S|s][T|t][E|e][M|m]|
             [C|c][O|o][N|n][S|s][O|o][L|l][E|e]|
             [W|w][R|r][I|i][T|t][E|e][L|l][I|i][N|n][E|e]|
             [A|a][S|s]|
             [D|d][O|o]|
             [W|w][H|h][I|i][L|l][E|e]|
             [S|s][T|t][R|r][U|u][C|c][T|t]|
             [T|t][H|h][E|e][N|n]|
             [E|e][L|l][S|s][E|e]|
             [F|f][U|u][N|n][C|c][T|t][I|i][O|o][N|n]|
             [R|r][E|e][T|t][U|u][R|r][N|n]|
             [N|n][E|e][X|x][T|t]|
             [P|p][R|r][I|i][V|v][A|a][T|t][E|e]|
             [L|l][O|o][O|o][P|p]|
             [E|e][X|x][I|i][T|t]|
             [U|u][N|n][T|t][I|i][L|l]|
             [T|t][O|o]|
             [A|a][N|n][D|d]|
             [O|o][R|r]|
             [T|t][R|r][U|u][E|e]|
             [F|f][A|a][L|l][S|s][E|e]|
             [L|l][I|i][K|k][E|e]|
             [M|m][O|o][D|d]|
             [I|i][N|n][T|t]|
             [N|n][U|u][L|l][L|l]
             [M|m][A|a][I|i][N|n]
             [S|s][T|t][E|e][P|p]
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%% 



<YYINITIAL>{
        
        {Reservadas}                    {
                                        if(yytext().equalsIgnoreCase("if")){return new Symbol(sym.if_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("imports")){return new Symbol(sym.imports, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("public")){return new Symbol(sym.public_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("module")){return new Symbol(sym.module, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("sub")){return new Symbol(sym.sub, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("for")){return new Symbol(sym.for_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("dim")){return new Symbol(sym.dim, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("end")){return new Symbol(sym.end_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("integer")){return new Symbol(sym.integer_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("boolean")){return new Symbol(sym.boolean_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("string")){return new Symbol(sym.string_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("system")){return new Symbol(sym.system_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("console")){return new Symbol(sym.console_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("writeline")){return new Symbol(sym.writeline, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("as")){return new Symbol(sym.as, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("do")){return new Symbol(sym.do_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("while")){return new Symbol(sym.while_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("struct")){return new Symbol(sym.struct_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("then")){return new Symbol(sym.then, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("else")){return new Symbol(sym.else_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("function")){return new Symbol(sym.function_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("return")){return new Symbol(sym.return_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("next")){return new Symbol(sym.next, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("private")){return new Symbol(sym.private_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("loop")){return new Symbol(sym.loop, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("exit")){return new Symbol(sym.exit, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("until")){return new Symbol(sym.until, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("to")){return new Symbol(sym.to, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("and")){return new Symbol(sym.and, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("or")){return new Symbol(sym.or, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("true")){return new Symbol(sym.true_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("false")){return new Symbol(sym.false_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("like")){return new Symbol(sym.like, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("mod")){return new Symbol(sym.mod, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("int")){return new Symbol(sym.int_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("null")){return new Symbol(sym.null_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("main")){return new Symbol(sym.main_, yychar, yyline, yytext());}
                                        if(yytext().equalsIgnoreCase("step")){return new Symbol(sym.step_, yychar, yyline, yytext());}
                                        }
        {id}                            {return new Symbol(sym.identificador, yychar, yyline, yytext());}
        {operadores_relacionales}       {if(yytext().equals(">=")){return new Symbol(sym.mayorigual, yychar, yyline, yytext());}
                                        if(yytext().equals("<=")){return new Symbol(sym.menorigual, yychar, yyline, yytext());}
                                        if(yytext().equals("=")){return new Symbol(sym.igual, yychar, yyline, yytext());}
                                        if(yytext().equals(">")){return new Symbol(sym.mayor, yychar, yyline, yytext());}
                                        if(yytext().equals("<")){return new Symbol(sym.menor, yychar, yyline, yytext());}}

        {operadores_aritmeticos}        {if(yytext().equals("+")){return new Symbol(sym.suma, yychar, yyline, yytext());}
                                        if(yytext().equals("-")){return new Symbol(sym.resta, yychar, yyline, yytext());}
                                        if(yytext().equals("*")){return new Symbol(sym.mult, yychar, yyline, yytext());}
                                        if(yytext().equals("/")){return new Symbol(sym.div, yychar, yyline, yytext());}
                                        if(yytext().equals("^")){return new Symbol(sym.potencia, yychar, yyline, yytext());}}

        {textos}                        {return new Symbol(sym.texto_, yychar, yyline, yytext());}

        {digitos}                       {return new Symbol(sym.numero, yychar, yyline, yytext());}

        {espacios}                      {return new Symbol(sym.espacio, yychar, yyline, yytext());}

        {moduler}                       {return new Symbol(sym.module, yychar, yyline, yytext());}

        {caracteres_reservados}         {
                                        if(yytext().equals(".")){return new Symbol(sym.punto, yychar, yyline, yytext());}
                                        if(yytext().equals("\"")){return new Symbol(sym.comillaD, yychar, yyline, yytext());}
                                        if(yytext().equals("\'")){return new Symbol(sym.comillaS, yychar, yyline, yytext());}
                                        if(yytext().equals("(")){return new Symbol(sym.parentesisA, yychar, yyline, yytext());}
                                        if(yytext().equals(")")){return new Symbol(sym.parentesisC, yychar, yyline, yytext());}
                                        if(yytext().equals("{")){return new Symbol(sym.llaveA, yychar, yyline, yytext());}
                                        if(yytext().equals("}")){return new Symbol(sym.llaveC, yychar, yyline, yytext());}
                                        if(yytext().equals(",")){return new Symbol(sym.coma, yychar, yyline, yytext());}
                                        }

        {fin_de_linea}                  {return new Symbol(sym.findelinea, yychar, yyline, yytext());}

        {continuacion_linea}            {return new Symbol(sym.continuaciondelinea, yychar, yyline, yytext());}

        {comentarios}                   {return new Symbol(sym.comentario, yychar, yyline, yytext());}

        .                               {
                                        return new Symbol(sym.error, yychar, yyline, yytext());
                                        
                                        }
}


