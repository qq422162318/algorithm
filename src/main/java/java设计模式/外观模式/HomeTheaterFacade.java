package java设计模式.外观模式;

public class HomeTheaterFacade {
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private DVDPlayer dvdPlayer;
    private Screen screen;
    public HomeTheaterFacade() {
       super();
       this.dvdPlayer=DVDPlayer.getInstance();
       this.popcorn=Popcorn.getInstance();
       this.stereo=Stereo.getInstance();
       this.projector=Projector.getInstance();
       this.screen=Screen.getInstance();
       this.dvdPlayer=DVDPlayer.getInstance();
       this.theaterLight=TheaterLight.getInstance();
    }
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }
    public void play(){
        dvdPlayer.play();
    }
    public void end(){
        popcorn.off();
        theaterLight.off();
        screen.down();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

    public static void main(String[] args) {

    }
}
