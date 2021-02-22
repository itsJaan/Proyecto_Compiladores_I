package proyectocompiladores;
import static proyectocompiladores.Tokens.*;
%%
%unicode
%class Analizador_Lexico
%type Tokens
%line
%column

digitos = [0-9]+
id= [a-zA-Z|\_]+[a-zA-Z|\_|0-9]*
operadores_relacionales= [>=|<=|=|<|>]
moduler=Mod
operadores_aritmeticos = [\+|-|\*|\\|\^]
espacios= [ \t\s]+
textos = [\"].+[\"]
caracteres_reservados = [\.|\"|\']
fin_de_linea = [\n]
continuacion_linea= [\&\_|\_]
Reservadas = Imports|
             Public|
             Module|
             Sub|
             for|
             if|
             Dim|
             End|
             Integer|
             Boolean|
             String|
             System|
             Console|
             WriteLine|
             As|
             Do|
             While|
             Struct|
             Then|
             Else|
             Function|
             Return|
             Next|
             Private|
             Loop|
             Exit|
             Until|
             To|
             And|
             Or|
             True|
             False|
             Like|
             Mod|
             Integer1|
             Integer2|
             Integer4|
             Int|
             Null
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
        .                               {return ERROR;}
}