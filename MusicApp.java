package be.intecbrussel.hoofdstuk14.opdracht1;

public class MusicApp
{
    public static void main(String[] args)
    {
        Musician aMusician = new Musician();
        aMusician.play();

        Musician.Instrument monAutreInstrument = aMusician.new Instrument();
        monAutreInstrument.makeSound();
    }
}
