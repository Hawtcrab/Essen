package main.game.gui.screens;

public class LocationScreen extends BaseScreen {

    public LocationScreen() {
        super("/textures/backgrounds/main.png");
    }
    public LocationScreen(String imagePath) {
        super(imagePath);
    }


    @Override
    protected void paintElements() {
        super.paintElements();

        var action = super.prepareTextPane(130, 370,140,140);
        action.setText("Mundane");
        super.add(action);

        var action2 = super.prepareTextPane(280, 370,140,140);
        action2.setText("Connection");
        super.add(action2);

        var action3 = super.prepareTextPane(430, 370,140,140);
        action3.setText("Opportunity");
        super.add(action3);
    }
}
