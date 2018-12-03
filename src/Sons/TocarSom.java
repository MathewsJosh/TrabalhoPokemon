/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sons;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JFrame;

/** Classe para tocar o som do pokemon
 *
 * @author Mathews
 */
public class TocarSom extends JFrame
{
    public TocarSom()
    {
        
    }
    /** Quando chamada, essa função executa o som do pokemon
     * 
     * @param nomeDoAudio 
     */
    public void play(String nomeDoAudio)
    {
    URL url = TocarSom.class.getResource(nomeDoAudio+".wav");
    AudioClip audio = Applet.newAudioClip(url);
    audio.play();
    }
}
