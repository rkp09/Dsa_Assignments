package _12_opp.InterfaceDemo;

public class PrettyCar {
    private Engine engine;
    private Braker brake = new Braker();
    private MediaPlayer player = new MediaPlayer();

    public PrettyCar() {
        this.engine = new PowerEngine();
    }

    public void carStart(){
        engine.start();
    }

    public void carStop(){
        engine.stop();
    }

    public void carAccelerator(){
        engine.accelerate();
    }

    public void brakeCar(){
        brake.brake();
    }

    public void startPlayer(){
        player.start();
    }

    public void stopPlayer(){
        player.stop();
    }

    public void changeEngine(){
        this.engine = new ElectricEngine();
    }
}
