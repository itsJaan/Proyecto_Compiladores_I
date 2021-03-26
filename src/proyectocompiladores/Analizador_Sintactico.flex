package proyectocompiladores;
import java_cup.runtime.Symbol;
%%
%public
%unicode
%class Analizador_Sintactico
%type java_cup.runtime.Symbol
%line
%column
%char
%cup
%full


digitos = [0-9]+
id= [a-zA-Z|\_]+[a-zA-Z|\_|0-9]*
operadores_relacionales= [>=|<=|=|<|>]
operadores_aritmeticos = [\+|\-|\*|\/|\^|%]
espacios= [ \t]+
findelinea = [\n\r]+
textos = [\"].+[\"]
comentarios = [\'].+
imports = [I|i][M|m][P|p][O|o][R|r][T|t][S|s]
public = [P|p][U|u][B|b][L|l][I|i][C|c]
module = [M|m][O|o][D|d][U|u][L|l][E|e]
system = [S|s][Y|y][S|s][T|t][E|e][M|m]
dim = [D|d][I|i][M|m]
end = [E|e][N|n][D|d]
if = [I|i][F|f]
byval = [B|b][Y|y][V|v][A|a][L|l]
caracteres_reservados = [\.|\"|\'|\(|\)|\{|\}|,]
continuacion_linea= [\&\_|\_]
Reservadas = [S|s][U|u][B|b]|
             [F|f][O|o][R|r]|
             [E|e][L|l][S|s][E|e][I|i][F|f]|
             [I|i][N|n][T|t][E|e][G|g][E|e][R|r]|
             [B|b][O|o][O|o][L|l][E|e][A|a][N|n]|
             [S|s][T|t][R|r][I|i][N|n][G|g]|
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
             [N|n][U|u][L|l][L|l]|
             [M|m][A|a][I|i][N|n]|
             [S|s][T|t][E|e][P|p]|
             [R|r][E|e][A|a][D|d][L|l][I|i][N|n][E|e]
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%% 



        {comentarios} {return new Symbol(sym.comentario, yyline, yycolumn, yytext());}

        {imports} {return new Symbol(sym.imports, yyline, yycolumn, yytext());}

        {module}  {return new Symbol(sym.Module, yyline, yycolumn, yytext());}

        {system}  {return new Symbol(sym.System_, yyline, yycolumn, yytext());}

        {public}  {return new Symbol(sym.Public_, yyline, yycolumn, yytext());}

        {dim}     {return new Symbol(sym.dim, yyline, yycolumn, yytext());}

        {end}     {return new Symbol(sym.end_, yyline, yycolumn, yytext());}

        {if}      {return new Symbol(sym.if_, yyline, yycolumn, yytext());}

        {byval}   {return new Symbol(sym.byval, yyline, yycolumn, yytext());}
        
        {Reservadas}                    {
                                        if(yytext().equalsIgnoreCase("sub")){return new Symbol(sym.sub, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("for")){return new Symbol(sym.for_, yyline, yycolumn, yytext());}                                   
                                        if(yytext().equalsIgnoreCase("integer")){return new Symbol(sym.integer_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("boolean")){return new Symbol(sym.boolean_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("string")){return new Symbol(sym.string_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("console")){return new Symbol(sym.console_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("writeline")){return new Symbol(sym.writeline, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("as")){return new Symbol(sym.as, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("do")){return new Symbol(sym.do_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("while")){return new Symbol(sym.while_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("struct")){return new Symbol(sym.struct_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("then")){return new Symbol(sym.then, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("else")){return new Symbol(sym.else_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("function")){return new Symbol(sym.function_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("return")){return new Symbol(sym.return_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("next")){return new Symbol(sym.next, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("private")){return new Symbol(sym.private_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("loop")){return new Symbol(sym.loop, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("exit")){return new Symbol(sym.exit, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("until")){return new Symbol(sym.until, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("to")){return new Symbol(sym.to, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("and")){return new Symbol(sym.and, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("or")){return new Symbol(sym.or, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("true")){return new Symbol(sym.true_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("false")){return new Symbol(sym.false_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("like")){return new Symbol(sym.like, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("mod")){return new Symbol(sym.mod, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("int")){return new Symbol(sym.int_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("null")){return new Symbol(sym.null_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("main")){return new Symbol(sym.main_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("step")){return new Symbol(sym.step_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("elseif")){return new Symbol(sym.elseif_, yyline, yycolumn, yytext());}
                                        if(yytext().equalsIgnoreCase("readline")){return new Symbol(sym.readline, yyline, yycolumn, yytext());}
                                        }

        {id}                            {return new Symbol(sym.identificador, yyline, yycolumn, yytext());}

        {operadores_relacionales}       {if(yytext().equals(">=")){return new Symbol(sym.mayorigual, yyline, yycolumn, yytext());}
                                        if(yytext().equals("<=")){return new Symbol(sym.menorigual, yyline, yycolumn, yytext());}
                                        if(yytext().equals("=")){return new Symbol(sym.igual, yyline, yycolumn, yytext());}
                                        if(yytext().equals(">")){return new Symbol(sym.mayor, yyline, yycolumn, yytext());}
                                        if(yytext().equals("<")){return new Symbol(sym.menor, yyline, yycolumn, yytext());}
                                        }

        {operadores_aritmeticos}        {if(yytext().equals("+")){return new Symbol(sym.suma, yyline, yycolumn, yytext());}
                                        if(yytext().equals("-")){return new Symbol(sym.resta, yyline, yycolumn, yytext());}
                                        if(yytext().equals("*")){return new Symbol(sym.mult, yyline, yycolumn, yytext());}
                                        if(yytext().equals("/")){return new Symbol(sym.div, yyline, yycolumn, yytext());}
                                        if(yytext().equals("^")){return new Symbol(sym.potencia, yyline, yycolumn, yytext());}
                                        if(yytext().equals("%")){return new Symbol(sym.mod_, yyline, yycolumn, yytext());}
                                        }

        {textos}                        {return new Symbol(sym.texto_, yyline, yycolumn, yytext());}

        {digitos}                       {return new Symbol(sym.numero, yyline, yycolumn, yytext());}

        

        {caracteres_reservados}         {
                                        if(yytext().equals(".")){return new Symbol(sym.punto, yyline, yycolumn, yytext());}
                                        if(yytext().equals("\"")){return new Symbol(sym.comillaD, yyline, yycolumn, yytext());}
                                        if(yytext().equals("\'")){return new Symbol(sym.comillaS, yyline, yycolumn, yytext());}
                                        if(yytext().equals("(")){return new Symbol(sym.parentesisA, yyline, yycolumn, yytext());}
                                        if(yytext().equals(")")){return new Symbol(sym.parentesisC, yyline, yycolumn, yytext());}
                                        if(yytext().equals("{")){return new Symbol(sym.llaveA, yyline, yycolumn, yytext());}
                                        if(yytext().equals("}")){return new Symbol(sym.llaveC, yyline, yycolumn, yytext());}
                                        if(yytext().equals(",")){return new Symbol(sym.coma_, yyline, yycolumn, yytext());}
                                        }

        {espacios}                      {/*Ignore*/}

        {continuacion_linea}            {return new Symbol(sym.continuaciondelinea, yyline, yycolumn, yytext());}

        {findelinea}                    {return new Symbol(sym.findelinea, yyline, yycolumn, yytext());}

        
        .                               {
                                        return new Symbol(sym.error, yyline, yycolumn, yytext());
                                        
                                        }



