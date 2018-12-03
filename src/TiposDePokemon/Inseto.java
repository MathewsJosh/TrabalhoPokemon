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
public class Inseto
{
    protected int ataqueBasico;
    protected int ataqueEspecial;
    public static int qualAtaque;

    protected int qtdAtaques = 5;                                               //4Inseto+1basico

    Random attack = new Random();
    int dano;

    public Inseto(int ataqueBasico, int ataqueEspecial)
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
    public int escolheAtaqueInseto()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                             //Ataque basico
                return basicAttack();
            case 1:                                                             //Ataques especiais tipo Inseto
                return bugBuzz();
            case 2:
                if (prob <= 75)
                {
                    return megahorn();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return signalBeam();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return xScissor();
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
    public int basicAttack()
    {
        dano = attack.nextInt(this.ataqueBasico);
        return dano;
    }

    public int bugBuzz()
    {
        dano = attack.nextInt((this.ataqueEspecial - 30));
        return dano;
    }

    public int megahorn()
    {
        dano = attack.nextInt((this.ataqueEspecial - 10) + 1) + 10;
        return dano;
    }

    public int signalBeam()
    {
        dano = attack.nextInt((this.ataqueEspecial - 20) + 1) + 20;
        return dano;
    }

    public int xScissor()
    {
        return this.ataqueEspecial;
    }

}
