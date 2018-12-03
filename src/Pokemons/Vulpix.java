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
public class Vulpix
{
    protected String nome = "Vulpix";
    protected float peso = 9.9f;
    protected String som = "VulpixSound";

    protected int nivel = 0;
    protected int xp = 0;
    protected int qtdAtaques = 5;

    public int hp = 186;
    protected int ataqueBasico = 78;
    protected int defesaBasica = 76;
    protected int ataqueEspecial = 94;
    protected int defesaEspecial = 121;
    protected int velocidade = 121;

    Random attack = new Random();
    protected int dano;

    public Vulpix()
    {
    }

    Random qualDef = new Random();
    Random defesa = new Random();
    int opcao = qualDef.nextInt(2);
    int defB = defesa.nextInt(defesaBasica);
    int defE = defesa.nextInt(defesaEspecial);

    public void sofrerDano(int dano)
    {
        if (opcao == 0)              //defesa especial
        {
            this.hp = this.hp - (dano - defE);
        }
        else                    //defesa basica
        {
            this.hp = this.hp - (dano - defB);
        }
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
                + "<br>Nome: " + getNome()
                + "<br>Peso: " + getPeso()
                + "<br>Nível: " + getNivel()
                + "<br>Xp Atual: " + getXp()
                + "<br>HP: " + getHp()
                + "<br>Ataque: " + getAtaqueBasico()
                + "<br>Defesa: " + getDefesaBasica()
                + "<br>Ataque Especial: " + getAtaqueEspecial()
                + "<br>Defesa Especial: " + getDefesaEspecial()
                + "<br>Velocidade: " + getVelocidade() + "\n";
    }

    Fogo f = new Fogo(ataqueBasico, ataqueEspecial);

    public int atacar()
    {
        dano = f.escolheAtaqueFogo();
        return dano;

    }

    public String qualAtaque()
    {
        int x = f.qualAtaque;
        switch (x)
        {
            case 0:
                return "<br>Ataque Básico!";
            case 1:
                return "<br>Ataque do tipo Fogo!  ==> " + "Brasa!";
            case 2:
                return "<br>Ataque do tipo Fogo!  ==> " + "Explosão de Fogo!";
            case 3:
                return "<br>Ataque do tipo Fogo!  ==> " + "Redemoinho de Fogo!";
            case 4:
                return "<br>Ataque do tipo Fogo!  ==> " + "Inferno! - ULTIMATE";
        }
        return "erro!";
    }

    /**
     * GETTERS E SETTERS
     *
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
