interface DigitalGame {
    void playDigital();
}

class ModernConsole {
    public void runGame(DigitalGame game) {
        game.playDigital();
    }
}

class RetroCartridge {
    public void insertCartridge() {
        System.out.println("Loading retro game from cartridge.........................");
    }
}

class CartridgeAdapter implements DigitalGame {
    private final RetroCartridge cartridge;

    public CartridgeAdapter(RetroCartridge cartridge) {
        this.cartridge = cartridge;
    }

    @Override
    public void playDigital() {
        cartridge.insertCartridge();
    }
}

public class Main99 {
    public static void main(String[] args) {
        ModernConsole console = new ModernConsole();
        RetroCartridge retroGame = new RetroCartridge();

        DigitalGame adaptedGame = new CartridgeAdapter(retroGame);
        console.runGame(adaptedGame);
    }
}