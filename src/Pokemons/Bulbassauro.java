/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import Sons.*;
import TiposDePokemon.*;
import java.util.Random;

/**
 *
 * @author Mathews
 */
public class Bulbassauro                            //Tipo Grama
{

    protected String nome = "Bulbassauro";
    protected float peso = 6.9f;
    protected String som = "BulbasaurSound";

    protected int nivel = 0;
    protected int xp = 0;
    protected int qtdAtaques = 5;

    public int hp = 200;
    protected int ataqueBasico = 92;
    protected int defesaBasica = 92;
    protected int ataqueEspecial = 121;
    protected int defesaEspecial = 121;
    protected int velocidade = 85;

    Random attack = new Random();
    protected int dano;

    public Bulbassauro()
    {
    }

    Random qualDef = new Random();
    Random defesa = new Random();
    int opcao=qualDef.nextInt(2);
    int defB=defesa.nextInt(defesaBasica);
    int defE=defesa.nextInt(defesaEspecial);
    
    /**Classe que define o Dano que  o pokemon sofre
     * 
     * @param dano 
     */
    public void sofrerDano(int dano)
    {
        if(opcao==0)              //defesa especial
        {
            this.hp=this.hp-(dano-20);
        }
        else                    //defesa basica
            this.hp=this.hp-(dano-30);
    }
    
    /**Classe que chama o audio para ser executado
     * 
     */
    public void emitesom()
    {
        TocarSom som1 = new TocarSom();
        som1.play(som);
    }

    /**Apresenta os dados do pokemon
     * 
     * @return 
     */
    public String apresentar()
    {
        emitesom();
        return "===========Informações do Pokemon===========<br>"
                + "<br>\n Nome: " + getNome()
                + "<br>\n Peso: " + getPeso()
                + "<br>\n Nível: " + getNivel()
                + "<br>\n Xp Atual: " + getXp()
                + "<br>\n HP: " + getHp()
                + "<br>\n Ataque: " + getAtaqueBasico()
                + "<br>\n Defesa: " + getDefesaBasica()
                + "<br>\n Ataque Especial: " + getAtaqueEspecial()
                + "<br>\n Defesa Especial: " + getDefesaEspecial()
                + "<br>\n Velocidade: " + getVelocidade() + "\n";
    }

    Grama g = new Grama(ataqueBasico, ataqueEspecial);

    /**Seleciona um ataque e retorna seu dano
     * 
     * @return 
     */
    public int atacar()
    {
        dano = g.escolheAtaqueGrama();
        return dano;

    }

    /**
     * Define de acordo com 1/4 de chance de sair determinado ataque
     *
     * @return
     */
    public String qualAtaque()
    {
        int x = g.qualAtaque;
        switch (x)
        {
            case 0:
                return "Ataque Básico!";
            case 1:
                return "Ataque do tipo Grama!  ==> " + "Bomba de Sementes!";
            case 2:
                return "Ataque do tipo Grama!  ==> " + "Raio Solar!";
            case 3:
                return "Ataque do tipo Grama!  ==> " + "Folhas navalha!";
            case 4:
                return "Ataque do tipo Grama!  ==> " + "Mega Dreno! - ULTIMATE";
        }
        return "erro!";
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

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public int getXp()
    {
        return xp;
    }

    public void setXp(int xp)
    {
        this.xp = xp;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getAtaqueBasico()
    {
        return ataqueBasico;
    }

    public void setAtaqueBasico(int ataque)
    {
        this.ataqueBasico = ataqueBasico;
    }

    public int getDefesaBasica()
    {
        return defesaBasica;
    }

    public void setDefesaBasica(int defesa)
    {
        this.defesaBasica = defesaBasica;
    }

    public int getAtaqueEspecial()
    {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial)
    {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefesaEspecial()
    {
        return defesaEspecial;
    }

    public void setDefesaEspecial(int defesaEspecial)
    {
        this.defesaEspecial = defesaEspecial;
    }

    public int getVelocidade()
    {
        return velocidade;
    }

    public void setVelocidade(int velocidade)
    {
        this.velocidade = velocidade;
    }

}
