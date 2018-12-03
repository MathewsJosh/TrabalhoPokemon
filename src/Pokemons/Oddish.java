/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import Sons.TocarSom;
import TiposDePokemon.*;
import java.util.Random;

/**
 *
 * @author Mathews
 */
public class Oddish                            
{
    protected String nome = "Oddish";
    protected float peso = 5.4f;
    protected String som = "OddishSound";

    protected int nivel = 0;
    protected int xp = 0;
    protected int qtdAtaques = 5;

    public int hp = 200;
    protected int ataqueBasico = 94;
    protected int defesaBasica = 103;
    protected int ataqueEspecial = 139;
    protected int defesaEspecial = 121;
    protected int velocidade = 58;

    Random attack = new Random();
    protected int dano;

    public Oddish()
    {
    }
    
    
    Random qualDef = new Random();
    Random defesa = new Random();
    int opcao=qualDef.nextInt(2);
    int defB=defesa.nextInt(defesaBasica);
    int defE=defesa.nextInt(defesaEspecial);
    public void sofrerDano(int dano)
    {
        if(opcao==0)              //defesa especial
        {
            this.hp=this.hp-(dano-defE);
        }
        else                    //defesa basica
            this.hp=this.hp-(dano-defB);
    }

    public void emitesom()
    {
        TocarSom som1 = new TocarSom();
        som1.play(som);
    }

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

    public int atacar()
    {
        dano = g.escolheAtaqueGrama();
        return dano;

    }

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
                return "<br>Ataque do tipo Grama!  ==> " + "Mega Dreno! - ULTIMATE";
        }
        return "erro!";
    }

    /**Getters e Setters
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

    public String getSom()
    {
        return som;
    }

    public void setSom(String som)
    {
        this.som = som;
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

    public int getQtdAtaques()
    {
        return qtdAtaques;
    }

    public void setQtdAtaques(int qtdAtaques)
    {
        this.qtdAtaques = qtdAtaques;
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

    public void setAtaqueBasico(int ataqueBasico)
    {
        this.ataqueBasico = ataqueBasico;
    }

    public int getDefesaBasica()
    {
        return defesaBasica;
    }

    public void setDefesaBasica(int defesaBasica)
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

    public int getDano()
    {
        return dano;
    }

    public void setDano(int dano)
    {
        this.dano = dano;
    }

    
}
