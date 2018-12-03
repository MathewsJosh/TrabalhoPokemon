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
public class Terra
{
    protected int ataqueBasico;
    protected int ataqueEspecial;
    public static int qualAtaque;

    protected int qtdAtaques = 5;                                               //4terra+1basico

    public Terra(int ataqueBasico, int ataqueEspecial)
    {
        this.ataqueBasico=ataqueBasico;
        this.ataqueEspecial=ataqueEspecial;
    }
    
     /**
     * FUNÇÃO AUXILIAR Define qual ataque vai ser de forma randomica
     *
     * @return
     */
    public int defineAtaque1()
    {
        Random defineAtaque = new Random();
        qualAtaque = defineAtaque.nextInt(qtdAtaques-1);
        return qualAtaque;
    }
    
    /**
     * Método atacar() seleciona o ataque de acordo com a possibilidade do mesmo
     * ocorrer
     *
     * @author Mathews
     * @return
     */
    public int escolheAtaqueTerra()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                             //Ataque Basico
                return basicAttack();
            case 1:                                                             //Ataques do tipo Terra
                return sandAttack();
            case 2:
                if (prob <= 75)
                {
                    return mudSlap();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return magnitude();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return bulldoze();
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
    Random attack = new Random();
    int dano;

    public int basicAttack()
    {
        dano = attack.nextInt(this.ataqueBasico);
        return dano;
    }

    public int sandAttack()
    {
        dano = attack.nextInt(this.ataqueEspecial - 52);
        return dano;
    }

    public int mudSlap()
    {
        dano = attack.nextInt((this.ataqueEspecial - 15) + 1) + 15;
        return dano;
    }

    public int magnitude()
    {
        dano = attack.nextInt((this.ataqueEspecial - 45) + 1) + 45;
        return dano;
    }

    public int bulldoze()
    {
        return this.ataqueEspecial;
    }
}
