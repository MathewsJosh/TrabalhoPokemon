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
public class Fogo
{
    protected int ataqueBasico;
    protected int ataqueEspecial;
    public static int qualAtaque;

    protected int qtdAtaques = 5;                                               //4Fogo+1Basico

    Random attack = new Random();
    int dano;

    public Fogo(int ataqueBasico, int ataqueEspecial)
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
        int qualAtaque = defineAtaque.nextInt(qtdAtaques - 1);
        //System.out.println(qualAtaque);
        return qualAtaque;
    }

    /**
     * Método atacar() seleciona o ataque de acordo com a possibilidade do mesmo
     * ocorrer
     *
     * @author Mathews
     * @return
     */
    public int escolheAtaqueFogo()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                             //Ataque basico
                return basicAttack();
            case 1:                                                             //Ataques especiais tipo Fogo
                return ember();
            case 2:
                if (prob <= 75)
                {
                    return fireBlast();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return fireSpin();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return inferno();
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

    /**Ataques básico + especiais
     * 
     * @return 
     */
    public int basicAttack()
    {
        dano = attack.nextInt(this.ataqueBasico);
        return dano;
    }

    public int ember()
    {
        dano = attack.nextInt(this.ataqueEspecial - 82);
        return dano;
    }

    public int fireBlast()
    {
        dano = attack.nextInt((this.ataqueEspecial - 30) + 1) + 30;
        return dano;
    }

    public int fireSpin()
    {
        dano = attack.nextInt((this.ataqueEspecial - 70) + 1) + 70;
        return dano;
    }

    public int inferno()
    {
        return this.ataqueEspecial;
    }
}
