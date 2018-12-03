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
public class Grama
{
    protected int ataqueBasico;
    protected int ataqueEspecial;
    public static int qualAtaque;

    protected int qtdAtaques = 5;                                 //4grama+1basico

    public Grama(int ataqueBasico, int ataqueEspecial)
    {
        this.ataqueBasico = ataqueBasico;
        this.ataqueEspecial = ataqueEspecial;
    }

    Random attack = new Random();
    protected int dano;

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
     * Função que definitivamente ataca Ela chama a auxiliar defineAtaque e
     * recebe um valor aleatório que define qual será o ataque a partir do
     * switch
     * @return
     */
    public int escolheAtaqueGrama()
    {
        Random possibilidade = new Random();
        int prob = possibilidade.nextInt(101);

        switch (defineAtaque1())
        {
            case 0:                                                             //Ataque basico
                return basicAttack();
            case 1:                                                             //Ataques especiais tipo Grama
                return seedBomb();
            case 2:
                if (prob <= 75)
                {
                    return solarBeam();
                }
                else
                {
                    return basicAttack();
                }
            case 3:
                if (prob <= 50)
                {
                    return leafBlade();
                }
                else
                {
                    return basicAttack();
                }
            case 4:                                                             //Ultimate
                if (prob <= 25)
                {
                    return megaDrain();
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

    public int basicAttack()
    {
        dano = attack.nextInt(this.ataqueBasico);
        return dano;
    }

    public int seedBomb()
    {
        dano = attack.nextInt(this.ataqueEspecial - 80);
        return dano;
    }

    public int solarBeam()
    {
        dano = attack.nextInt(((this.ataqueEspecial - 40) - 40) + 1) + 40;
        return dano;
    }

    public int leafBlade()
    {
        dano = attack.nextInt((this.ataqueEspecial - 80) + 1) + 80;
        return dano;
    }

    public int megaDrain()
    {
        return this.ataqueEspecial;
    }

}
