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
public class Zubat
{
    protected String nome = "Zubat";
    protected float peso = 7.5f;
    protected String som = "ZubatSound";

    protected int nivel = 0;
    protected int xp = 0;
    protected int qtdAtaques = 5;

    public int hp = 190;
    protected int ataqueBasico = 85;
    protected int defesaBasica = 67;
    protected int ataqueEspecial = 58;
    protected int defesaEspecial = 76;
    protected int velocidade = 103;

    Random attack = new Random();
    protected int dano;

    public Zubat()
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

    Veneno v = new Veneno(ataqueBasico, ataqueEspecial);

    public int atacar()
    {
        dano = v.escolheAtaqueVeneno();
        return dano;

    }

    public String qualAtaque()
    {
        int x = v.qualAtaque;
        switch (x)
        {
            case 0:
                return "<br>Ataque Básico!";
            case 1:
                return "<br>Ataque do tipo Veneno!  ==> " + "Ácido!";
            case 2:
                return "<br>Ataque do tipo Veneno!  ==> " + "Espinhos venenosos!";
            case 3:
                return "<br>Ataque do tipo Veneno!  ==> " + "Onda Tóxica!";
            case 4:
                return "<br>Ataque do tipo Veneno!  ==> " + "Fumaça venenosa! - ULTIMATE";
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
