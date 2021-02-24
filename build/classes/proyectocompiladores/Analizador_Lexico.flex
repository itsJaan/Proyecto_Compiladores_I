package proyectocompiladores;
import static proyectocompiladores.Tokens.*;
%%
%unicode
%class Analizador_Lexico
%type Tokens
%line
%column

digitos = -?[0-9]+
id= [a-zA-Z|\_]+[a-zA-Z|\_|0-9]*
operadores_relacionales= [>=|<=|=|<|>]
moduler=Mod
operadores_aritmeticos = [\+|-|\*|\\|\^]
espacios= [ \t\s]+
textos = [\"].+[\"]
comentarios = [\'].+
caracteres_reservados = [\.|\"|\'|\(|\)|\{|\}]
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
             [I|i][N|n][T|t][E|e][G|g][E|e][R|r]1|
             [I|i][N|n][T|t][E|e][G|g][E|e][R|r]2|
             [I|i][N|n][T|t][E|e][G|g][E|e][R|r]4|
             [I|i][N|n][T|t]|
             [N|n][U|u][L|l][L|l]
%{
    public String lexema;
%}
%% 



<YYINITIAL>{
        
        {Reservadas}                    {return reservadas;}
        {id}                            {return identificador;}
        {operadores_relacionales}       {return operadorRelacional;}
        {operadores_aritmeticos}        {return operadorAritmetico;}
        {textos}                        {return texto;}
        {digitos}                       {return numero;}
        {espacios}                      {return espacio;}
        {moduler}                       {return modulo;}
        {caracteres_reservados}         {return caracterReservado;}
        {fin_de_linea}                  {return findelinea;}
        {continuacion_linea}            {return continuacionlinea;}
        {comentarios}                   {return comentario}
        .                               {return ERROR;}
}