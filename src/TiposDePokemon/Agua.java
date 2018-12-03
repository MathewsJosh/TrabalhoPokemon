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
public class Agua
{
    protected int ataqueBasico;
    protected int ataqueEspecial;
    public static int qualAtaque;

    protected int qtdAtaques = 5;                                               //4Agua+1basico

    public Agua(int ataqueBasico, int ataqueEspecial)
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
    public int escolheAtaqueAgua()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                             //Ataque basico
                return basicAttack();
            case 1:                                                             //Ataques especiais tipo Agua
                return bubble();
            case 2:
                if (prob <= 75)
                {
                    return dive();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return hydroCannon();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return waterPulse();
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

    Random attack = new Random();
    int dano;

    /**
     * Ataques básico + especiais
     *
     * @return
     */
    public int basicAttack()
    {
        dano = attack.nextInt(this.ataqueBasico);
        return dano;
    }

    public int bubble()
    {
        dano = attack.nextInt(this.ataqueEspecial - 25);
        return dano;
    }

    public int dive()
    {
        dano = attack.nextInt(((this.ataqueEspecial - 5) + 1) + 5);
        return dano;
    }

    public int hydroCannon()
    {
        dano = attack.nextInt((this.ataqueEspecial - 10) + 1) + 10;
        return dano;
    }

    public int waterPulse()
    {
        return this.ataqueEspecial;
    }

}
