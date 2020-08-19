package be.intecbrussel.hoofdstuk14.opdracht1;

public class Musician
{
    public class Instrument
    {
        public void makeSound()
        {
            System.out.println("Sound of music.");
        }
    }

    public void play()
    {
        Instrument monInstrument = new Instrument();
        monInstrument.makeSound();
    }
}
