/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treinadores;

import java.util.Collection;

/**
 *
 * @author Mathews
 */
public class Renan
{
    protected String nome = "Renan";
    protected int idade = 19;
    protected String genero = "Masculino";
    protected int insignias = 5;
    protected int numPokemons = 3;
    protected int nivel = 4;
    protected int xpT = 55;

    //protected Collection pokes;
    public Renan()
    {
    }

    /**Apresenta todos os dados do treinador atual
     * 
     * @return 
     */
    public String apresentaTreinador()
    {
        return "Dados do treinador escolhido:"
                + "<br><br>Treinador: " + getNome()
                + "<br>Idade: " + getIdade()
                + "<br>Gênero: " + getGenero()
                + "<br>Insignias: " + getInsignias()
                + "<br>Número de Pokemons: " + getNumPokemons()
                + "<br>Nivel do Treinador: " + getNivel()
                + "<br>XP Atual: " + getXpT();
    }

    /**
     * Quantos pokemons o treinador pode ganhar a cada vitoria?
     *
     * @param x
     */
    public void GanharPokemons(int x)
    {
        this.numPokemons = this.numPokemons + x;
    }

    /**
     * A cada 100 de xp, sobe de nivel. Essa classe funciona em conjunto com a
     * ganharXpT
     *
     * @param n
     */
    protected void subirDeNivel(int n)                     //A cada 100 de xp, sobe de nivel
    {
        this.nivel = nivel + n;
    }

    /**
     * Ganhar um quantidade de XP Se a soma do xp atual e xp do parametro forem
     * maior que 100, Treinador sobe de nivel O valor de XP passado como
     * parâmetro deverá ser random entre 0 e 100
     *
     * @param xp
     */
    public void ganharXpT(int xp)
    {
        int soma = xpT + xp;
        if (soma < 100)
        {
            this.xpT = soma;
        }
        else
        {
            int i,j=soma/100;
            this.xpT=soma;
            for(i=0;i<j;i++)
                this.xpT = this.xpT - 100;
            subirDeNivel(xp / 100);
            System.out.println("\n=>Você subiu de nivel!!!!");
            System.out.println("=>Xp Atual: " + getXpT());
            System.out.println("=>Level Atual: " + getNivel());
        }

    }
    
    
    
    
    

    /**
     * GETTERS E SETTERS
     *
     * @return
     */
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public int getInsignias()
    {
        return insignias;
    }

    public void setInsignias(int insignias)
    {
        this.insignias = insignias;
    }

    public int getNumPokemons()
    {
        return numPokemons;
    }

    public void setNumPokemons(int numPokemons)
    {
        this.numPokemons = numPokemons;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public int getXpT()
    {
        return xpT;
    }

    public void setXpT(int xpT)
    {
        this.xpT = xpT;
    }

}
