package proyectocompiladores;
import static proyectocompiladores.Tokens.*;
%%
%public
%unicode
%class Analizador_Lexico
%type Tokens
%line
%column

digitos = -?[0-9]+
id= [a-zA-Z|\_]+[a-zA-Z|\_|0-9]*
operadores_relacionales= [>=|<=|=|<|>]
moduler=Mod
operadores_aritmeticos = [\+|-|\*|\/|\^]
espacios= [ \t\r]+
textos = [\"].+[\"]
comentarios = [\'].+
caracteres_reservados = [\.|\"|\'|\(|\)|\{|\}|\,]
fin_de_linea = [\n\r]+
continuacion_linea= [\&\_|\_]
Reservadas = [I|i][M|m][P|p][O|o][R|r][T|t][S|s]|
             [P|p][U|u][B|b][L|l][I|i][C|c]|
             [M|m][O|o][D|d][U|u][L|l][E|e]|
             [S|s][U|u][B|b]|
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
             [N|n][U|u][L|l][L|l]|
             [M|m][A|a][I|i][N|n]|
             [S|s][T|t][E|e][P|p]
%{
    public String lexema;
    int esEnter = 0;
    public int getLine(){return (yyline + 1);}
    public int getColumn(){return (yycolumn +1);}
%}
%% 



<YYINITIAL>{
        
        {Reservadas}                    {esEnter =0;
                                        if(yytext().equalsIgnoreCase("if")){return if_;}
                                        if(yytext().equalsIgnoreCase("imports")){return imports;}
                                        if(yytext().equalsIgnoreCase("public")){return public_;}
                                        if(yytext().equalsIgnoreCase("module")){return module;}
                                        if(yytext().equalsIgnoreCase("sub")){return sub;}
                                        if(yytext().equalsIgnoreCase("for")){return for_;}
                                        if(yytext().equalsIgnoreCase("dim")){return dim;}
                                        if(yytext().equalsIgnoreCase("end")){return end_;}
                                        if(yytext().equalsIgnoreCase("integer")){return integer_;}
                                        if(yytext().equalsIgnoreCase("boolean")){return boolean_;}
                                        if(yytext().equalsIgnoreCase("string")){return string_;}
                                        if(yytext().equalsIgnoreCase("system")){return system_;}
                                        if(yytext().equalsIgnoreCase("console")){return console_;}
                                        if(yytext().equalsIgnoreCase("writeline")){return writeline;}
                                        if(yytext().equalsIgnoreCase("as")){return as;}
                                        if(yytext().equalsIgnoreCase("do")){return do_;}
                                        if(yytext().equalsIgnoreCase("while")){return while_;}
                                        if(yytext().equalsIgnoreCase("struct")){return struct;}
                                        if(yytext().equalsIgnoreCase("then")){return then;}
                                        if(yytext().equalsIgnoreCase("else")){return else_;}
                                        if(yytext().equalsIgnoreCase("function")){return function_;}
                                        if(yytext().equalsIgnoreCase("return")){return return_;}
                                        if(yytext().equalsIgnoreCase("next")){return next;}
                                        if(yytext().equalsIgnoreCase("private")){return private_;}
                                        if(yytext().equalsIgnoreCase("loop")){return loop;}
                                        if(yytext().equalsIgnoreCase("exit")){return exit;}
                                        if(yytext().equalsIgnoreCase("until")){return until;}
                                        if(yytext().equalsIgnoreCase("to")){return to;}
                                        if(yytext().equalsIgnoreCase("and")){return and;}
                                        if(yytext().equalsIgnoreCase("or")){return or;}
                                        if(yytext().equalsIgnoreCase("true")){return true_;}
                                        if(yytext().equalsIgnoreCase("false")){return false_;}
                                        if(yytext().equalsIgnoreCase("like")){return like;}
                                        if(yytext().equalsIgnoreCase("mod")){return mod;}
                                        if(yytext().equalsIgnoreCase("int")){return  int_;}
                                        if(yytext().equalsIgnoreCase("null")){return null_;}
                                        if(yytext().equalsIgnoreCase("main")){return main_;}
                                        if(yytext().equalsIgnoreCase("step")){return step_;}
                                        }

        {id}                            {esEnter =0;return identificador;}

        {operadores_relacionales}       {esEnter =0;
                                        if(yytext().equals(">=")){return mayorigual;}
                                        if(yytext().equals("<=")){return menorigual;}
                                        if(yytext().equals("=")){return igual;}
                                        if(yytext().equals(">")){return mayor;}
                                        if(yytext().equals("<")){return menor;}}

        {operadores_aritmeticos}        {esEnter =0;
                                        if(yytext().equals("+")){return suma;}
                                        if(yytext().equals("-")){return resta;}
                                        if(yytext().equals("*")){return mult;}
                                        if(yytext().equals("/")){return div;}
                                        if(yytext().equals("^")){return potencia;}
                                        }

        {textos}                        {esEnter =0;return texto_;}

        {digitos}                       {esEnter =0;return numero;}

        {espacios}                      {esEnter =0;return espacio;}

        {moduler}                       {esEnter =0;return modulo;}

        {caracteres_reservados}         {esEnter =0;
                                        if(yytext().equals(".")){return punto;}
                                        if(yytext().equals("\"")){return comillaD;}
                                        if(yytext().equals("\'")){return comillaS;}
                                        if(yytext().equals("(")){return parentesisA;}
                                        if(yytext().equals(")")){return parentesisC;}
                                        if(yytext().equals("{")){return llaveA;}
                                        if(yytext().equals("}")){return llaveC;}
                                        if(yytext().equals(",")){return coma;}
                                        }

        {fin_de_linea}                  {esEnter++; if(esEnter==1){return findelinea;}}

        {continuacion_linea}            {esEnter =0;return continuaciondelinea;}

        {comentarios}                   {esEnter =0;return comentario;}

        .                               {esEnter =0;
                                        return error_;
                                        
                                        }
}

