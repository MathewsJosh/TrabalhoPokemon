/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDePokemon;

import java.util.Random;

/**
 *
 * @author Mathews
 */
public class Veneno
{
    protected int ataqueBasico;
    protected int ataqueEspecial;
    public static int qualAtaque;

    protected int qtdAtaques = 5;                                 //4Veneno+1basico

    public Veneno(int ataqueBasico, int ataqueEspecial)
    {
        this.ataqueBasico = ataqueBasico;
        this.ataqueEspecial = ataqueEspecial;
    }

    /**
     * FUNÇÃO AUXILIAR Define qual ataque vai ser de forma randomica
     *
     * @return
     */
    public int defineAtaque1()
    {
        Random defineAtaque = new Random();
        qualAtaque = defineAtaque.nextInt(qtdAtaques - 1);
        return qualAtaque;
    }

    /**
     * Método atacar() seleciona o ataque de acordo com a possibilidade do mesmo
     * ocorrer
     *
     * @author Mathews
     * @return
     */
    public int escolheAtaqueVeneno()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                            //Ataque Basico
                return basicAttack();
            case 1:                                                             //Ataques do tipo Veneno
                return acid();
            case 2:
                if (prob <= 75)
                {
                    return poisonSting();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return SludgeWave();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return toxic();
                }
                else
                {
                    return basicAttack();
                }

            default:
                System.out.println("Erro! Array fora dos Limites");
                return basicAttack();
        }
    }
    /**
     * Ataques básico + especiais
     *
     * @return
     */
    Random attack = new Random();
    int dano;

    public int basicAttack()
    {
        dano = attack.nextInt(this.ataqueBasico);
        return dano;
    }

    public int acid()
    {
        dano = attack.nextInt(this.ataqueEspecial - 80);
        return dano;
    }

    public int poisonSting()
    {
        dano = attack.nextInt((this.ataqueEspecial - 80) + 1) + 80;
        return dano;
    }

    public int SludgeWave()
    {
        dano = attack.nextInt((this.ataqueEspecial - 80) + 1) + 80;
        return dano;
    }

    public int toxic()
    {
        return this.ataqueEspecial;
    }

}
